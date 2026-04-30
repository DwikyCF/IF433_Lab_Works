package oop_00000106196_DwikyChristianFebriano.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 0.85))
    coinRepo.add(Coin("ETH", 12.5))
    coinRepo.add(Coin("USDT", 5000.0))
    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("=== CRYPTO WALLET DASHBOARD ===") //Test Berhasil
    println("Status: ${response.status}")
    println("\n--- DAFTAR KOIN ---")
    response.data.forEach { coin ->
        println("Koin: ${coin.name} | Balance: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 500.0))
    txRepo.add(Transaction("TX002", -150.0))
    txRepo.add(Transaction("TX003", 1200.0))

    println("\n--- DAFTAR TRANSAKSI ---")
    txRepo.getAll().forEach { tx ->
        println("ID: ${tx.id} | Amount: ${tx.amount} USD")
    }
}