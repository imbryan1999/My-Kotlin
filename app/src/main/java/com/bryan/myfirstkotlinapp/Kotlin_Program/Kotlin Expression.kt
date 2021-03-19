package com.bryan.myfirstkotlinapp.Kotlin_Program

//kotlin with expression

// kotlin, when expression is a conditional expression which returns the value. Kotlin,
// when expression is replacement of switch statement. Kotlin,
// when expression works as a swtich statement of other language (C, C++, Java).

fun main() {
    var number = 1
//    var numberProvided = when(number){
//        1 -> "One"
//        2 -> "Two"
//        3 -> "Three"
//        4 -> "Four"
//        5 -> "Five"
//        else -> "Invalid Number"
//    }
//    println("You provide $numberProvided")

//    var numberProvided = when(number){
//        1 -> println("One")
//        2 -> println("Two")
//        3 -> println("Three")
//        4 -> println("Four")
//        5 -> println("Five")
//        else -> println("Invalid Number")
//    }

//    var numberProvided = when(number){
//        1 -> {
//            println("You have Provided Number is $number")
//        }
//        2 -> {
//            println("You have Provided Number is $number")
//        }
//        3 -> {
//            println("You have Provided Number is $number")
//        }
//        4 -> {
//            println("You have Provided Number is $number")
//        }
//        5 -> {
//            println("You have Provided Number is $number")
//        }else -> {
//            println("Invalid Number")
//        }
//    }

//    var season = 5
//    val sea = when(season){
//        3,4,5,6 ->
//            "It is summer season"
//        7,8,9 ->
//            "It is rainy season"
//        10,11 ->
//            "It is autumn season"
//        12,1,2 ->
//            "It is winter season"
//
//        else -> "Invalid Input"
//    }
//    println(sea)

    var num = 5
    var result = when(num){
        in 1..5 -> "Input is provide into range 1 to 5"
        in 6..10 -> "Input is provide into range 6 to 10"
        else -> "none of the above"
    }
    println(result)

}