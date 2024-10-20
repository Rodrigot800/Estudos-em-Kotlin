fun main() {
    
    Animal("cachorro", "rosa").falar()
    
    val puk = Animal("cachorro", "preto")
    puk.falar()
    
    println(puk.corPelo)
    println(puk.raca)

    val tom = Animal("gato", "cinza")
    tom.falar()
    println(tom.corPelo)
}

class Animal(val especie: String, val corPelo: String) {
    var fala: String = ""
    var raca: String = ""

    init {
        if (especie == "cachorro") {
            fala = "au"
        } else if (especie == "gato") {
            fala = "miau"
        } else {
            fala = ""
        }
    }
    init {
        if (especie == "cachorro" && corPelo == "preto") {
            raca = "pastor alemão"
        } else if (especie == "gato" && corPelo == "preto") {
            fala = "pantera"
        } else {
            raca = "vira lata"
        }
    }

    fun falar() {
        println(fala)
    }
}
