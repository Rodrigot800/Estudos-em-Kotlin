fun main () {
    val d = DrumKit(true,true)
    d.playStopHat()
    d.playSnare()
    d.playStopHat()
    d.hasSnare = false
    d.playSnare()
}