package com.example.bytestock

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlin.math.log

class afterSignUp : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_after_sign_up)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val bottomNav : BottomNavigationView = findViewById(R.id.Bottom_nav)
        openFragment(inventoryFragment())
        bottomNav.setOnNavigationItemSelectedListener {
            val id = it.itemId
            when(id){
                R.id.profile -> {
                    openFragment(profileFragment())
                }
                R.id.cart -> {
                    openFragment(cartFragment())
                }
                R.id.inventory -> {
                    openFragment(inventoryFragment())
                }
            }
            return@setOnNavigationItemSelectedListener true
        }

    }
    private fun openFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fcv , fragment)
            .commit()
    }



}