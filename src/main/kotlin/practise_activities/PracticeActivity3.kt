package practise_activities

fun main(){

    var ageGroup: Int = 75
    if ((ageGroup >=1)&&(ageGroup <=17)){
        println("Under Age")
    }else if((ageGroup >= 18)&&(ageGroup <= 30)){
        println("Young Adult")
    }else if((ageGroup >= 31)&&(ageGroup <= 59)){
        println("Adult")
    }else if(ageGroup > 60){
        println("Senior")
    }else if(ageGroup <= 0){
        println("Invalid Age")
    }
}