package oop_00000106196_DwikyChristianFebriano.week03

fun main() {
    println("--- APLIKASI KARYAWAN ---")

    val e = Employee("Budi")

    println("--- Test Validasi Gaji ---")
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    println("\n--- Test Enkapsulasi ---")
    e.increasePerformance()
    e.printStatus()

    println("\n--- Test Computed Property ---")
    println("Pajak yang harus dibayar (10%): ${e.tax}")
}
