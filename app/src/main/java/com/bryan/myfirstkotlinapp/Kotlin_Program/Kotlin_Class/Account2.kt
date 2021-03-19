package com.bryan.myfirstkotlinapp.Kotlin_Program

//class Account2(ac:Int, nm:String, am:Float){ // Primary Constructor
//
//}

//class Account2(name:String, id:Int){ // Primary Constructor
//
//    var name_one:String
//    var idd:Int
//
//    init {
//
//        name_one = name.capitalize()
//        idd = id
//
//       println("Your name is: $name_one")
//       println("Your id is: $idd")
//    }
//}

//class Account2{ //(password:String)  // Secondary Constructor
//
//    constructor(name:String, id:Int):this(name,id,"mypassword"){
//        println("This is execute next")
//        println(name)
//        println(id)
//
//    }
//
//    constructor(name:String,id:Int,password:String){
//        println("This execute first")
//        println("Name is: $name")
//        println("Id is: $id")
//        println("Password is: $password")
//    }
//}

 open class Account2{

    constructor(name:String, id:Int):this(name,id,"mypassword"){
        println("This is execute first")
        println(name)
        println(id)
    }

    constructor(name: String, id: Int, password:String){
        println("This is execute third")
        println("name is $name")
        println("id is $id")
        println("Your password is $password")
    }
}

class Child:Account2{
    constructor(name: String, id: Int):super(name,id){
        println("This is executes second")
        println("Name: $name")
        println("Id: $id")
    }

    constructor(name: String, id: Int, pass: String):super(name, id, "password"){
        println("This executes forth")
        println("Name: $name")
        println("ID: $id")
        println("Password: $pass")
    }
}