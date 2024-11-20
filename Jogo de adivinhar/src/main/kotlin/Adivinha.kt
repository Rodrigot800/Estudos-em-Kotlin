import java.util.*
import kotlin.random.Random

class Adivinha ()  {

    fun iniciarJogo(){
        var cont : Boolean = true
        do {
            val reader = Scanner(System.`in`)
            println("der um palpite de número: ")
            val palp : Int = reader.nextInt()
            val numAleatorio = Random.nextInt(1,10)
            if (palp == numAleatorio){
                println("parabéns")
                cont = false
            } else {
                println("Você errou, o número era $numAleatorio\n")
                cont = true
            }
        }while (cont)


    }
}