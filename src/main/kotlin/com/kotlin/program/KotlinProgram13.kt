fun main(){
    //implicit declaration
    //indeces             0      1      3
    //array size = 3
    var names = arrayOf("John","Paul","Mark")
    println(names[1]) //will display the index represents

    //explicit
    var numbers = arrayOf<Int>(1,2,3,4,5,110)
    println(numbers[4])

    //array size
    println(numbers.size)

    //how to change the elements in an array
    println(names[0])
    println(names[1])
    println(names[2])
    //names[1] = "Matthews"
    //another way
    names.set(1,"Matthew")
    println(names.get(0))
    println(names.get(1))
    println(names.get(2))

}