package oop_00000106196_DwikyChristianFebriano.week07

fun main() {
    fun main() {
        println("=== TEST SINGLETON ===")
        println("Status: ${DatabaseManager.connectionStatus}")
        DatabaseManager.connect()

        println("\n=== TEST COMPANION OBJECT ===")
        val client = NetworkClient.createClient()
        client.connect()
    }
}