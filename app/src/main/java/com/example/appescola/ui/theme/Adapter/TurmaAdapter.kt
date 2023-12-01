package com.example.appescola.ui.theme.Adapter

import ItemTurmaBinding
import TurmaEntity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TurmaAdapter(
    var turmas: List<TurmaEntity>,
    private val itemClickListener: OnItemClickListener
) : RecyclerView.Adapter<TurmaAdapter.TurmaViewHolder>() {

    interface OnItemClickListener {
        fun onItemClick(turma: TurmaEntity)
        fun onItemLongClick(turma: TurmaEntity)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TurmaViewHolder {
        val binding = ItemTurmaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TurmaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TurmaViewHolder, position: Int) {
        val turma = turmas[position]
        holder.bind(turma)
    }

    override fun getItemCount(): Int = turmas.size

    inner class TurmaViewHolder(private val binding: ItemTurmaBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(turma: TurmaEntity) {
            binding.textNomeTurma.text = turma.nome

            binding.root.setOnClickListener {
                itemClickListener.onItemClick(turma)
            }

            binding.root.setOnLongClickListener {
                itemClickListener.onItemLongClick(turma)
                true
            }
        }
    }
}
