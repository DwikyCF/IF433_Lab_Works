package oop_00000106196_DwikyChristianFebriano.week04

class Developer (name: String, baseSalary: Int, val programmingLanguage: String) : Employee(name, baseSalary) {
    // Override perilaku kerja
    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }
}