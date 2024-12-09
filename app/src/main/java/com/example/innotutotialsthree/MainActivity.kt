package com.example.innotutotialsthree

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val edt = findViewById<EditText>(R.id.edt)
        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java)
                .putExtra("name",edt.text.toString()))
        }


    }
}