fun main(){
    //Instantiation - process of creating an object
    var myObject = MyClass("Hello World")
    var myObject2 = MyClass("hi World!")
    //for Generics only
    var myGenericsObject = MyGenericsClass("")// can input any data types
}
//Generics
class MyGenericsClass<T>(value: T){
    init{
        println(value.toString().length)
    }
}
class MyClass(value : String){
    init {
        println(value)
    }
}