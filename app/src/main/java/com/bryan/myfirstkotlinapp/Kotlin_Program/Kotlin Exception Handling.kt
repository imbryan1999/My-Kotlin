package com.bryan.myfirstkotlinapp.Kotlin_Program

import java.lang.ArithmeticException
import java.lang.Exception

fun main() {

//    Kotlin Exception Handling

//    Exception handling is a technique which handles the runtime problem and
//    maintain the flow of program exection.
//
//    There are four different keywords used in exception handling. These are:

//    try
//    catch
//    finally
//    throw

//    ArithmeticException:                            throw when we divide a number by zero
//    ArrayIndexOutOfBoundsException:                 thrown when an array has been tried to access with
//                                                    incorrect index value
//    SecurityException:                              thrown by the security manager to indices a security violation
//    NullPointerException:                           thrown when invoking a method or property on a null object

//    try {
//        var data = 2/0
//    }catch (e:ArithmeticException){
////        println(e)
//        println("We cannot divide throw Zero")
//    }
//    println("Hello Kotlin")

    // Kotlin multiple catch block
//    try {
//        val number = IntArray(5)
//        number[4] = 10/0
//    }catch (e:Exception){
//        println("Parent exception class")
//    }
//    catch (e:ArithmeticException){
//        println("This is a arithmeticexception error")
//    }catch (e:ArrayIndexOutOfBoundsException){
//        println("This is array index out of bound")
//    }
//    println("Hello Kotlin")

    // Kotlin Nested try-catch block with Finally Block
//    val nume = intArrayOf(4,8,16,32,64,128,256,512)
//    val deno = intArrayOf(2,0,4,4,0,8)
//
//    try {
//        for (i:Int in nume.indices){
//            try {
//                println(nume[i].toString() + "/" + deno[i] + " is " + nume[i]/deno[i])
//            }catch (e:ArithmeticException){
//                println("Cant divide by zero!")
//            }
//        }
//    }catch (e:ArrayIndexOutOfBoundsException){
//        println("Element not found.")
//    }finally {
//        println("This is Finally Block")
//    }

//    drivingLic(15)
//    println(sen.length)

}

// Kotlin Throw Keyword
//fun drivingLic(age:Int){
//    if (age < 18){
//        throw ArithmeticException("You cannot Apply for Driving License")
//    }else{
//        println("You can Apply for Driving License")
//    }
//}