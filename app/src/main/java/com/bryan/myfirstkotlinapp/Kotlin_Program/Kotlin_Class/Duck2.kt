package com.bryan.myfirstkotlinapp.Kotlin_Program.Kotlin_Class

// Example of implementing multiple class

class Duck2():Bird(),Parrot2 {

    override var color:String = "White" // Property Overriding

    //    fun swim(){
//        println("Swimming...")
//    }
    override fun fly(){
        super<Bird>.fly()
        super<Parrot2>.fly()
//        super.fly() // Invoking super keyword
        println("Duck is flying..")
    }
}