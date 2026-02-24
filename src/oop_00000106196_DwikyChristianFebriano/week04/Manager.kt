package oop_00000106196_DwikyChristianFebriano.week04

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {

    // Override perilaku kerja
    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    // Override hitungan bonus
    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}