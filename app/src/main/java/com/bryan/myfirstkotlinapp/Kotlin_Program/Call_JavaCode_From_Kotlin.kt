package com.bryan.myfirstkotlinapp.Kotlin_Program

fun main() {

    // Calling Java code from Kotlin
//    var sum = MyJavaClass.add(5,6)
//    println("The addition of two number is: $sum")

    var obj1 = MyJavaClass()
    obj1.fName = "Hemant"
    obj1.lName = "Shrestha"

    println(obj1.getfName())
    println(obj1.getlName())

    obj1.setfName("Vishal")
    obj1.setlName("Shrestha8")

    println(obj1.getfName())
    println(obj1.getlName())
}