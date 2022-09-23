fun main(){
    try {
        println("Enter Product Name:")
        var product = readln().lowercase()
        println("Enter Price:")
        var price: Int = readln().toInt()
        var productSales = SaleDiscount(product, price)
        productSales.discount()
        println("Thank You for Shopping!")
    }catch (e:NumberFormatException){
        println(e)
        println("Enter Valid Number")
    }
}

class SaleDiscount(var product: String, var price: Int){

    init {
        println("***Promo Discount on Selected Items***")
    }
    fun discount():Double{
        println("Price of ${this.product} is ${this.price}")
            if ((this.price >= 0) && (this.price <= 10000)) {
                println("0% Discount")
                return 0.0
            } else if ((this.price >= 10001) && (this.price <= 20000)) {
                var discount2: Double = ((this.price) * (0.05))
                var netPrice2: Double = ((this.price) - (discount2))
                println("Discount is $discount2")
                println("Net Price is $netPrice2")
                return discount2
            } else if ((this.price >= 20001) && (this.price <= 50000)) {
                var discount3: Double = ((this.price) * (0.10))
                var netPrice3: Double = ((this.price) - (discount3))
                println("Discount is $discount3")
                println("Net Price is $netPrice3")
                return discount3
            } else if ((this.price >= 50001) && (this.price <= 100000)) {
                var discount4: Double = ((this.price) * (0.15))
                var netPrice4: Double = ((this.price) - (discount4))
                println("Discount is $discount4")
                println("Net Price is $netPrice4")
                return discount4
            } else if (this.price > 100000) {
                var discount5: Double = ((this.price) * (0.20))
                var netPrice5: Double = ((this.price) - (discount5))
                println("Discount is $discount5")
                println("Net Price is $netPrice5")
                return discount5
            }
        return 0.0
    }
}