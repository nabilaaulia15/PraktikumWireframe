package com.example.praktikumwireframe

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import com.example.praktikumwireframe.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var b: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityRegisterBinding.inflate(layoutInflater); setContentView(b.root)

        b.btnRegister.setOnClickListener {
            OrderData.namaUser = b.etNama.text.toString().ifBlank { b.etUsername.text.toString().ifBlank { "User" } }
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}