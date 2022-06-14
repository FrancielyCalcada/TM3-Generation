package com.generation.gerenciadordetarefas.model

data class Categoria(
    var id: Long,
    var descricao: String?,
    var tarefas: List<Tarefa>? // ? indicando que esse valor pode ser nulo
    ) {

    override fun toString(): String {
        return descricao!!
    }

}