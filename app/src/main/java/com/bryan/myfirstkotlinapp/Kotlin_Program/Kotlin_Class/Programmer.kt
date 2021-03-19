package com.bryan.myfirstkotlinapp.Kotlin_Program.Kotlin_Class

//class Programmer(name:String, age:Int, salary:Float,dep:String):Employe(name,age,salary) {
//
//    init {
//        println("You are working in this department: $dep")
//    }
//
//    fun doProgram(){
//        println("Programming is my Passion..")
//    }
//}

class Programmer:Employe{
    constructor(name:String, age:Int, salary:Float,dep:String):super(name,age,salary){

    }
    fun doProgram(){
        println("Programming is my hobby.")
    }
}