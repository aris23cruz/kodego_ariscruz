package Exercises
fun main(){
    //Using Activity 01 - B and Implement a process where someone can borrow a book.
    //You are tasked to automate a school’s library. Identify the items that can be borrowed in a
    // Library. After listing the different items, identify the characteristics of the items.
    // Use the proper data types.
    println("***E-Library***")
        //borrowers' details
    println("***Fill out the form***")
    println("Enter your Name:")
    var inputName: String = readln()
    println("$inputName")
    println("Date Borrowed[dd/mm/yy]:")
    var inputDate: String = readln()
    println("$inputDate")
            //Main menu
    println("Enter Book Code")
    var deweyDecimal = readln().toDouble()
            //Conditions
    if ((deweyDecimal >= 100) && (deweyDecimal <= 199)) {
        println("Generalities")
    } else if ((deweyDecimal >= 200) && (deweyDecimal <= 299)) {
        println("Philosophy")
    } else if ((deweyDecimal >= 300) && (deweyDecimal <= 399)) {
        println("Literature")
    } else if ((deweyDecimal >= 400) && (deweyDecimal <= 499)) {
        println("Technology")
    } else {
        println("Invalid Input")
    }
    println("Date Return[dd/mm/yy]:")
    var inputDate2: String = readln()
    println("$inputDate2")

    println("Thank you! Please return it on time.")
}
