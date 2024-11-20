class DrumKit (var hasTopHat: Boolean, var hasSnare: Boolean) {

    fun playSnare(){
        if (hasSnare){
            println("bang bang bang!")
        }
    }
    fun playStopHat(){
        if (hasTopHat){
            println("ding ding  ba-da-bing!")
        }
    }
}