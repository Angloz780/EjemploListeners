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
        Toast.makeText(this, "Botón ha sido pulsado $numeroClick veces", Toast.LENGTH_LONG).show()

        /*var objetoPadre = ClasePadre()
        objetoPadre.fun1()
        objetoPadre.fun2()*/

        var objetoHijo1 = ClaseHija1()
        objetoHijo1.fun1()
        objetoHijo1.fun2()
        objetoHijo1.fun3()

        var objetoHijo2 = ClaseHija1()
        objetoHijo2.fun1()
        objetoHijo2.fun2()
        objetoHijo2.fun3()

        var listaObjetos1 = MutableList(1){
            objetoHijo1
        }

        var listaObjetos2 = MutableList(1){
            objetoHijo2
        }

        var listaObjetoPadre : MutableList<ClasePadre> = MutableList(1){
            objetoHijo1
        }
        listaObjetoPadre.add(objetoHijo2)

        println(listaObjetoPadre)

        listaObjetoPadre.forEach(){
            if(it is ClaseHija1){
                it.fun4()
            }
            if(it is ClaseHija2){
                it.fun5()
            }
        }

        var objetoInterfaz1 = ClaseImplementaInterfaz1()
        objetoInterfaz1.fun2()

        var objetoInterfaz2 = ClaseImplementaInterfaz2()
        objetoInterfaz2.fun3()

        var listaInterfaces = mutableListOf(objetoInterfaz1, objetoInterfaz2)
        listaInterfaces.forEach {
            it.fun1()
            if(it is ClaseImplementaInterfaz1){
                it.fun2()
            }
            if(it is ClaseImplementaInterfaz2){
                it.fun3()
            }
        }
    }
}