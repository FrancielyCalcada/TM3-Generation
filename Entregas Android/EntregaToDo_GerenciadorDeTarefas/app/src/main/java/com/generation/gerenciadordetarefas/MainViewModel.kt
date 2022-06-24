package com.generation.gerenciadordetarefas

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.generation.gerenciadordetarefas.api.Repository
import com.generation.gerenciadordetarefas.model.Categoria
import com.generation.gerenciadordetarefas.model.Tarefa
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import java.time.LocalDate
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: Repository
): ViewModel(){

    private var _myCategoriaResponse = MutableLiveData<Response<List<Categoria>>>()

    val myCategoriaResponse: LiveData<Response<List<Categoria>>> =
        _myCategoriaResponse

    private val _myTarefaResponse =
        MutableLiveData<Response<List<Tarefa>>>()

    val myTarefaResponse: LiveData<Response<List<Tarefa>>> =
        _myTarefaResponse

    val dataSelecionada = MutableLiveData<LocalDate>()

    var tarefaSelecionada: Tarefa? = null

    init {
        //listCategoria()
    }

    fun listCategoria(){
        viewModelScope.launch {
            try {
                val response = repository.listCategoria()
                _myCategoriaResponse.value = response
            }catch (e: Exception){
                Log.d("ErroRequisicao", e.message.toString())
            }
        }
    }

    fun addTarefa(tarefa: Tarefa){
        viewModelScope.launch {
            try {
                val response = repository.addTarefa(tarefa)
                Log.d("Ok", response.body().toString())
                listTarefa()
            }catch (e: Exception){
                Log.d("Erro", e.message.toString())
            }
        }
    }

    fun listTarefa(){
        viewModelScope.launch {
            try {
                val response = repository.listTarefa()
                _myTarefaResponse.value = response
            }catch (e: Exception){
                Log.d("Erro", e.message.toString())
            }
        }
    }

    fun updateTarefa (tarefa: Tarefa){
        viewModelScope.launch {
            try{
                repository.updateTarefa(tarefa)
                listTarefa()
            }catch (e: Exception){
                Log.d("Erro", e.message.toString())
            }
        }
    }

    fun deleteTarefa (id: Long){
        viewModelScope.launch {
            try {
                repository.deleteTarefa(id)
                listTarefa()
            }catch (e: Exception){
                Log.d("Erro", e.message.toString())
            }
        }
    }

}