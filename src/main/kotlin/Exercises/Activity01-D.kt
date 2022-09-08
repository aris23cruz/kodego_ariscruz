package Exercises

fun main() {

    var amount: Double = 0.0
    var answer: String = ""
    var divisor: Int = 0
    var total: Double = 0.0
    var input: Int = 0

    do {
        print("Enter Amount:")
        input = readln().toInt()
        amount += input

        print("Do you want to add another amount?(yes/no)")
        answer = readln().lowercase()
    } while (answer == "yes")

        println("Divide the value by how many?")
        divisor= readln().toInt()
        total= amount/divisor

        println("The result is $total")

    }

