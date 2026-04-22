package oop_00000106196_DwikyChristianFebriano.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG",  20,  15.5,  "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 10,  -5.2,  "CLOSED"),
        TradeLog("ETHUSDT", "LONG",  15,  8.3,   "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10,  -12.0, "CLOSED"),
        TradeLog("BTCUSDT", "LONG",  25,  22.1,  "CLOSED"),
        TradeLog("SOLUSDT", "LONG",  10,  5.0,   "OPEN"),
        TradeLog("SOLUSDT", "SHORT", 5,   -3.0,  "OPEN")
    )
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
}

