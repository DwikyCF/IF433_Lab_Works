package oop_00000106196_DwikyChristianFebriano.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}