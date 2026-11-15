package com.example.contactsmobileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Contact1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact1)
        val btnBack1 = findViewById<Button>(R.id.btnBack1)
        btnBack1.setOnClickListener{
            finish()
        }
    }
}