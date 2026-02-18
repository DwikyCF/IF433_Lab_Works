package oop_00000106196_DwikyChristianFebriano.week03

fun main() {
    println("--- WEAPON TESTING ---")

    // 1. Objek Weapon
    val w = Weapon("KYRROW")
    println("Nama Senjata: ${w.name}")
    println("Damage Awal : ${w.damage}")

    // 2. Input Negatif
    println("\nSet damage ke -50")
    w.damage = -50
    println("Damage sekarang: ${w.damage} (tetap 0)")

    // 3. Input Overpowered
    println("\n[Test 2] Set damage ke 9999")
    w.damage = 9999
    println("Damage sekarang: ${w.damage} ( mentok 1000)")

    // 4. Print Tier
    println("\n Cek Tier Senjata")
    println("Status Tier: ${w.tier}")
}