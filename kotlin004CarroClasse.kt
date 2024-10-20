
fun main () {
    val fiat = Carro ("Vermelho", 1.55, 1.88)
    
    val ferrari = Carro ("preto", 1.47, 1.98)
    println("a cor do Fiat :${fiat.cor}")
    println("a altura do Fiat :${fiat.altura}")
    println("a largura do Fiat :${fiat.largura}")
    println("a cor da ferrari : ${ferrari.cor}")

    
    }
    class Carro (objCor:String, objaltura: Double, objlargura: Double){

        var cor : String = ""
        var largura : Double? = null
        var altura : Double? = null
    
        init{
            this.cor = objCor
            this.largura = objlargura
            this.altura = objaltura
        }
    
    }
