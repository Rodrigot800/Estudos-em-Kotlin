class Paciente(val nomeObj: String, val idadeObj: Int) {
    var nomePaciente: String = ""
    var idadePaciente: Int = 0
    val historiaConsulta = arrayOfNulls<String>(10)
    var quantidadeConcultas = 0

    init {
        this.nomePaciente = nomeObj
        this.idadePaciente = idadeObj
    }

    fun adicionarConsulta(consulta: String) {
        if (quantidadeConcultas < 10) {
            this.historiaConsulta[this.quantidadeConcultas] = consulta
            this.quantidadeConcultas++
        } else {
            println("Consulta chegou no valor máximo")
        }

    }
    fun exibirConsultas() {
        if (this.quantidadeConcultas > 0)
            for (i in 0..this.quantidadeConcultas - 1) {

                println(this.historiaConsulta[i])
            } else {
            println("sem nem uma Consulta com esse cliente")
        }
    }

}

