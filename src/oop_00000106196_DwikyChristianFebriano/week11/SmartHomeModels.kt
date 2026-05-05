package oop_00000106196_DwikyChristianFebriano.week11

data class SmartDevice(
    var name: String,
    var category: String,
    var isOnline: Boolean = false,
    var powerLoad: Int = 0
)