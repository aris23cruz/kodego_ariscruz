package practise_activities

fun main(){
    println("Enter String")
    var input : String = readln().toString()

    palindromeChecker(input)

}

fun palindromeChecker(input:String){

    var word2 = input.reversed()

    if (word2 == input){
        println("$input is a Palindrome")
    }else {
        println("$input is not a Palindrome")
    }
}