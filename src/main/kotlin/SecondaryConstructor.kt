class Car(name:String,type:String){
    var carName:String
    var carType:String
    var isMatic:Boolean
    init {
        this.carName = name
        this.carType = type
        this.isMatic = false
    }
    constructor(name:String,type: String,isMatic:Boolean):
            this(name,type){
        this.isMatic = isMatic
    }
}

fun main() {
    val toyota = Car("Toyota", "2023")
    println(toyota.isMatic)
}