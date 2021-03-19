package com.bryan.myfirstkotlinapp.Kotlin_Program

fun main() {

    // Kotlin Range

//    val aToz:CharRange = 'a'..'z'
//    val oneTonine:IntRange = 1..9
//
//    for (i in aToz){
//        print(i)
//    }
//    for (i in oneTonine){
//        print(i)
//    }
//
//    println("3 number is present or not: ${3 in oneTonine}")
//    var check = 3 in oneTonine
//    println(check)


    for (x in 1..5)
        print(x)
    println()
    for (x in 5 downTo 1)
        print(x)
    println()
    for (x in 1.rangeTo(5))
        print(x)
    println()
    for (x in 5.downTo(1))
        print(x)
    println()

    for(x in 'e' downTo 'a')
        print(x)
    println()

    for (x in 10 downTo 1 step 3)
        print(x)
    println()

    var range1 = 1..5
    for (i in range1.reversed()){
        print(i)
    }
    println()
}