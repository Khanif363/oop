class Hewan(
    nama: String,
    var habitat: String,
    var jenisMakanan: String,
    var jumlahMakanan: Int = 0
) {
    var nama:String = nama
        get() {
            return "Hewan $field"
        }
        set(value) {
            field = value
        }
    fun eat(makanan:String)= println("${nama} sedang makan $makanan")
}
fun main() {
    val elang = Hewan(
        "Elang",
        "Udara",
        "Karnivora",
        30
    )
    elang.eat("daging")
}