package com.oop2

abstract class Animal {
    //it can have abstract function
    //abstract functions are functions without a body/implementation
    //only abstract classes can have abstract function
    //4)you cannot create an object from an abstract class
    //5)abstract is always a superclass
    //6)when you inherit from an abstract class, you are
    //  REQUIRED to override all its abstract function

    abstract fun walk()
    abstract fun makeSound()
}