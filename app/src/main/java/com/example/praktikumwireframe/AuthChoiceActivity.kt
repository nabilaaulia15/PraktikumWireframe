package com.example.praktikumwireframe

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import com.example.praktikumwireframe.databinding.ActivityAuthChoiceBinding

class AuthChoiceActivity : AppCompatActivity() {
    private lateinit var b: ActivityAuthChoiceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityAuthChoiceBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.btnRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
        b.btnLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}