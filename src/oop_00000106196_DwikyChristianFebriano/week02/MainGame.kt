package oop_00000106196_DwikyChristianFebriano.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- NUSANTARA LEGENDS ---")

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val heroDamage = scanner.nextInt()

    val myHero = Hero(heroName, heroDamage)

    var enemyHp = 100
    println("Musuh muncul dengan HP: $enemyHp\n")

    while (myHero.isAlive() && enemyHp > 0) {
        println("--- MULAIIII ---")
        println("1. Serang")
        println("2. Kabur")
        print("Pilihan: ")
        val choice = scanner.nextInt()

        if (choice == 1) {

            myHero.attack("Musuh")
            enemyHp -= myHero.baseDamage
            if (enemyHp < 0) enemyHp = 0 // Cegah minus visual
            println("Musuh terkena $heroDamage! Sisa HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                println("\n--- Giliran Musuh ---")

                val enemyDamage = (10..20).random()
                println("Musuh membalas serangan!")
                myHero.takeDamage(enemyDamage)
            }

        } else if (choice == 2) {
            println("KOK KABUR SIH BANG? IZINNNN")
            break
        } else {
            println("Aksi tidak valid, giliran terbuang!")
        }
        println("")
    }

    println("--- SELESAIII ---")
    if (myHero.isAlive() && enemyHp <= 0) {
        println("Selamat! ${myHero.name} menang!")
    } else if (!myHero.isAlive()) {
        println("Game Over... ${myHero.name} telah gugur.")
    } else {
        println("MAIN LAGI YAAAAA HIHI !!")
    }
}