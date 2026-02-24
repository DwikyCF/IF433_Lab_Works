package oop_00000106196_DwikyChristianFebriano.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val tesla = ElectricCar(brand = "Tesla", numberOfDoors = 2, batteryCapacity = 100)
    tesla.openTrunk()
    tesla.honk()
    tesla.accelerate()

}