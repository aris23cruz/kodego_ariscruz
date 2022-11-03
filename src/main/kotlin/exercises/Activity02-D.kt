package exercises
//Implement Activity 02 - A using Classes.
fun main(){
    val studentStatus = StudentDirectory("John", 85)
    studentStatus.studentListing()
    studentStatus.gradingSystem()
    studentStatus.displayStatus()
    println("Please submit the names for recommendations")

}

class StudentDirectory(var name:String, var grade:Int) {
    var studentGrade = mutableMapOf<Int, String>()
    var studentName2 = mutableListOf<String>()

    init {
        println("---Student Directory---")

    }

    fun studentListing() {
        while (true) {
            println("Do you want to enter new student?")
            val answer: String = readln().lowercase()
            if (answer == "yes") {
                println("Enter Student Full Name:[Last Name, First Name MI.]")
                val nameInput: String = readln().uppercase()
                studentName2.add(nameInput)
            } else {
                println("You Enter Name is:")
                for (value in studentName2) {
                    println(value)
                };break
            }
        }
    }

    fun gradingSystem() {
        println("Enter Student Grade")
        this.grade = readln().toInt()
        if ((grade >= 75) && (grade <= 79)) {
            println("Status is Fairly Satisfactory")
        } else if ((grade >= 80) && (grade <= 84)) {
            println("Status is Satisfactory")
        } else if ((grade >= 85) && (grade <= 89)) {
            println("Status is Very Satisfactory")
        } else if ((grade >= 90) && (grade <= 94)) {
            println("Status is Outstanding")
        } else if ((grade >= 95) && (grade == 100)) {
            println("Status is Excellent")
        } else if (grade > 101) {
            println("Enter a valid grade")
        } else {
            println("Status is Failed")
        }
    }

    fun displayStatus() {
        studentGrade.put(grade, studentName2.toString())
        for (value in studentGrade.entries) {
            println(value)
        }
    }
}