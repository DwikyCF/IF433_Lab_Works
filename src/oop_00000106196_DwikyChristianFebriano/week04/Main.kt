package oop_00000106196_DwikyChristianFebriano.week04

    /*fun main() {
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
    tesla.accelerate()*/

fun main() {
    println("\n--- Testing Employee Hierarchy ---")

    // 1. Instansiasi objek Manager
    val manager = Manager(name = "Dwiky", baseSalary = 5000000)
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    // 2. Instansiasi objek Developer
    val dev = Developer(name = "Chaychin", baseSalary = 5000000, programmingLanguage = "Kotlin")
    dev.work()
    println("Bonus Developer: Rp ${dev.calculateBonus()}")

}