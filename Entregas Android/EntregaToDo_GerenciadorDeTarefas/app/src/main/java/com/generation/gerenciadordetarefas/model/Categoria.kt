package com.generation.gerenciadordetarefas.model

data class Categoria (
    val id: Long,
    val descricao: String?,
    val tarefas: List<Tarefa>? // ?: definir que ao criar a categoria podemos utilizar somente o id
) {
    override fun toString(): String {
        return descricao!!
    }
}