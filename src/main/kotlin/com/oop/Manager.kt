package com.oop

class Manager: Employee() {
    override fun computeBonus(){
        //additional 10%
        super.computeBonus()
        println("You have additional ${bonus*0.10}")
    }
}