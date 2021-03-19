package com.bryan.myfirstkotlinapp.Kotlin_Program

open class Account3 {

    var a = 1 // public by default
    private var b = 2
    protected open val c = 3
    internal val d = 3
    protected open fun e(){
        println("This is Protected Class")
    }

}