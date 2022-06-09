package com.generation.gerenciadordetarefas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.generation.gerenciadordetarefas.adapter.TarefaAdapter
import com.generation.gerenciadordetarefas.databinding.FragmentListBinding
import com.generation.gerenciadordetarefas.model.Tarefa
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(layoutInflater, container, false)

        val listTarefas = listOf(
            Tarefa(
            "Lavar a louça",
            "Lavar a louça do dia todo",
            "Fran",
            "2022-06-07",
            true,
            "Dia a Dia"
            ),

            Tarefa(
            "Limpar a casa",
            "faxina diária",
            "Fran",
            "2022-06-10",
            false,
            "Dia a Dia"
            ),

            Tarefa(
            "Jogar Video game",
            "Passar o dia todo jogando",
            "Fran",
            "2022-06-11",
            false,
            "Lazer"
            )
        )

        //config do RecyclerView
        val adapter = TarefaAdapter()
        binding.recyclerTarefa.layoutManager = LinearLayoutManager(context)
        binding.recyclerTarefa.adapter = adapter
        binding.recyclerTarefa.setHasFixedSize(true)

        adapter.setList(listTarefas)

        binding.floatingAdd.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_formFragment)
        }

        return binding.root
    }
}