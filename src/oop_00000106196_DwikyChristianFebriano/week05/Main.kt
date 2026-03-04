package oop_00000106196_DwikyChristianFebriano.week05

/*fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("----------------------------------------")
    }
}*/

fun main () {
    println("\n=== TESTING MATH HELPER  ===")
    val math = MathHelper() // Instansiasi objek MathHelper

    println("Luas Persegi (sisi = 5) : ${math.hitungLuas(5)}")

    println("Luas Persegi Panjang (Panjang = 5 , Lebar = 10): ${math.hitungLuas(5, 10)}")

    println("Luas Lingkaran (Jari Jari = 7.0): ${math.hitungLuas(7.0)}")
}

