package com.kotlin.program

fun main(){
//    var joe = Person()
//    joe.name = "Joe"
//    println(joe.name)
//
//    var anna = Person()
//    anna.name = "Anna"
//    println(anna.name)

    var joe = Person("Joe",21)//instantiation
    println("**********")
    println("${joe.name}'s current age is ${joe.age}")
    println("After 1 year.....")
    joe.ageUp()
    println("${joe.name}'s current age is ${joe.age}")

    var anne = Person("Anne")
    anne.age = 25
    anne.displayAge()


}


class Person(var name: String, var age: Int) { //constructor -> primary constructor
    init {
        println("Object Created!")
        println("name is $name")
        println("age is $age")
    }
    //secondary constructor
    constructor(name: String):this(name,0){
    }
    //secondary constructor
    constructor(age: Int):this("name default",age){
    }

    fun walk(){
        println("A person walks")

    }
    fun eat(){
        println("A person eats")
    }
    fun displayAge(){
        var age: Int = 7
        println(age)
    }
    fun ageUp(){
        age++
    }

}