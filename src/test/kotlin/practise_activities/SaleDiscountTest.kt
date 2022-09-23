package practise_activities

import SaleDiscount
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SaleDiscountTest(){

    @Test
    fun greaterThanZeroLessThanTenThousand(){
        var productSales = SaleDiscount("Calculator", 0)
        assertEquals(0.0, productSales.discount())
    }
    @Test
    fun greaterThanTenThousandLessThanTwentyThousand(){
        var productSales = SaleDiscount("Calculator", 15000)
        assertEquals(750.0, productSales.discount())
    }
    @Test
    fun greaterThanTwentyThousandLessThanFiftyThousand(){
        var productSales = SaleDiscount("Calculator", 25000)
        assertEquals(2500.0, productSales.discount())
    }
    @Test
    fun greaterThanFiftyThousandLessThanOneHundredThousand(){
        var productSales = SaleDiscount("Calculator", 75000)
        assertEquals(11250.0, productSales.discount())
    }
    @Test
    fun greaterThanOneHundredThousand(){
        var productSales = SaleDiscount("Calculator", 250000)
        assertEquals(50000.0, productSales.discount())
    }
}