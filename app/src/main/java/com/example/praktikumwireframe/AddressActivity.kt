package com.example.praktikumwireframe

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.praktikumwireframe.databinding.ActivityAddressBinding

class AddressActivity : AppCompatActivity() {
    private lateinit var b: ActivityAddressBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityAddressBinding.inflate(layoutInflater); setContentView(b.root)

        // Set nama user
        b.tvHalo.text = "Halo ${OrderData.namaUser.ifBlank { "Nazwa" }},"

        b.btnOrder.setOnClickListener {
            OrderData.namaPenerima = b.etNama.text.toString()
            OrderData.alamat = b.etAlamat.text.toString()
            OrderData.patokan = b.etPatokan.text.toString()
            startActivity(Intent(this, ConfirmActivity::class.java))
        }
    }
}