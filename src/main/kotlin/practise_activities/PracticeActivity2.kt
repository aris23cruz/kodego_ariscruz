package practise_activities

import java.util.function.IntToDoubleFunction

fun main(){

    println("Enter Grade in Math:")
    var number1: Int = readln().toInt()
    println("$number1")
    println("Enter Grade in English")
    var number2: Int = readln().toInt()
    println("$number2")
    println("Enter Grade in Filipino")
    var number3: Int = readln().toInt()
    println("$number3")
    var average: Double = (number1 + number2 + number3)/(3).toDouble()
    println("Average Grade is $average")
}