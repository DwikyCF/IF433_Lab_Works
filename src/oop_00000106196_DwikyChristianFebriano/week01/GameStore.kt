package oop_00000106196_DwikyChristianFebriano.week01

fun main() {
    val gameTitle = "Elden Ring Shadow of the Erdtree"
    val price = 799000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(title = gameTitle, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int) = if (price > 500_000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(title: String, finalPrice: Int) {
    println("=== Struk Pembelian SteamKW ===")
    println("Judul Game : $title")
    println("Harga Akhir: Rp $finalPrice")
}