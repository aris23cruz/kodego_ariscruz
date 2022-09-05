fun main(){
    var ctr1 : Int = 1
    while(ctr1 <= 5){
        var ctr2 : Int = 1
        while(ctr2 <= 5){
            print("@")      //this will display @@@@@. println will display vertically.
            ctr2++
        }
        println()
        ctr1++
    }
}