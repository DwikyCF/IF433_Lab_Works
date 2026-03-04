package oop_00000106196_DwikyChristianFebriano.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}