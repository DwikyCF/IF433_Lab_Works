package oop_00000106196_DwikyChristianFebriano.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

        if (isJammed) {
            throw DispenserJamException()
        }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")

    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    println("=== JADWAL MAKAN PAGI ===")
    try {
        currentKibbleStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
    } catch (e: DispenserJamException) {
        println("ALERT: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("ALERT: ${e.message}")
    } catch (e: Exception) {
        println("ALERT: Kesalahan tidak terduga — ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    println("\n=== JADWAL MAKAN SORE ===")
    val eveningResult = runCatching {
        dispenseKibble(
            requestedGram = 30,
            availableGram = 1000,
            isJammed = false
        )
    }

    eveningResult.onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
    }



}

