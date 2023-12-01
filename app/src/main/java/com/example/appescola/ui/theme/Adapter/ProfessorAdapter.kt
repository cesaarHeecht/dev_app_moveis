package com.example.appescola.ui.theme.Adapter

import ProfessorEntity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ProfessorAdapter(
    var professores: List<ProfessorEntity>,
    private val itemClickListener: OnItemClickListener
) : RecyclerView.Adapter<ProfessorAdapter.ProfessorViewHolder>() {

    interface OnItemClickListener {
        fun onItemClick(professor: ProfessorEntity)
        fun onItemLongClick(professor: ProfessorEntity)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfessorViewHolder {
        val binding =
            ItemProfessorBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProfessorViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProfessorViewHolder, position: Int) {
        val professor = professores[position]
        holder.bind(professor)
    }

    override fun getItemCount(): Int = professores.size

    inner class ProfessorViewHolder(private val binding: ItemProfessorBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(professor: ProfessorEntity) {
            binding.textNomeProfessor.text = professor.nome

            binding.root.setOnClickListener {
                itemClickListener.onItemClick(professor)
            }

            binding.root.setOnLongClickListener {
                itemClickListener.onItemLongClick(professor)
                true
            }
        }
    }
}
