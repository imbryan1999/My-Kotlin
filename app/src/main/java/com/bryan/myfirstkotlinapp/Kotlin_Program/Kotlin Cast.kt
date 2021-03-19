package com.bryan.myfirstkotlinapp.Kotlin_Program

fun main() {
    // Kotlin Null Safety

    //Kotlin nullable types and non-nullable types

//    var name:String? = "Hemant"
//    name = null;
//
//    var name2:String? = null
//    println(name2)

//    var name:String? = "Hemant"
////    println(name.length)
//
//    var length = if (name != null)name.length else -1
//    println(length)

//    if (name != null){
//        println(name.length)
//    }else{
//        -1
//    }

    // Smart cast
    // !is and is

    var sen:Any = "This is a normal sentence"
//    if (sen is String){
//        println("The length of String is: "+ sen.length)
//    }else{
//        println("The given variable is not String")
//    }
//    if(sen !is String){
//        println("The given variable is not String")
//    }else{
//        println("The Length of String is: "+sen.length)
//    }


//    Unsafe and Safe Cast Operator

//    var name:Any? = "Hemant"
//    var name1:String? = name as String?
//    println(name1)

//    val name:Any = "Mahendra"
//    val name1:String? = name as? String
//    println(name1)
//    var number:Int? = name as? Int
//    println(number)


//    Elvis Operator (?:)

    var str:String? = null
    var str2:String? = "May be declared nullable string"
    var len1: Int = str ?.length ?: -1  //  if (str != null) str.length else -1
    var len2: Int = str2 ?.length ?: -1 // if (str2 != null) str2.length else -1

    println(len1)
    println(len2)
}
