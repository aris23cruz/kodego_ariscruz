fun main(){
    var mySet = setOf(3,6,1,2,2,2,2,2,2,2)

    println(mySet.count())
    println(mySet.sum())
    println(mySet.average())

    for (data in mySet){
        print(data)
    }

    var setA = setOf(2,5,7,8)
    var setB = setOf(1,3,5,7)

    //union
    println(setA.union(setB))
    //intersection
    println(setA.intersect(setB))
    //difference
    println(setA.minus(setB))
    println(setB.minus(setA))


}