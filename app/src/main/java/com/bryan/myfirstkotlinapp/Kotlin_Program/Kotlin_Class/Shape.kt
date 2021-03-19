package com.bryan.myfirstkotlinapp.Kotlin_Program.Kotlin_Class

sealed class Shape {

    class Circle(var radius:Float):Shape()
    class Square(var length:Int):Shape()
    class Rectangle(var length: Int, var breadth: Int): Shape()
    // Object NotAShape : Shape()
}

fun eval(e: Shape) =
        when(e){
            is Shape.Circle -> println("Circle area is ${3.14*e.radius*e.radius}")
            is Shape.Square -> println("Square area is ${e.length*e.length}")
            is Shape.Rectangle -> println("Rectange area is ${e.length*e.breadth}")

            // else -> "else case is not require as all case is covered above"
            // Shape.NotShape -> Double.Nan
        }