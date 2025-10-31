package com.example.praktikumwireframe

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import com.example.praktikumwireframe.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var b: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityLoginBinding.inflate(layoutInflater); setContentView(b.root)

        b.btnLogin.setOnClickListener {
            OrderData.namaUser = b.etUsername.text.toString().ifBlank { "User" }
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}