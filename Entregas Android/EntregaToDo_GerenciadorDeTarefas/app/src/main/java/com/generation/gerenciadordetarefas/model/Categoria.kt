package com.generation.gerenciadordetarefas.model

data class Categoria(
    val id: Long,
    val descricao: String?,
    val tarefas: List<Tarefa>? // ? indicando que esse valor pode ser nulo
    ) {
}