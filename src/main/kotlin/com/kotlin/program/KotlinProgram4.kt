fun main(){
    var number : Int = 10

    if(number < 10){
        println("hello")
    }


    var grade : Int = 70
    if((grade >=96)&&(grade <= 100)){
        println("1.0")
    }else if((grade >=86)&&(grade <=95)){
        println("1.75")}
        else if((grade >=76)&&(grade <=85)){
            println("2.25")}
            else if(grade < 75 ){
                println("5.0")}
                else{
                    print("invalid grade")
                }
    }

    //range
//    var idNumber : Int = 1
//    if((idNumber >=1)&&(idNumber <=3)){
//        println("valid id number")
//        println("SUCCESS!!!!")
//    }
//    println("Line Ends")
//}