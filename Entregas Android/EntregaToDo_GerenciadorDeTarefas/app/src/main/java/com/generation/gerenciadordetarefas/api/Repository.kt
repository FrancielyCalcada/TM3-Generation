package com.generation.gerenciadordetarefas.api

import com.generation.gerenciadordetarefas.model.Categoria
import com.generation.gerenciadordetarefas.model.Tarefa
import retrofit2.Response

class Repository {

    suspend fun listCategoria(): Response<List<Categoria>>{
        return RetrofitInstance.api.listCategoria()
    }

    suspend fun addTarefa(tarefa: Tarefa): Response<Tarefa>{
        return RetrofitInstance.api.addTarefa(tarefa)
    }

    suspend fun listTarefa(): Response<List<Tarefa>>{
        return RetrofitInstance.api.listTarefa()
    }

    suspend fun updateTarefa(tarefa: Tarefa): Response<Tarefa>{
        return RetrofitInstance.api.updateTarefa(tarefa)
    }

}