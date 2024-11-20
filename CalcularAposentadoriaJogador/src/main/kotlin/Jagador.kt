import java.time.LocalDate
import java.util.Scanner
class Jogador (objNome:String, objPosicao:String,objAnoNasc:Int, objAltura:Double,objPeso:Double) {
    private var nome:String = ""
    private var posicao : String= ""
    private var anoNasc: Int = 0
    private var altura: Double=0.0
    private var peso: Double=0.0
     init {
         this.nome=objNome
         this.posicao=objPosicao
         this.anoNasc = objAnoNasc
         this.altura = objAltura
         this.peso=objPeso
     }

    fun mostrarDados(){
        println("nome : ${this.nome}\nposição : ${this.posicao}\nano de nascimento : ${this.anoNasc}\naltura : ${this.altura}\npeso : ${this.peso}")
    }

    fun calcIdadeJogador(){
        val anoAtual = LocalDate.now().year
        println("a idade do jogador ${this.nome} é : ${ anoAtual - this.anoNasc  }")
    }

    fun calcAposentadoria(){
        val anoAtual = LocalDate.now().year
        val idade = anoAtual - this.anoNasc
       // println("falta ${-this.anoNasc}")
        
        if (this.posicao == "defesa"){
            println("falta ${40 - idade} para o ${this.nome} se aposentar")
        }
        if (this.posicao == "meio-campo"){
            println("falta ${38 - idade} para o ${this.nome} se aposentar")
        }
        if (this.posicao == "atacante"){
            println("falta ${35 - idade} para o ${this.nome} se aposentar")
        }
    }

}

fun main (){
    val reader = Scanner(System.`in`)
    val jogador = arrayOfNulls<Jogador>(1)
    do {
        println("1- Cadastrar objeto jogador")
        println("2- Mostrar os dados do jogador")
        println("3- calcular e mostrar a idade do jagador")
        println("4- calcular e mostrar o tempo que falta para o jagador se aposentar")
        println("5- Sair do Programa")
        val op = readln()

        if (op == "1"){
            println("digite o nome do jogador :")
            val nome:String = readln()
            println("digite a posição do jogador :")
            val posicao :String = readln()
            println("digite o ano de nascimento do jogador :")
            val anoNasc :Int = reader.nextInt()
            println("digite a altura do jogador :")
            val altura :Double = reader.nextDouble()
            println("digite o peso do jogador :")
            val peso :Double = reader.nextDouble()

            jogador[0] = Jogador(nome, posicao, anoNasc, altura, peso)

            reader.nextLine()
            
        }
        if (op == "2"){
            jogador[0]?.mostrarDados()
        }
        if (op == "3"){
            jogador[0]?.calcIdadeJogador()
        }
        if (op == "4"){
            jogador[0]?.calcAposentadoria()

        }
        if (op == "5") {
            // finalizando programa
            println("Saindo....")
            break
        }

    }while (true)
}