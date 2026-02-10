package oop_00000106196_DwikyChristianFebriano.week02

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
) {

    fun calculateFine(): Int {
        // Rumus: Jika durasi > 3 hari, denda = (Durasi - 3) * 2000
        // Jika tidak, denda 0
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}