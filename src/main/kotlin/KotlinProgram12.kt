fun main(){
    var myString: String? = null
    println(myString)

    //?.let{}
    var count = myString?.let{2+2}
    println(count)

    //elvis operator ?:
    val count2 = myString?.length ?: -1
    println(count2)

    //!!
    val counter3 = myString!!.length
    println(counter3)

}