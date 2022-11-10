package com.example.pets_servicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_2=findViewById<Button>(R.id.btn1)
        btn_2.setOnClickListener{
            val saltar: Intent = Intent(this, imc::class.java)
            startActivity(saltar)
        }
    }
}