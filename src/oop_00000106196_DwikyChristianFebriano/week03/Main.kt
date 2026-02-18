package oop_00000106196_DwikyChristianFebriano.week03

fun main() {
    println("--- PLAYER LEVELING ---")

    // 1. Player Baru
    val p = Player("Dwiky")
    println("Player dibuat: ${p.username}")
    println("Level awal: ${p.level}")

    // 2. Test Encapsulation (Private XP)
    println("Status XP: Aman, tidak bisa diakses langsung.")

    // 3. Test Tambah XP
    println("\n[Action] Menambah 50 XP")
    p.addXp(50)
    println("Level saat ini: ${p.level} (Harusnya masih 1)")

    // 4. Test Level Up
    println("\n[Action] Menambah 60 XP lagi")
    p.addXp(60)
    println("Level Akhir: ${p.level} (Harusnya sudah 2)")
}