package com.bryan.myfirstkotlinapp.Kotlin_Program

import com.bryan.myfirstkotlinapp.Kotlin_Program.Kotlin_Class.User

fun main() {

    // Kotlin Data class

    // Data class is a simple class which is used to hold data/state and contains
    // standard functionality. A data keyword is used to declare a class as a data class.


    var u1 = User("Hemant",1,"hemantshrsth@gmail.com")
    println(u1)

    var u2 = User(email = "abc@gmail.com")
    println(u2)

//    println(u1.email)
//
//    var u2 = u1
//    println(u2)

}