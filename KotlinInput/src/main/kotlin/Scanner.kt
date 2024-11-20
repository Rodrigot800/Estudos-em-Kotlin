import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val listaFatura = arrayOfNulls<Fatura>(3)
    var i = 0
//
//    print("Entre com um numeoro inteiro : ")
//    val number : Float = reader.nextFloat()
//    println("Você entrou com : $number")

    do {

        println("\ndigite o nome do produto:")
        var nome: String = reader.nextLine()
        println("digite a descrição do produto : ")
        var desc: String = reader.nextLine()
        println("digite a quantidade do produto :")
        var quant: Int = reader.nextInt()
        println("digite o preço do produto : ")
        var preco: Double = reader.nextDouble()

        listaFatura[i] = Fatura(nome, desc, quant, preco)
        listaFatura[i]?.produtoAtributos()
        listaFatura[i]?.totalFatura()
        i++
        reader.nextLine()
    }while (i < 3)

}
