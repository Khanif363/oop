//Create Abstract Class
//abstract class An(var sub.getName: String, var weight: Double, var age: Int, var isCarnivore: Boolean){
//
//    fun eat(){
//        println("$sub.getName sedang makan !")
//    }
//
//    fun sleep(){
//        println("$sub.getName sedang tidur !")
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
//    hourse.sub.getName // Output: Meow
    println(hourse.name)

    val dog: Anim = Dog("Bleky")
    dog.name // Output: Woof
}

