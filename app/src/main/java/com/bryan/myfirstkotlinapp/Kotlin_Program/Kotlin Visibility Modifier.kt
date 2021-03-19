package com.bryan.myfirstkotlinapp.Kotlin_Program

import com.bryan.myfirstkotlinapp.Kotlin_Program.Kotlin_Class.Derived

fun main() {

    // Kotlin Visibility Modifier

    // public
    // protected
    // internal
    // private
    
//    var acc = Account3()
//    println(acc.a)
//    println(acc.b)
//    println(acc.c)
//    println(acc.d)
//    println(acc.e)

    var der = Derived()
    println(der.a)
    println(der.b)
    println(der.c)
    println(der.d)
    der.e()

}