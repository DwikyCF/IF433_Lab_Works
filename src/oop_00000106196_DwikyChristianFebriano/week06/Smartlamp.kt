package oop_00000106196_DwikyChristianFebriano.week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Lampu pintar '$name' menyala. Ruangan menjadi terang.")
    }

    override fun turnOff() {
        println("Lampu pintar '$name' dimatikan. Ruangan menjadi gelap.")
    }
}