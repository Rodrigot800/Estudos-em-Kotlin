import java.util.Scanner

fun main (){
   val reader = Scanner(System.`in`)
//    println("digite o numero da agencia")
//    val agencia : String = reader.nextLine()
//    println("digite o numero da conta")
//    val conta : String = reader.nextLine()
//    println("digite a senha")
//    val senha : String = reader.nextLine()

    val usuario = ContaBancaria("123","10","12340")
    println("recuperando saldo ${usuario.recuperarSaldo()}")


    println("digite o valor a ser depositado :")
    val deposito : Double = reader.nextDouble()
    usuario.depositar(deposito)
    println("digite o valor a ser sacado :")

    val sacar : Double = reader.nextDouble()
    usuario.sacar(sacar)

    println("recuperando saldo ${usuario.recuperarSaldo()}")


    println("digite o dias :")
    val dia : Int = reader.nextInt()
    usuario.extrato(dia)

    println("digite a data inicial")
    val data1 : String = readln()
    println("digite a data final")
    val data2 : String = readln()
    usuario.extrato(data1,data2)

}