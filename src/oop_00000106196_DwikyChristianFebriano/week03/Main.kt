package oop_00000106196_DwikyChristianFebriano.week03

fun main() {
    val e = Employee("Budi")
    println("--- Test Validasi Gaji ---")
    e.salary = -1000
    e.salary = 5000000
    println("Gaji Akhir: ${e.salary}")

    println("\n--- Test Enkapsulasi ---")
    e.increasePerformance() // Rating naik jadi 4
    e.printStatus()

    println("\n--- Test Computed Property ---")
    println("Pajak yang harus dibayar (10%): ${e.tax}")
}
