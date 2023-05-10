class Person(val firstName:String = "Joe")

val Person.lastName:String
    get() = "Muhammad"

fun Person.getName():String {
    return "Hi My name is ${this.firstName} ${this.lastName}"
}
fun main(){
    val person = Person()
    val getNamePerson = person.getName()
    val getLastName = person.lastName
    println(getLastName)
    // result –> Hi My name is Joe Mama
}