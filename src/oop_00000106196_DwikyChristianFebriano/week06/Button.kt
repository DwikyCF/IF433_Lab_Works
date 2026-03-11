package oop_00000106196_DwikyChristianFebriano.week06

class Button(override val name: String) : Clickable {

    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}