package com.bryan.myfirstkotlinapp.Kotlin_Program

fun main() {

//    Kotlin String

//    The string class represents an array of char types.
//    Strings are imutable which means the length and
//    elements cannot be changed after their creation

//    var ch = charArrayOf('h','e','l','l','o')
//    val st = String(ch)
//    println(st)

//    var name = "Hemant"
//    println(name.substring(0,4))

//    val name1 = "Hemant"
//    val name2 = "Hemant"
//    val name3 = "Shrestha"
//    println(name1 == name2)
//    println(name1 === name3)

    var name1 = "Hemant"
    var name2 = buildString { "Shrestha" }
    println(name1 === name2)

}