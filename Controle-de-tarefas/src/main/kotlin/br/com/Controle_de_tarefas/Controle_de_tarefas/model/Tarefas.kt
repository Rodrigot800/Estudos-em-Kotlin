package br.com.Controle_de_tarefas.Controle_de_tarefas.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id


//Imformar no Spring que essa classe
// vai ser uma tabela no BD

@Entity
class Tarefas (
    //definir um identidicador para a tabela
    //chave primaria com um auto incremento
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    var id: Long? = null,
    val nomeTarefas:String="",
    val descricao:String="",
    val responsavel:String="",
    val encerrada:String="não"
)
{}