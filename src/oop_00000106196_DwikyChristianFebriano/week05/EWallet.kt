package oop_00000106196_DwikyChristianFebriano.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Sukses! Pembayaran Rp$amount dengan E-Wallet $accountName berhasil. Sisa saldo: Rp$balance")
        } else {
            println("Gagal! Saldo tidak cukup untuk membayar Rp$amount dengan E-Wallet $accountName.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top Up untuk E-Wallet $accountName berhasil. Saldo sekarang: Rp$balance")
    }
}