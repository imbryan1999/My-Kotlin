package com.bryan.myfirstkotlinapp.Kotlin_Program

import com.bryan.myfirstkotlinapp.Kotlin_Program.Kotlin_Class.Duck
import com.bryan.myfirstkotlinapp.Kotlin_Program.Kotlin_Class.Employe
import com.bryan.myfirstkotlinapp.Kotlin_Program.Kotlin_Class.Programmer
import com.bryan.myfirstkotlinapp.Kotlin_Program.Kotlin_Class.Salesman

fun main() {

    // Kotlin Inheritance
//    Inheritance is an important feature of object oriented programming language.
//    Inheritance allows to inherit the feature of existing
//            (or base or parent class) to new class (or derived class or child class).

//    var duck1 = Duck()
//    duck1.fly()
//    duck1.swim()

    var emp1 = Employe("Hemant",22,22000.0f)
    var developer = Programmer("Manoj",25,15000f,"Android Application")
    developer.doProgram()

    var saleman = Salesman("Vishal",24,45000f,"Noida")
    saleman.fieldWork()
}