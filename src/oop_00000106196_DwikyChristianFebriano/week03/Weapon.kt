package oop_00000106196_DwikyChristianFebriano.week03

class Weapon(val name: String) {

    var damage: Int = 0
        set(value) {
            if (value < 0) {
                // negatif = tolak dan tidak mengubah nilai asli
                println("Warning: Damage tidak boleh negatif! Nilai tidak berubah.")

            } else if (value > 1000) {

                println("Warning: Damage terlalu besar! Di-set ke 1000.")
                field = 1000
            } else {

                field = value
            }
        }

    val tier: String
        get() {
            return if (damage > 800) {
                "Legendary"
            } else if (damage > 500) {
                "Epic"
            } else {
                "Common"
            }
        }
}