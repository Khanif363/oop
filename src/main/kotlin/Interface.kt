//Impelement Interface
//interface IStudent {
//    var sifat: String
//    fun doAnithing()
//}
//
//class Ari(sifat: String): IStudent {
//
//    override var sifat = sifat
//    override fun doAnithing() {
//        println("Makan")
//    }
//}
//
//fun main() {
//    var ari = Ari("Sabar")
//    ari.doAnithing()
//    println(ari.sifat)
//}


interface IFly {
    fun fly()
    val numberOfWings: Int
}

fun flyWithWings(bird: IFly) {
    bird.fly()
}

fun main() {
    flyWithWings(object : IFly {
        override fun fly() {
            if(numberOfWings > 0) println("Flying with $numberOfWings wings")
            else println("I'm Flying without wings")
        }
        override val numberOfWings
            get() = 0
    })
}