package com.bryan.myfirstkotlinapp.Kotlin_Program

import java.util.*
import kotlin.math.max

fun main() {

//    Kotlin Function

//    Function is a group of inter related block of code which performs a specific task
//    It makes reusability of code and makes program more managable

//    Standard library function

//    println(Math.max(10,20))

//    User defined function
//    println(greaterNumber(10,20)
//    sum()

//    var input = Scanner(System.`in`)
//    println("Enter any number: ")
//    var number = input.nextInt()
//    num(number)

//    Kotlin Recursion Function
//    Recursion function is a function which calls itself continuously
//    This technique is called recursion

//    Kotlin Tail Recursion

//    Tail recursion is a recursion which performs the calculation first,
//    then makes the recursion call.
//    The result of current step is passed into the next recursion call

//    rec()
//    println(factorial(5))

    println(recursionSum(100000))
}

tailrec fun recursionSum(n: Long, answer: Long = 0): Long {
    return if (n <= 0) {
        answer
    } else {
        recursionSum((n - 1), n+answer)
    }
}

// example of recursion
//fun factorial(number:Int):Long{
//    return if (number == 1) {
//        number.toLong()
//    }else{
//        number*factorial(number-1)
//    }
//}

//var count = 0
//fun rec(){
//    count++
//    if (count <=5){
//        println("This number $count")
//        rec()
//    }
//}

//with parameterize
fun greaterNumber(number1: Int, number2: Int): Int {
    if (number1 > number2) {
        return number1
    } else {
        return number2
    }

}

// without parameterize
fun sum() {
    var number1 = 10
    var number2 = 20
    println(number1 + number2)
}

fun num(number: Int) {
    if (number % 2 == 0) {
        println("Even number")
    } else {
        println("Odd number")
    }
}