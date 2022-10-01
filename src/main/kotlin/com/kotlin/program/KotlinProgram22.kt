fun main() {

    println("Enter your name:")
    var name : String = readln()

    println("Enter your age:")
    var age : Int = readln().toInt()

    displayNameAndAge(name,age)
//println ("Enter number1:")
//    var number : Int = readln().toInt()
//    println("The cube is ${number * number * number}")
//
//    println ("Enter number2:")
//    var number2 : Int = readln().toInt()
//    println("The cube is ${number2 * number2 * number2}")

}
//no return no parameter
fun displayName() {
    println("Peter")

}
//no return with 1 parameter
fun displayMessage(msg: String){
    println("The message is \"$msg\"")

}
//no return with 2 parameters
fun displayNameAndAge(name: String,age: Int) {
    println("Your name is $name")
    println("Your age is $age")


    //built-in/standard functions in Kotlin
    //abstraction

    //println()
    //toInt()
    //readln()
    //main()
    //arrayOf()
    //listOf()

    //user-defined function
}
