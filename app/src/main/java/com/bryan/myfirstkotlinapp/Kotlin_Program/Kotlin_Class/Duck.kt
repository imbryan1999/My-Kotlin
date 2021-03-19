package com.bryan.myfirstkotlinapp.Kotlin_Program.Kotlin_Class

class Duck():Bird() {

    override var color:String = "White" // Property Overriding

//    fun swim(){
//        println("Swimming...")
//    }
override fun fly(){
    super.fly() // Invoking super keyword
        println("Duck is flying..")
    }
}