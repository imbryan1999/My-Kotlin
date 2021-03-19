package com.bryan.myfirstkotlinapp.Kotlin_Program.Kotlin_Class

class Account {
    var acc_no:Int = 0
    var name:String = ""
    var amount:Float = 0.toFloat()

    fun insert(ac:Int, nm:String, am:Float){
        acc_no = ac
        name = nm
        amount = am
    }

    fun allInformation(){
        println("Account No: $acc_no "
                + "Name: $name "
                + "Amount: $amount")
    }

    fun addition(number:Int, number2:Int):Int{
        return number+number2
    }


    // Nested Class exmaple
    private var name2:String = "Hemant"
    class nestedClass{
        var description:String = "Code inside nested class"
        private var id:Int = 101
        fun foo(){
//             print("Name is $name2") // cannot access the outer class member
            println("Id is $id")
        }
    }

    // Nested Class exmaple
    private var name3:String = "Hemant"
    inner class innerClass{
        var description:String = "Code inside inner class"
        private var Id:Int = 101
        fun foo2(){
             print("Name is $name2") // cannot access the outer class member
            println("Id is $Id")
        }
    }
}