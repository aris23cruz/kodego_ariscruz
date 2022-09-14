package practise_activities

fun main(){

    println(maxNumber(3,2,5))
}

fun maxNumber(num1:Int, num2:Int, num3:Int):Int{
    var maxValue : Int = 0 //maxValue is always 0

    when {
        (num1 > num2)&&(num3 < num2) -> maxValue += num1
        (num2 > num1)&&(num3 < num1) -> {
            maxValue += num2
        }
        else -> {
            maxValue += num3
        }
    }
    return maxValue
}