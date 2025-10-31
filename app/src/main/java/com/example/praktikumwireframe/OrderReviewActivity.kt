package com.example.praktikumwireframe

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import com.example.praktikumwireframe.databinding.ActivityOrderReviewBinding

class OrderReviewActivity : AppCompatActivity() {
    private lateinit var b: ActivityOrderReviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityOrderReviewBinding.inflate(layoutInflater); setContentView(b.root)

        b.tvNama.text = "Halo ${OrderData.namaUser.ifBlank { "Nazwa" }},"
        b.tvPesanan.text = if (OrderData.makananDipilih.isEmpty())
            "Belum ada pesanan." else "Pesanan saya:\n• " + OrderData.makananDipilih.joinToString("\n• ")

        b.btnKirim.setOnClickListener {
            startActivity(Intent(this, AddressActivity::class.java))
        }
    }
}