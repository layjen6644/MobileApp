package com.example.contactsmobileapp

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

// Name: Layla Jenkins
// Assignment: SDC340 1.5 Guided Practice: Contacts Mobile App
// Date: 11/15/2026

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnContact2 = findViewById<Button>(R.id.btnContact2)
        btnContact2.setOnClickListener {
            startActivity(Intent(this, Contact2::class.java))
        }
        val btnContact1 = findViewById<Button>(R.id.btnContact1)
        btnContact1.setOnClickListener {
            startActivity(Intent(this, Contact1::class.java))
        }
    }
}