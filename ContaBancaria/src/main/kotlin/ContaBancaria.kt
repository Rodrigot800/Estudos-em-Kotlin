class ContaBancaria(objAgencia:String, objConta: String, objSenha: String) {
    var agencia: String = ""
    var conta: String = ""
    var senha : String = ""
    var usuarioAutenticado : Boolean = false
    var saldo : Double = 0.0
    init {
        this.agencia = objAgencia
        this.conta = objConta
        this.senha = objSenha
        usuarioAutenticado = true
    }

    fun recuperarSaldo() : Double{
        if(usuarioAutenticado){
            return saldo
        }else{
            return 0.0
        }
    }

    fun depositar(valor:Double){
        saldo += valor
        println("Deposito feito com sucesso")
    }
    fun sacar(valor: Double){
        if (valor<=saldo){
            saldo -= valor
            println("saque de $valor feito com sucesso" )
        }else{
            println("Saldo insuficiente")
        }


    }
    fun extrato(dia:Int){
        println("Extrato dos últimos $dia dias")
    }
    fun extrato(dataInicial: String, dataFinal: String){
        println("Extrato intervalo $dataInicial e $dataFinal")
    }
}