package com.bryan.myfirstkotlinapp.Kotlin_Program.Kotlin_Class

//class Salesman(name:String, age:Int, salary:Float, area:String):Employe(name,age,salary) {
//
//    init {
//        println("You working in this area : $area")
//    }
//
//    fun fieldWork(){
//        println("Travelling is my Hobby..")
//    }
//}

class Salesman:Employe{
    constructor(name:String, age:Int, salary:Float, area:String):super(name, age, salary){

    }
    fun fieldWork(){
        println("Travelling is my hobby..")
    }
}