fun main (){
    val produto01 = Produto("farinha", 5.5f, 11)
    println("\n${produto01.nome}")
    produto01.valorTotal()
    produto01.produtoDis()

    val produto02 = Produto("mortadela", 11.5f, 0)
    println("\n${produto02.nome}")
    produto02.valorTotal()
    produto02.produtoDis()

    
}
class Produto (objProduto: String , objPreco: Float,  objQuantProd: Int ){
    var nome: String = ""
    var preco: Float = 0.0f
    var QuantProd: Int = 0

    init {
        this.nome = objProduto
        this.preco = objPreco
        this.QuantProd = objQuantProd
    }
    fun valorTotal(){
        println("valor total do produto ${this.nome} : ${this.preco * this.QuantProd}")
    }
    fun produtoDis(){
        if(this.QuantProd > 0){
            println("produto Disponivel")

        }else{
            println("produto indisponivel")
        }
    }
}