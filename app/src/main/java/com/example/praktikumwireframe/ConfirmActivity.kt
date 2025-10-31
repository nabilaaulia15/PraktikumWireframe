package com.example.praktikumwireframe

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.praktikumwireframe.databinding.ActivityConfirmBinding

class ConfirmActivity : AppCompatActivity() {
    private lateinit var b: ActivityConfirmBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityConfirmBinding.inflate(layoutInflater); setContentView(b.root)

        val nama = OrderData.namaUser.ifBlank { "Nazwa" }
        b.tvHalo.text = "Halo $nama,"
        b.tvTerimaKasih.text = "Terima kasih sudah memesan. Tunggu notifikasi sampai kurir mengirimkan pesanan anda"
        
        b.btnSelesai.setOnClickListener {
            OrderData.reset()
            finishAffinity() // tutup semua & kembali
        }
    }
}