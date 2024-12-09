package com.example.innotutotialsthree

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val btn = findViewById<Button>(R.id.btn)
        val rg = findViewById<RadioGroup>(R.id.rg)
        btn.setOnClickListener{
            val rd1 = rg.checkedRadioButtonId
            val rb1 = findViewById<RadioButton>(rd1)
            val cb1 = findViewById<CheckBox>(R.id.c1)
            val cb2 = findViewById<CheckBox>(R.id.c2)
            val cb3 = findViewById<CheckBox>(R.id.c3)
            var opt_txt = "You selected radio btn ${rb1.text} and checkbox "
            val tv3 = findViewById<TextView>(R.id.tv)
            if(cb1.isChecked){
                opt_txt +=cb1.text.toString()+" "
            }
            if(cb2.isChecked){
                opt_txt+=cb2.text.toString()+" "
            }
            if( cb3.isChecked){
                opt_txt+=cb3.text.toString()+" "
            }else{
                opt_txt+=""
            }
            tv3.text = opt_txt

        }

    }
}