package com.bryan.myfirstkotlinapp.Kotlin_Program.Kotlin_Class

import com.bryan.myfirstkotlinapp.Kotlin_Program.Account3

class Derived:Account3() {

    var b = 2
    public override var c = 10
    public override fun e(){
        println("This is Derived Class")
    }
}