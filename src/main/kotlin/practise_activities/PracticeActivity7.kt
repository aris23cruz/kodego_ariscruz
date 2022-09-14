fun main(){
    println("Enter Length of Rectangle:")
    var number1 : Double = readln().toDouble()
    println("Enter Width of Rectangle")
    var number2 : Double = readln().toDouble()

    println("Perimeter is ${calculatePerimeter(number1,number2)} meters")
    println("Area is ${calculateArea(number1,number2)} meters")
}
fun calculatePerimeter(number1: Double, number2:Double):Double{
    return (number1 * 2) + (number2 * 2)
}
fun calculateArea(number1: Double, number2: Double):Double{
    return number1 * number2
}