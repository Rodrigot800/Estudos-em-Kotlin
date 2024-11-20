class Fatura (nomeProdObj: String, descricaoProdObj: String, quantProdObj: Int, precoProdObj: Double) {

    var nomeProd: String = ""
    var descricaoProd : String =""
    var quantProd: Int = 0
    var precoProd: Double? =0.0

    init {
        this.nomeProd = nomeProdObj
        this.descricaoProd = descricaoProdObj
        this.quantProd = quantProdObj
        this.precoProd = precoProdObj
    }

    fun totalFatura(){
        println("Total da fatura ${this.quantProd * this.precoProd!!}")
    }
    fun produtoAtributos(){
        println("\nnome : ${this.nomeProd}\ndescrição do ${this.nomeProd} : ${this.descricaoProd}\nquantidade de ${this.nomeProd} : ${this.quantProd}\npreço do ${this.nomeProd} : ${this.precoProd}")
    }

}