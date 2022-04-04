package com.examen.ejemplolisteners

class ClaseHija1: ClasePadre() {

    override fun fun2(){
        super.fun2()
        println("Llamándose a la fun2 del hijo1")
    }

    override fun fun3() {
        println("Llamándose a la fun3 del hijo1")
    }

    fun fun4(){
        println("Llamándose a la fun4 del hijo1")
    }
}