fun main(){
    var names = arrayOf("Enter number 1:","Enter NUmber 2:","Enter Number 3:","Enter Number 4:","Enter Number 5:")
       println(names[0])
    var number1: Int = readln().toInt()
        println(names[1])
    var number2: Int = readln().toInt()
        println(names[2])
    var number3: Int = readln().toInt()
        println(names[3])
    var number4: Int = readln().toInt()
        println(names[4])
    var number5: Int = readln().toInt()

    var row : Int = 0
    while(row <= 1){
        if(row == 0){
        println("$number1 $number2 $number3 $number4 $number5")}
        else{
            println("$number5 $number4 $number3 $number2 $number1")
        }
        row++

    }




}