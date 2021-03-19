package com.bryan.myfirstkotlinapp.Kotlin_Program.Kotlin_Class

class Parrot: Bird() {

    override var color:String = "Green" // Property Overriding

    override fun fly(){
        super.fly() // Invoking super keyword
        println("Parrot is Flying..")
    }
}