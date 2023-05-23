//import kotlin.reflect.KProperty
//class Delegate {
//    private var value:String = ""
//    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
//        return "delegating ${property.sub.getName} to $thisRef"
//    }
//    operator fun setValue(thisRef: Any?, property: KProperty<*>, newValue: String) {
//        println("$newValue assigned to ‘${property.sub.getName}’ in $thisRef.")
//        value = newValue
//    }
//}
//
//class Person {
//    var personName by Delegate()
//}
//class Food {
//    var foodName by Delegate()
//}
//
//fun main() {
//    val person = Person()
//    val food = Food()
//
//    person.personName = "Ihsan"
//    food.foodName = "Coca-Cola"
//
//    println(person.personName)
//    println(food.foodName)
//}


interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() { print(x) }
}

class BaseKedua(val x: String) : Base {
    override fun print() { print(x) }
}

class Derived(b: Base, c: Base) : Base by c

fun main() {
    val b = BaseImpl(10)
    val c = BaseKedua("Ini yang Kedua")
    Derived(b, c).print()
}