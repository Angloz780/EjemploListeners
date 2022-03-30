package com.examen.ejemplolisteners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Llamar al botón sin el ViewBinding
        val b = findViewById<Button>(R.id.button)

        
    }
}