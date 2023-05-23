//fun main() {
//    val someValue = 6
//    println(someValue / 0)
//}


fun main() {
    var someStringValue = "18.0"
    try {
        someStringValue.toInt()
    } catch (e: NumberFormatException) {
        someStringValue = "terjadi error pada saat merubah ke integer"
    } catch (e: NullPointerException) {
        println("terjadi error null")
    } finally {
        println(someStringValue)
    }
}