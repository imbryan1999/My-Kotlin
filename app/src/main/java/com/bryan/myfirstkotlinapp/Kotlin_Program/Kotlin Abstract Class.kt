package com.bryan.myfirstkotlinapp.Kotlin_Program

import com.bryan.myfirstkotlinapp.Kotlin_Program.Kotlin_Class.*

fun main() {

    // Kotlin Abstract class

//    var honda = Honda()
//    honda.run()
//
//    var city = City()
//    city.run()

    var sbi : Bank = SBI()

    val sbiint:Double = sbi.simpleInterest(1000,5.0,3)
    println("SBI interest is: $sbiint")

    var pnb: Bank = PNB()

    val pnbint:Double = pnb.simpleInterest(1000,4.5,3)
    println("PNB interest is: $pnbint")
}