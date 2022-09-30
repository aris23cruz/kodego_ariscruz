package com.oop
//Abstraction //encapsulation
//Inheritance -> "is-a relationship" test
open class Person {
    var name: String = "John"
        get() {return field}
        set(value) {
            field = value
        }
    var age : Int = 23
        get() {return field}
        set(value) {
            if (value < 1) {
                println("Invalid age")
            } else {
                field = value
            }
        }
    init{
        println("Object Created!")
        println("Name is $name, age is $age")
    }

    fun upAge():Int{
        age++
        return age
    }

    fun change(age:Int){
        println(age)
    }
    open fun displayName(){
        println("Name in $name")
    }
}