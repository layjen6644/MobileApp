package com.example.contactsmobileapp

import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Contact2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact2)
        val btnBack2 = findViewById<Button>(R.id.btnBack1)
        btnBack2.setOnClickListener{
            finish()
        }
    }
}