open class VisibilityModifier(var name: String, private var tahun: String, protected var harga: Int) {
    fun getTahun(): String {
        return tahun
    }

    fun setTahun(newTahun: String) {
        tahun = newTahun
    }
}

class TestProtected(name: String, tahun: String, harga: Int) : VisibilityModifier(name, tahun, harga) {
    fun printL() {
        println(harga)
    }
}

fun main() {
//    val vis = VisibilityModifier("Toyota", "2023", 500000000)
//    vis.setTahun("2021")

    val test = TestProtected("Toyota", "2023", 500000000)
    test.printL()
}