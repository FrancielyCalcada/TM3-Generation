package com.generation.gerenciadordetarefas.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.generation.gerenciadordetarefas.databinding.CardLayoutBinding
import com.generation.gerenciadordetarefas.model.Tarefa

class TarefaAdapter: RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder>(){

    private var listTarefa = emptyList<Tarefa>()

    class TarefaViewHolder (val binding: CardLayoutBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
        return TarefaViewHolder(CardLayoutBinding.inflate(LayoutInflater.from(parent.context),
            parent, false))
    }

    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
        val tarefa = listTarefa[position]

        holder.binding.txtNome.text = tarefa.nome
        holder.binding.txtDescricao.text = tarefa.descricao
        holder.binding.txtResponsavel.text = tarefa.responsavel
        holder.binding.txtData.text = tarefa.data
        holder.binding.switchAtiva.isChecked = tarefa.status
        holder.binding.txtCategoria.text = tarefa.categoria.descricao
    }

    override fun getItemCount(): Int {
        return listTarefa.size
    }

    fun setList(list: List<Tarefa>){
        listTarefa = list
        notifyDataSetChanged()
    }
}