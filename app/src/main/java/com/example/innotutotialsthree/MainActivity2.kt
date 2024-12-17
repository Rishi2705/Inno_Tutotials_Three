package com.example.innotutotialsthree
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        val btn = findViewById<Button>(R.id.btn)
        var text = findViewById<TextView>(R.id.text)
        val tex = intent.extras?.getString("name").toString()
        text.text = tex

        btn.setOnClickListener {
            startActivity(Intent(this,MainActivity4::class.java))
            finish()
        }
    }
}

