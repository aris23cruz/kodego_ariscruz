package Exercises
//Implement Activity 02 - C using Classes
fun main(){
    val mainMenu = mapOf(1 to "Add to Inventory",2 to "Remove from Inventory",3 to "EXIT" )
    val grocery = Inventory()
    while(true){
        println("***************")
        println("Main Menu")
        for (value in mainMenu){
            println(value)
        }
        println("***************")
        val inputMenu = readln().toInt()
        println("***************")
        if (inputMenu == 1){
            println("Add to Inventory")
            println("***************")
            grocery.addItem()
        }else if(inputMenu == 2){
            println("Remove from Inventory")
            println("***************")
            grocery.removeItem()
        }else if (inputMenu == 3){
            println("--DONE--")
            break
        }
    }

}

class Inventory {
    private val category = mapOf(1 to "Can Goods", 2 to "Beverages", 3 to "Meat", 4 to "Dry Goods", 5 to "EXIT")
    private val inventory = mutableMapOf<Int, String>()

    init {
        println("***Grocery Inventory***")
    }

    fun addItem() {
        println("Select Category")
        for (value in category.entries) {
            println(value)
        }
        println("***************")
        when (readln().toInt()) {
            1 -> {
                println("Input the quantity")
                val input = readln().toInt()
                inventory[input] = "Can Goods"
                println("You add $input item/s to Can Goods")
                for (value in inventory.entries) {
                    println(value)
                }
            }

            2 -> {
                println("Input the quantity")
                val input = readln().toInt()
                inventory[input] = "Beverages"
                println("You add $input item/s to Beverages")
                for (value in inventory.entries) {
                    println(value)
                }
            }

            3 -> {
                println("Input the quantity")
                val input = readln().toInt()
                inventory[input] = "Meat"
                println("You add $input item/s to Meat")
                for (value in inventory.entries) {
                    println(value)
                }
            }

            4 -> {
                println("Input the quantity")
                val input = readln().toInt()
                inventory[input] = "Dry Goods"
                println("You add $input item/s to Dry Goods")
                for (value in inventory.entries) {
                    println(value)
                }
            }

            5 -> {
                println("Got to Main Menu")
            }
        }
    }

    fun removeItem() {
        println("Select category")
        for (value in category.entries) {
            println(value)
        }
        println("***************")
        when (readln().toInt()) {
            1 -> {
                println("Quantity remove")
                val input = readln().toInt()
                inventory.remove(input, "Can Goods")
                println("You remove $input item/s to Can Goods")
                for (value in inventory.entries) {
                    println(value)
                }
            }

            2 -> {
                println("Quantity Remove")
                val input = readln().toInt()
                inventory.remove(input, "Beverages")
                println("You remove $input item/s to Beverages")
                for (value in inventory.entries) {
                    println(value)
                }
            }

            3 -> {
                println("Quantity Remove")
                val input = readln().toInt()
                inventory.remove(input, "Meat")
                println("You remove $input item/s to Meat")
                for (value in inventory.entries) {
                    println(value)
                }
            }

            4 -> {
                println("Quantity Remove")
                val input = readln().toInt()
                inventory.remove(input, "Dry Goods")
                println("You remove $input item/s to Dry Goods")
                for (value in inventory.entries) {
                    println(value)
                }
            }

            5 -> {
                println("Go to Main Menu")
            }
        }
    }
}