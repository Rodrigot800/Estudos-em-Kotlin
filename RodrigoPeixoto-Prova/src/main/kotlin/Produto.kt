class Produto (objCodProd: Int, objNomeProd: String, objQtdProd: Int, objValorProd: Float?) {
    var codProd: Int = 1
    var nomeProd : String =""
    var qtdProd: Int = 0
    var valorProd: Float? = null
    init {
        this.codProd = objCodProd
        this.nomeProd = objNomeProd
        this.qtdProd = objQtdProd
        this.valorProd = objValorProd
    }
    // metado para mostrar os atribuitos do produto cadastrado
    fun mostrarProdutos(i:Int){
        println("\n----------\nProduto $i\nCodigo do Produto: ${this.codProd}\nNome do Produto : ${this.nomeProd}\nQuantidade do produto: ${this.qtdProd}\nValor do produto : ${this.valorProd}\n----------------------\n")
    }
    // metado para retornar o estoque
    fun returnarEstoque(): Int {
       return qtdProd
    }
    // metado para retornar o codigo do produto
    fun returnarCodigo(): Int{
        return codProd
    }
    // metado para atualizar o estoque
    fun atualizarEstoque(qtd: Int){
        this.qtdProd -= qtd
        println("Estoque atualizado!\n")
    }
    // metado para retornar o valor do produto
    fun returnValor(): Float?{
        return (valorProd)
    }


}