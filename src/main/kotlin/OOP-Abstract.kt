//Create Abstract Class
//abstract class An(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){
//
//    fun eat(){
//        println("$name sedang makan !")
//    }
//
//    fun sleep(){
//        println("$name sedang tidur !")
//    }
//}
//
//fun main() {
////    var animal = An()
//}


//Create Object from Abstract Class
abstract class Anim {
    abstract var name: String
    abstract fun sound()
}

class Hourse(name: String) : Anim() {
    override var name: String = name

    override fun sound() {
        println("Meow")
    }
}

class Dog(name: String) : Anim() {
    override var name: String = name

    override fun sound() {
        println("Woof")
    }
}

fun main() {
    val hourse: Anim = Hourse("Poni")
//    hourse.name // Output: Meow
    println(hourse.name)

    val dog: Anim = Dog("Bleky")
    dog.name // Output: Woof
}

