package com.example.pets_servicios

import android.content.Intent
import android.icu.number.IntegerWidth
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class imc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        val btn_2=findViewById<Button>(R.id.btn_Calcular)
        btn_2.setOnClickListener{

            var nombre:String= et_nombre.text.toString()
            var Peso:String = et_peso.text.toString()
            var peso = Integer.parseInt(Peso)
            var Altura:String= alturat.text.toString()
            var altura = Integer.parseInt(Altura)
            var Occipucio:String= et_occipucio.text.toString()
            var occipucio = Integer.parseInt(Occipucio)
            var genero:String=et_genero.text.toString()
            var raza: String=et_raza.text.toString




            val saltar: Intent = Intent(this,Calcular_imc::class.java)

            saltar.putExtra("nombre",nombre)
            saltar.putExtra("peso",peso)
            startActivity(saltar)
    }
}