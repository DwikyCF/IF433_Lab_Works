package oop_00000106196_DwikyChristianFebriano.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Sukses! Pembayaran Rp$amount dengan Kartu Kredit $accountName berhasil. Terpakai: Rp$usedAmount / Limit: Rp$limit")
        } else {
            println("Gagal! Transaksi ditolak. Pembayaran Rp$amount melebihi sisa limit Kartu Kredit $accountName.")
        }
    }
}