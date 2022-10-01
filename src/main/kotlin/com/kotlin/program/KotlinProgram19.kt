fun main(){
    var myList = listOf(2,5,3,1)//read-only
    var myList2 = mutableListOf<Int>()
    myList2.add(7)
    myList2.add(8)
    myList2.add(9)

    myList2[0] = 10

    for(myListValue in myList2){
        println(myListValue)
    }

    //get 2nd element
    println(myList[1])
    //display size
    println(myList.size)
    //traverse list
    for (listValue in myList){
        println(listValue)
    }
}