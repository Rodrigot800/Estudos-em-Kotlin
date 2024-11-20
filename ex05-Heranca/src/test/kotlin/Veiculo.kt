open class Veiculo(tipoObj:String , corObj: String,larguraObj: Double, alturaObj: Double) {
        var tipo:String = ""
        var cor: String = ""
        var altura: Double? = null
        var largura: Double? = null

        init {
            this.tipo = tipoObj
            this.cor = corObj
            this.altura = alturaObj
            this.largura = larguraObj
        }

        fun detalhesVeiculo() {
            println("$tipo tem a  cor $cor, tem altura de $altura e largura de $largura")
        }
        fun primeiraMacha(){
            println("passando a primeira macha")
        }
        fun segundaMacha(){
            println("passando a primeira macha")
        }
        fun marchas(){
            this.primeiraMacha()
            this.segundaMacha()
        }

    }