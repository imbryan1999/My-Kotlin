package com.bryan.myfirstkotlinapp.Kotlin_Program

fun main() {
/*Kotlin Operator*/

//Arithmetic Operator
//    var a = 5
//    var b = 5
//    println(a+b)
//    println(a-b)
//    println(a*b)
//    println(a/b)
//    println(a%b)

//Relation Operator
//    val a = 5
//    val b = 10
//    val max = if (a > b){
//        println("a is greater than b.")
//        a
//    }else{
//        println("b is greater than a.")
//        b
//    }
//    println("max = $max")

//Assignment Operator
//    var num = 10
//    num = num+5
//    print(num)

//    num += 5
//    println(num)
//
//    num -= 5
//    println(num)
//
//    num *= 5
//    println(num)
//
//    num /= 5
//    println(num)
//
//    num %= 5
//    println(num)

//Unary Operator
//    var a=10
//    var b=5
//    var flag = true
//    println("+a :"+ +a)
//    println("-a :"+ -a)
//    println("++a :"+ ++a)
////    println("++a :"+ a++)
////    println(a)
//    println("--b :"+ --b)
//    println("!flag :"+ !flag)

//Logical Operator
    var a=10
    var b=5
    var c=15

    var flag = false
    var result:Boolean

    result = (a>b) && (a>c)
    println("(a>b) && (a>c) :"+ result)
    result = (a>b) || (a>c)
    println("(a>b) || (a>c) :"+ result)
    result = !flag
    println("!flag :"+ result)

//Bitwise Operator
//    var a = 10 //20 //40 //80
//    var b = 3

//    println(a.shl(b))
//    println(a.shr(b))

//    println("a.ushr(b): "+ a.ushr(b))
//    println("a.and(b): "+ a.and(b))
//    println("a.or(b): "+a.or(b))
//    println("a.xor(b): "+a.xor(b))
//    println("a.inv(): "+a.inv())
}