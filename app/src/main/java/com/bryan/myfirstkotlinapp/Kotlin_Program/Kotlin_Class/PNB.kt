package com.bryan.myfirstkotlinapp.Kotlin_Program.Kotlin_Class

class PNB:Bank() {
    override fun simpleInterest(p: Int, r: Double, t: Int): Double {
        return (p*r*t)/100
    }
}