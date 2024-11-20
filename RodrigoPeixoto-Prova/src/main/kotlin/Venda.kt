class Venda(objCodProdVend: Int, objqtdVend: Int, objTotalvend: Float?) {

    var codProdVend: Int = 0
    var qtdVend: Int = 0
    var totalVend: Float? = null

    init {
        this.codProdVend = objCodProdVend
        this.qtdVend = objqtdVend
        this.totalVend = objTotalvend
    }
    // mostrando os atributos
    fun mostrarAtributosVendas(){
        println("\n--------\nCodigo do produto: ${this.codProdVend}\nQuantidade vendido : ${this.qtdVend}\nTotal Vendido : ${this.totalVend}\n-----------\n")
    }

}