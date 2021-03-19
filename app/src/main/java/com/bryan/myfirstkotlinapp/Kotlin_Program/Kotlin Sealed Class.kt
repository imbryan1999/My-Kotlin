package com.bryan.myfirstkotlinapp.Kotlin_Program

import com.bryan.myfirstkotlinapp.Kotlin_Program.Kotlin_Class.Shape
import com.bryan.myfirstkotlinapp.Kotlin_Program.Kotlin_Class.eval

fun main() {

    // Kotlin Sealed Class
    // Sealed class is a class which restricts the class hierarchy. A class can be declared as sealed class using
    // "sealed" keyword before the class name. It is used to represent restricted class hierarchy

    var circle = Shape.Circle(5.0f)
    var square = Shape.Square(5)
    var rectangle = Shape.Rectangle(5,6)

    eval(circle)
    eval(square)
    eval(rectangle)
}