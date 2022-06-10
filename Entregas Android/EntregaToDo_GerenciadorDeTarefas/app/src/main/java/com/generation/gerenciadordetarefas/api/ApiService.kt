package com.generation.gerenciadordetarefas.api

import com.generation.gerenciadordetarefas.model.Categoria
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("categoria")
    suspend fun listCategoria(): Response<List<Categoria>>

}