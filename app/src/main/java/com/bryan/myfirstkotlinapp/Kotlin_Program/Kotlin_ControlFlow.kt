package com.bryan.myfirstkotlinapp.Kotlin_Program

fun main() {

    // if-else expression
//    val num1 = 10
//    val num2 = 20
//    if(num1 > num2){
//        println("$num1 is greater than $num2")
//    }else{
//        println("$num1 is smaller than $num2")
//    }

//    val result = if (num1 > num2){
//        "$num1 is greater than $num2"
//    }else{
//        "$num1 is smaller than $num2"
//    }
//    println(result)

//    val result = if(num1>num2) "$num1 is greater than $num2" else "$num1 is smaller than $num2"
//    println(result)

    // if-else if-else ladder expression
//    val num = -10
//    val result = if (num >0){
//        "$num is positive"
//    }else if (num < 0){
//        "$num is negative"
//    }else{
//        "$num is zero"
//    }
//    println(result)

    // nested if expression
    val num1 = 25
    val num2 = 20
    val num3 = 30
    val result = if (num1 > num2) {
        val max = if (num1 > num3) {
            num1
        } else {
            num3
        }
        "body of if " + max
    } else if (num2 > num3) {
        "body of if " + num2
    } else {
        "body of if " + num3
    }
    println(result)
}