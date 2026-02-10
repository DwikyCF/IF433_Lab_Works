package oop_00000106196_DwikyChristianFebriano.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- SISTEM DENDA PERPUSTAKAAN ---")

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        println("Info: Lama pinjam tidak valid ($duration), otomatis diubah menjadi 1 hari.")
        duration = 1
    }

    val loan = Loan(title, borrower, duration)

    println("\n--- Detail Peminjaman ---")
    println("Buku    : ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Durasi  : ${loan.loanDuration} hari")
    println("Denda   : Rp ${loan.calculateFine()}")
}