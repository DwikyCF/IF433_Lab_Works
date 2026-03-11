package oop_00000106196_DwikyChristianFebriano.week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("Smart CCTV '$name' menyala.")
        startRecord()
    }

    override fun turnOff() {
        println("Smart CCTV '$name' dimatikan.")
        stopRecord()
    }

    override fun startRecord() {
        println("Mulai merekam video pengawasan...")
    }
}