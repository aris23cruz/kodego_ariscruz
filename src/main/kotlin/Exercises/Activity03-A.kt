package exercises

fun main() {
    var amount: Double = 0.0
    var answer: String = ""
    var divisor: Int = 0
    var total: Double = 0.0
    var input: Int = 0

    try {
        do {
            print("Enter Amount:")
            input = readln().toInt()
            amount += input

            print("Do you want to add another amount?(yes/no)")
            answer = readln().lowercase()
        } while (answer == "yes")

        println("Divide the value by how many?")
        divisor = readln().toInt()
        total = amount / divisor

        println("The result is $total")
    }catch (e:NumberFormatException){
        println(e.message)
        println("Enter Digits Only")
    }catch (e:ArithmeticException){
        println(e.message)
        println("Zero 0 is not valid")
    }

   try {
       println("Enter Your 1st Word")
       var word1: String = readln()
       if(word1.isEmpty()) {
           throw Exception()
       }
       println("Enter Your 2nd  Word")
       var word2: String = readln()
       var combine: String = ""
       if (word2.isEmpty()){
           throw Exception()
       }

       for (unique1 in word1.indices) {
           for (element in word2) {
               if (word1[unique1] == element) {
                   combine += word1[unique1]
               }
           }
       }
       for (element in combine) {
           var remove = element + ""
           word1 = word1.replace(remove, "")
           word2 = word2.replace(remove, "")
       }
       println("The unique character for 1st word $word1")
       println("The unique character for 2nd word $word2")
   }catch (e:Exception){
       println(e.message)
       println("Enter Valid Word")
   }

    try {
        println("Enter a Word:")
        var word3: String = readln().toString()
        if (word3.isEmpty()){
            throw Exception()
        }
        var word4 = word3.reversed()
        if (word4.isEmpty()){
            throw Exception()
        }
        //to check if the word is a palindrome
        if (word4 == word3) {
            println("$word3 is a Palindrome")
        } else {
            println("$word3 is not a Palindrome")
        }
    }catch (e:Exception){
        println(e.message)
        println("Enter a Valid Word")
    }

}