package oop_00000106196_DwikyChristianFebriano.week06

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Smart Speaker '$name' menyala. Siap menerima perintah suara.")
    }

    override fun turnOff() {
        println("Smart Speaker '$name' dimatikan.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}