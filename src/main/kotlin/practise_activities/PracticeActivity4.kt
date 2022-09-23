package practise_activities

import java.util.PrimitiveIterator

fun main(){
    //SalesDiscount
    println("Enter Product Here:")
    var item1: String = readln().toString()
    println("Enter Product: $item1")
    println("Enter Price Here:")
    var PriceRange: Int = readln().toInt()
    println("Enter Price: $PriceRange")
    println("Price of modem router is $PriceRange")
//Conditions
    if((PriceRange >= 0)&&(PriceRange <= 10000)){
        var NetPrice1: Int = (PriceRange)
        println("0% Discount")
    }else if ((PriceRange >= 10001)&&(PriceRange <= 20000)){
        var Discount2: Double = ((PriceRange)*(0.05))
        var NetPrice2: Double = ((PriceRange)-(Discount2))
        println("Discount is $Discount2")
        println("Net Price is $NetPrice2")
    }else if((PriceRange >= 20001)&&(PriceRange <= 50000)){
        var Discount3: Double = ((PriceRange)*(0.10))
        var NetPrice3: Double = ((PriceRange)-(Discount3))
        println("Discount is $Discount3")
        println("Net Price is $NetPrice3")
    }else if((PriceRange >= 50001)&&(PriceRange <= 100000)){
        var Discount4: Double = ((PriceRange)*(0.15))
        var NetPrice4: Double = ((PriceRange)-(Discount4))
        println("Discount is $Discount4")
        println("Net Price is $NetPrice4")
    }else if (PriceRange > 100000){
        var Discount5: Double = ((PriceRange)*(0.20))
        var NetPrice5: Double = ((PriceRange)-(Discount5))
        println("Discount is $Discount5")
        println("Net Price is $NetPrice5")
    }

}