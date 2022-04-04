package com.examen.ejemplolisteners

abstract class ClasePadre {

    fun fun1(){
        println("Llamándose a la fun1 del padre")
    }

    open fun fun2(){
        println("Llamándose a la fun2 del padre")
    }

    abstract fun fun3()

    override fun toString(): String {
        return this.javaClass.name
    }
}