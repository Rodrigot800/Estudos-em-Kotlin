open class Carro {
    var modelo = "Gol"


    protected open fun injetarCombustivel(){
        println("Injeção de combustivel")
    }

    fun acelerar() {
        injetarCombustivel()
        println("Acelerar o carro $modelo")
    }
}

class Gol : Carro(){
    override fun injetarCombustivel(){
        println("injetando combustivel no turbocompressor do GOL")
    }
}

fun main(){
    val gol = Gol()
    gol.acelerar()

}