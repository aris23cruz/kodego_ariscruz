package Exercises

fun main(){

//    print("Enter Amount")
//    var number1: Int = readln().toInt()
//    var number2: Int = 0
//    for(number in 1..100) {
//        println("Do you want to add another amount?")
//        number2 = number2 + number1
//        var ansNo: String = readln().toString()
//        if (ansNo != "No" && ansNo != "no")
//            number2 += ansNo.toInt()
//
//        }else{
//            println("Divide the value by how many?")
//        var input2: Int = readln().toInt()
//        var input3 = ((number1 + number2) /input2)
//       println("$input3")


    var number: Double = 0.0
    var ans: String = ""
    var sum: Double = 0.0
    var difference: Int = 0

    do {
        print("Enter Amount:")
        number = readln().toDouble()

        number += number

        print("Do you want to add another amount?(Yes/No)")
        ans = readln()
    }
    while (ans == "Yes")
    print("Divide the value by how many?")
    difference = readln().toInt()

    sum = number / difference
    println("The result is $sum")

}
