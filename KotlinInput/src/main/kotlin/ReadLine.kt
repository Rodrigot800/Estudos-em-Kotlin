fun main() {
//    println("entre com seu nome: ")
//    var nome = readLine()
//    print("o Tamanho do seu nome é ${nome?.length}")

//    println("\nEntre com um numero inteiro: ")
//    val number = readLine()
//    println("o numero multiplicado por 5 é ${number!!.toInt()* 5}")
//    println("o numero multiplicado por 5 é ${number?.toInt()?.times(5)}")
    do {
        val line = readLine()
        if (line == "fim") {
            println("Fechando o programa")
            break
        }
        println("Entrada informada: $line")
    } while (true)
}
