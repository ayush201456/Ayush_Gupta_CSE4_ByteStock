package com.example.bytestock

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class loginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn : Button = findViewById(R.id.login_button)
        val button : Button = findViewById(R.id.go_to_signup_btn)

        btn.setOnClickListener {
            val intent = Intent(this,afterSignUp::class.java)
            startActivity(intent)
        }

        button.setOnClickListener {
            val intent = Intent(this,signupActivity::class.java)
            startActivity(intent)
        }
    }
}