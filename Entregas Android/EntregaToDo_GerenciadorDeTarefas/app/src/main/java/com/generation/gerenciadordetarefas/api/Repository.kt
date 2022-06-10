package com.generation.gerenciadordetarefas.api

import com.generation.gerenciadordetarefas.model.Categoria
import retrofit2.Response

class Repository {

    suspend fun listCategoria(): Response<List<Categoria>> {
        return RetrofitInstance.api.listCategoria()
    }

}