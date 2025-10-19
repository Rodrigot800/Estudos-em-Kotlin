package br.com.Controle_de_tarefas.Controle_de_tarefas.controller

import br.com.Controle_de_tarefas.Controle_de_tarefas.model.Tarefas
import br.com.Controle_de_tarefas.Controle_de_tarefas.repository.tarefasRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping

@Controller // Indica a classe que vai ser o controller
class tarefasControle {

    //Inicializando o repositório de dados
    @Autowired
    lateinit var repositorio :tarefasRepository

    // função que vai abrir o formulário de cadastro
    @GetMapping("/formulario/cadastro") // Recebe as requisições GET
    fun abrirFormularioCadastro(model:Model): String{

        //Cria objeto da classe Usuario vazio
        val tarefa = Tarefas()

        // Faz o envio objeto da classe de dados para o HTML
        model.addAttribute("novaTarefa", tarefa)

        return "formulario-cadastro"
    }

    // função que vai receber o objeto de dados HTML
    @PostMapping("/cadastrar")
    fun cadastrarUsuario(tarefas: Tarefas): String{

        //salvar no banco de dados
        println(tarefas)

        repositorio.save(tarefas)

        return "redirect:/home"
    }

    // Função que vai até a página home
    @GetMapping("/home")
    fun abrirHome(model:Model):String{
        // Buscar todos os registros de banco de dados
        val tarefas = repositorio.findAll()

        //Colocar lista de usuários no model
        //model envia a lista de usuários para o HTML
        model.addAttribute("tarefas", tarefas)


        return "home"
    }
    @GetMapping("/excluir/{id}")
    fun excluirTarefa(@PathVariable("id") id:Long): String {
        repositorio.deleteById(id)
        return "redirect:/home"
    }
    @GetMapping("/formulario/edicao/{id}")
    fun abrirFormularioEdicao(@PathVariable("id") id : Long, model: Model) : String {
        val tarefa = repositorio.findById(id).orElse(null)

        model.addAttribute("tarefaEdit", tarefa)

        return "formulario-edicao"
    }
    @PostMapping("/editar/{id}")
    fun editarTarefa(@PathVariable("id") id: Long, tarefas: Tarefas): String {
        tarefas.id = id
        repositorio.save(tarefas)
        return "redirect:/home"
    }

}
