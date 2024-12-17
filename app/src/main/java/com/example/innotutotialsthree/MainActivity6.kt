package com.example.innotutotialsthree

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main6)

//        val emailIntent = Intent(Intent.ACTION_SEND).apply {
//            type = "message/rfc822"
//            putExtra(Intent.EXTRA_EMAIL, arrayOf("ex@example.com"))
//            putExtra(Intent.EXTRA_SUBJECT, "Subject")
//            putExtra(Intent.EXTRA_TEXT, "Email Body")
//        }
//        startActivity(emailIntent)

//        val phoneNumber = "1234567890"
//        val callIntent = Intent(Intent.ACTION_DIAL).apply {
//            data = Uri.parse("tel:$phoneNumber")
//        }
//        startActivity(callIntent)



    }
}