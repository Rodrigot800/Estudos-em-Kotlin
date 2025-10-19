package br.com.Controle_de_tarefas.Controle_de_tarefas.repository

import br.com.Controle_de_tarefas.Controle_de_tarefas.model.Tarefas
import org.springframework.data.jpa.repository.JpaRepository

interface tarefasRepository : JpaRepository<Tarefas, Long> {
}

