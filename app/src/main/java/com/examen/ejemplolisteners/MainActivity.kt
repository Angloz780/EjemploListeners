package com.examen.ejemplolisteners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var numeroClick = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Llamar al botón sin el ViewBinding
        val b = findViewById<Button>(R.id.button)

        //Al hacer click sale un Toast que es un texto
        b.setOnClickListener{
            numeroClick++
            Toast.makeText(this, "Botón ha sido pulsado $numeroClick veces", Toast.LENGTH_LONG).show()
        }
        Toast.makeText(this, "Botón ha sido pulsado 0 veces", Toast.LENGTH_LONG).show()
    }
}