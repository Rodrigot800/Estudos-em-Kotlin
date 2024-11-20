class Usuario(){

    fun logar(email: String, senha: String){
        println("Usuário logado com e-mail: $email")
    }
    fun logar(numeroTelefone: String){
        println("Usuário logado com telefone : $numeroTelefone")
    }
}

fun main(){
    val usuario = Usuario()
    usuario.logar("Rodrigopeixoto2@gmail.com", "1234")
    usuario.logar("91 9 85268888")
}