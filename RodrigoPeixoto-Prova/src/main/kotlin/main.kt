import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val produtoCadastros = arrayOfNulls<Produto>(1)
    val vendaProduto = arrayOfNulls<Venda>(1)
    var iPC = 0
    var iV = 0
    do {
        // menu do programa
        println("1- Cadastrar um Produto")
        println("2- Mostrar os dados do Produto")
        println("3- Vender um produto")
        println("4- Mostrar os dados do produto vendido")
        println("5- Sair do Programa")
        val op = readln()

        if (op == "1") {
            // ira ler os atributos lidos pelo teclado e ira criar um objeto com esses atributos digitados
            println("Digite o Codigo do produto:")
            val codProd: Int = reader.nextInt()
            println("Digite o nome do produto:")

            val nomeProd: String = readln()
            println("Digite a quantidade do produto:")
            val qtdProd: Int = reader.nextInt()
            println("Digite o valor do Produto:")
            val valorProd: Float = reader.nextFloat()
            produtoCadastros[iPC] = Produto(codProd, nomeProd, qtdProd, valorProd)
            reader.nextLine()
        }
        if (op == "2") {
            // ira mostrar os atributos da classe Produto
            produtoCadastros[iPC]?.mostrarProdutos(iPC)
        }
        if (op == "3") {
            // ler o codigo e verifica se existe
            println("digite o codigo do produto:")
            val codProd: Int = reader.nextInt()
            if (codProd == produtoCadastros[iV]?.returnarCodigo()) {
                // ler a quantidade a ser vendido e verifica no estoque
                println("Digite a quantidade do produto a serem vendidos:")
                val qtdProd: Int = reader.nextInt()
                if (qtdProd <= produtoCadastros[iV]?.returnarEstoque()!!) {
                    // cria o objeto venda com o codigo do produto, quantidade e valor total
                    val valor: Float? = produtoCadastros[iV]?.returnValor()?.times(qtdProd)
                    vendaProduto[iV] = Venda(codProd, qtdProd, valor)
                    produtoCadastros[iPC]?.atualizarEstoque(qtdProd)
                    println("produto Vendido\n")
                } else {
                    println("\nestoque insuficiente\n")
                }
            } else {
                println("\nproduto não cadastrado\n")
            }

        }
        if (op == "4") {
            // mostrar atributos da classe Venda
            vendaProduto[iV]?.mostrarAtributosVendas()
        }
        if (op == "5") {
            // finalizando programa
            println("Saindo....")
            break
        }

    } while (true)
}