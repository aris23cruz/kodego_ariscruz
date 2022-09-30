package Exercises
//Implement Activity 02 - B using Classes.
fun main(){
    var bookRequest = Library(200, "John Cruz", "09/17/22")
    bookRequest.inputDetails("Pedro Penduko")
    bookRequest.bookBorrowed(400)
    bookRequest.dateBorrowed("09/20/22")
    bookRequest.dateReturn("09/25/22")

    println("Thank You! Please return it on time.")

}
class Library(var books: Int, var name: String, var date: String){

    init{
        println("***E-Library***")
    }
    fun inputDetails(name: String): String{
        println("Enter your Name:")
        this.name = readln()
        return name
    }
    fun bookBorrowed(books: Int){
        println("Enter Book Code")
        this.books = readln().toInt()
        //Conditions
        if ((this.books >= 100) && (this.books <= 199)) {
            println("Generalities")
        } else if ((this.books >= 200) && (this.books <= 299)) {
            println("Philosophy")
        } else if ((this.books >= 300) && (this.books <= 399)) {
            println("Literature")
        } else if((this.books >= 400) && (this.books <= 499)) {
            println("Technology")
        } else {
            println("Invalid Input")
        }
    }
    fun dateBorrowed(date: String){
        println("Enter Date Borrow: [dd/mm/yyyy]")
        this.date = readln()
        println("Date Borrowed:$date")
    }
    fun dateReturn(date: String){
        println("Enter Date Return: [dd/mm/yyyy]")
        this.date = readln()
        println("Date Return: $date")
    }
}