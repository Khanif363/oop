open class Animal(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean){

    open fun eat(){
        println(name + " sedang makan!")
    }

    open fun sleep(){
        println("$name sedang tidur!")
    }
}

class Cat(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int)
    : Animal(pName, pWeight, pAge, pIsCarnivore) {

    fun playWithHuman() {
        println("$name bermain bersama Manusia !")
    }

    override fun eat(){
        println("$name sedang memakan ikan !")
    }

    override fun sleep() {
        println("$name sedang tidur di bantal !")
    }
}

fun main() {
    var cat = Cat("Oyen", 15.0, 2, false, "Orange", 4)
    cat.eat()
}