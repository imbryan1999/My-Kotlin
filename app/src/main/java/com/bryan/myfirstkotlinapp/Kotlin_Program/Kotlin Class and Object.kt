package com.bryan.myfirstkotlinapp.Kotlin_Program

import com.bryan.myfirstkotlinapp.Kotlin_Program.Kotlin_Class.Account

fun main() {

    // Kotin class and Object
    // Kotlin supports both object oriented programming (oop) as well as functional programming

//    Account()
//    println(Account().allInformation())

//    var emp1 = Account()
//    emp1.insert(1,"Hemant",15000.0f)
//    println(emp1.allInformation())
//
//    println(emp1.addition(10,52))


    // Kotlin Nested Class and Inner Class

//    The advantage of inner class over nested class is that, it is able to access member of outer
//    class even it is private. Inner class keeps a reference to an object of outer class

//    println(Account.nestedClass().description)
//
//    var obj = Account.nestedClass()
//    println(obj.description)
//    obj.foo()

    println(Account().innerClass().description)
    var obj = Account().innerClass()
    println(obj.description)
    obj.foo2()

}