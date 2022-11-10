package com.example.pets_servicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_Calcular_iva.*

class Calcular_imc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcular_imc)
        val extras= intent.extras
        val nombre = extras?.getString("nombre")?:"sin nombre"
        val peso = extras?.getDouble("peso")?:-1
        val altura = extras?.getDouble("altura")?:-1
        val occipucio = extras?.getDouble("occipucio")?:-1
        val raza = extras?.getString("raza")?:"sin raza"

        val imc = peso/(altura*occipucio)
        if(imc()<16.00){
            cad="Infrapeso: Delgadez Severa";
        }else if(imc()<=16.00 || imc()<=16.99){
            cad="Infrapeso: Delgadez moderada";
        }else if(imc()<=17.00 ||imc()<=18.49){
            cad="Infrapeso: Delgadez aceptable";
        }else if(imc()<=18.50 || imc()<=24.99){
            cad="Peso Normal";
        }else if(imc()<=25.00 || imc()<=29.99){
            cad="Sobrepeso";
        }else if(imc()<=30.00 || imc()<=34.99){
            cad="Obeso: Tipo I";
        }else if(imc()<=35.00 || imc()=40.00){
            cad="Obeso: Tipo III";
        }else{
            cad="no existe clasificacion";
        }
        tv_nombre.setText("El IMC de" +nombre+ "es:")
        tv_peso.setText(+imc)

        btn4.setOnClickListener(){
            val saltar:Intent=Intent(this, MainActivity::class.java)
        }
    }
}