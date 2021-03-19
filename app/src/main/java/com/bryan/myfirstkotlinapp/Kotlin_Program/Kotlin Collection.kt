package com.bryan.myfirstkotlinapp.Kotlin_Program

//    Collection
//    Array
//    Mutable Array
//    List: listOf()
//    mutableListOf<>()
//    Kotlin ArrayList
//    arrayListOf<>()
//    Map: mapOf()
//    Kotlin HashMap
//    hashMapOf<>()
//    mutableMapOf<>()
//    Set: setOf()
//    mutableSetOf<>()
//    hashSetOf<>()

fun main() {

    // Mutable Array
//    var number = arrayOf(1,2,5,6,5,4,7,8,9,6,8)
//    var number2 = arrayOf<Int>(2,5,6,4,8)
//    var name:Array<String> = arrayOf<String>("Hemant","Kumar","Shrestha")
//
//    var another:Array<Any> = arrayOf("Hemant",1,12.2,100,350)


//    var number:IntArray = intArrayOf(1,2,3,4,5,6)
//    var num:Int = number.size -1
//    println(num)

//    for (i:Int in 0..number.size-1){
//        println(number[i])
//    }

//    for (i in 0..4){
//        println(number[i])
//    }

//    var num:Int = number.get(3)
//    println(num)

//    println(another.size)
//    println(another.get(0))
//    another.set(1,"Shrestha")
//    println(another.get(1))

//    for (i in another.indices){
//        println(i)
//        println(another[2])
//    }


    // Kotlin List Interface
//    var name = listOf("Hemant","Kumar","Shrestha")
//    println(name)
//    for(i in name){
//        println(i)
//    }

//    var number = listOf<Int>(1,23,2,6,5,65)
//    var number1 = listOf<Any>(1,3,6,"Hemant",13.8)
////    println(number)
////    println(number1)
//
//    var anotherList = listOf<Int>(1,2,5,6,6,6)
//    println(number.containsAll(anotherList))
//    println(number.subList(0,4))
//    println(number1.lastIndexOf("Hemant"))
//    println(number.size)
//    println(number1.contains("Hemant"))
//    println(number.isEmpty())
//    println(number.drop(65))
//    println(number.dropLast(2))


    // Kotlin MutableList {mutableListOf()}
//    var name = mutableListOf("HEMANT","KUMAR")
//    var name1 = mutableListOf("HEMANT")

//    name.set(0,"Manoj")
//    println(name)

//    println(name)
//    name.clear()
//    println()
//    println(name)

//    name.addAll(name1)
//    println(name)
//    name.removeAll(name1)
//    name.remove("Hemant")
//    println()
//    println(name)

//    name.addAll(name1)
//    println(name)

//    name.add("SHRESTHA")
//    println(name)
//    for (i in name){
//        println(i)
//    }

    // Kotlin ArrayList class
//    var name1 = mutableListOf<String>()

//    var name = ArrayList<String>()
//    name.add("Hemant")
//    name.add("Kumar")
//    name.add("Shrestha")
////    println(name)
//
//    println(name.remove("Kumar"))
//    println(name)

    // Kotlin ArrayList: arrayListOf()
//    var name = arrayListOf<String>("Hemant")
//    name.add("Shrestha")

//    var empdata = arrayListOf<Employee>()
//    val e1 = Employee(1,"Hemant",7011485817,"Greater Noida")
//    val e2 = Employee(2,"Manoj",7796545896,"Nepal")
//    val e3 = Employee(3,"Vishal",2595545896,"Habibpur")
//    val e4 = Employee(4,"Akash",7746565596,"New Delhi")
//
//    empdata.add(e1)
//    empdata.add(e2)
//    empdata.add(e3)
//    empdata.add(e4)
//
//    for (i in empdata){
//        println("${i.id}  ${i.name}  ${i.phone}  ${i.address}")
//    }



    // Kotlin Map Interface

//    Map interface holds data in the form of key and value pair
//    Map key are unique and holds only one value for each key
//    The key and value amy be of different pairs such as
//    <Int, Int>,<Int,String>,<Char, String> etc
//    This interface is immutable, fixed size and its methods support read only access

//    var myMap = mapOf<Int,String>(1 to "Hemant", 2 to "Manoj", 3 to "Vishal")

//    for (i in myMap.plus(Pair(4,"Akash"))){
//        println("Key ${i.key} = ${i.value}")
//    }
//    println(myMap)

//    for (i in myMap.minus(3)){
//        println(myMap[i.key])
//    }
//    println(myMap)

//    for (i:Map.Entry<Int,String> in myMap.asIterable()){
//        println("Key = ${i.key} value = ${i.value}")
//    }

//    println(myMap.getValue(1))
//    println(myMap.contains(5))
//    println(myMap.containsValue("Manoj"))

//    println(myMap.getOrDefault(3,"Ranju"))



////    println(myMap)
//    for (i in myMap.keys){
////        println(myMap[i])
//        println("Element at key $i = ${myMap.get(i)}")
//    }



//    Kotlin HashMap class
//    Kotlin HashMap is class of collection based MutableMap interface

//    var hasmap = HashMap<Int,String>()
//    hasmap.put(1,"Hemant")
//    hasmap.put(2,"Rajnish")
//    hasmap.put(3,"Rishab")
//    hasmap.put(4,"Tarun")
//    hasmap.put(5,"Akash")
//
//    var anothermap = HashMap<Int,String>()
//    anothermap.put(6,"Ameena")
//    anothermap.put(7,"Neha")
//    anothermap.put(8,"Purnima")
//    anothermap.put(9,"Barsha")
//    anothermap.put(10,"Rekha")
//
//    hasmap.putAll(anothermap)
//    println(hasmap)
//    println(hasmap.size)

//    println(hasmap)
//    for (i in hasmap.keys){
//        println("Element in map $i = ${hasmap[i]} ")
//    }
//    println("Size of HashMap is " + hasmap.size)
//    println(hasmap.get(3))
//    println(hasmap.remove(2))
//    println(hasmap)
//    hasmap.clear()
//    println(hasmap)

    // Kotlin HashMap: hashMapOf()
//    var newMap = hashMapOf<Int,String>(1 to "Hemant")
//    print(newMap)
//    newMap.put(2,"Rishab")
//    newMap.put(3,"Rajnish")
//    newMap.put(4,"Tarun")
//    newMap.put(5,"Akash")
//    println(newMap)
//
//    newMap.replace(4,"Tarun","Ameena")
//    println(newMap.keys)
//    println(newMap.getOrDefault(45,"Nothing"))
//
//    newMap.set(6,"Neha")
//    println(newMap)
//
//    var ns = hashMapOf<Int,String>()
//    ns = newMap.clone() as HashMap<Int, String>
//    println(ns)


    // Kotlin Mutable Interface

//    var mutableMap = mutableMapOf<Int,String>(5 to "Hemant")
//    mutableMap.put(1,"Rajnish")
//    mutableMap.put(2,"Rishab")
//    mutableMap.put(3,"Akash")
//    mutableMap.put(4,"Tarun")
////    println(mutableMap)
//
//    mutableMap.get(1)
//    mutableMap.remove(4)
//    mutableMap.contains(1)
//    println(mutableMap)
//    println(mutableMap.count())
//    mutableMap.getValue(2)
//    println(mutableMap)


    // Kotlin Set Interface

//    Kotlin Set Interface is a generic unordered collection of elements.
//
//    Set interface does not support duplicate elements
//    This interface is immutable in nature its methods
//    supports read-only functionality of thie set

//    var number = setOf(1,2,3,4,2.3,"Hemant")
//    println(number)
//    println(number.isEmpty())
//    println(number.elementAt(2))
//
//    var number2 = number.drop(3)
//    println(number2)


    // Kotlin Mutable Set

//    var oneSet = mutableSetOf<Int>(2,3,5,6,8)
//    oneSet.add(45)
//    println(oneSet)
//    oneSet.remove(2)
//    println(oneSet)
//
//    var name = mutableListOf<String>("Hemant","Vishal","Manoj")
//    name.add("Rishab")
//    println(name)
//    println("Size is ${name.size}")
//
//    var name2 = mutableListOf<String>("Rajnish","Aakash","Tarun")
//    name.addAll(name2)
//    println(name)
//
//    name.removeAll(name2)
//    println(name)
//    println("First element is ${name.first()}")
//    println(name.indexOf("Vishal"))


    // Kotlin HashSet class

//    Kotlin HashSet is a class of
//    collection which extends Abstraction MutableSet class and implements Set interface
//    The HashSet class store elements using hashing mechanism

//    var set1 = HashSet<Int>(6)
//    set1.add(1)
//    set1.add(2)
//    set1.add(3)
//    set1.add(4)
//    set1.add(5)
//    set1.add(6)
//    set1.add(7)
//    set1.add(8)
//
//    println(set1)
//    for (i in set1){
//        println(i)
//    }
//
//    set1.remove(5)
//    set1.indexOf(3)


//    // hasSetOf()
    var hasSetOf = hashSetOf<Int>(12,65,35,5)
    hasSetOf.add(10)
    println(hasSetOf)

}