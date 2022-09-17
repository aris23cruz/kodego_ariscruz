fun main(){
    var myPhone = MobilePhone("Samsung", "Galaxy",6.0,64,8)
    println("************")
    var myPhone2 = MobilePhone("Sony")
    println("************")
    var myPhone3 = MobilePhone(16)
    myPhone.batteryLife()

}
class MobilePhone(var brand: String,var model: String, var size: Double,  var storage: Int, var ram: Int ){

    init {
        println("My phone has:")
        println("Brand is $brand")
        println("Model is $model")
        println("Screen size is $size inches")
        println("Storage of $storage GB")
        println("The RAM is $ram GB")
    }
    constructor(brand:String):this(brand,"A70",5.5, 32,8)
    constructor(ram: Int):this("Samsung","Galaxy", 6.5,64,ram)
    fun chargingTime(){
        println("My phone charges in minutes")
    }
    fun dataSpeed(){
        println("My phone reads data in lightning speed")
    }
    fun talkTime(){
        println("We can talk a whole day")
    }
    fun batteryLife(){
        println("My phone last for days")
    }
    fun processor(){
        println("My phone process lightning fast with $ram GB")
    }
}