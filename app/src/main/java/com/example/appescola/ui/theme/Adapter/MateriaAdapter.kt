package com.example.appescola.ui.theme.Adapter

import MateriaEntity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MateriaAdapter(
    var materias: List<MateriaEntity>,
    private val itemClickListener: OnItemClickListener
) : RecyclerView.Adapter<MateriaAdapter.MateriaViewHolder>() {

    interface OnItemClickListener {
        fun onItemClick(materia: MateriaEntity)
        fun onItemLongClick(materia: MateriaEntity)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MateriaViewHolder {
        val binding = ItemMateriaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MateriaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MateriaViewHolder, position: Int) {
        val materia = materias[position]
        holder.bind(materia)
    }

    override fun getItemCount(): Int = materias.size

    inner class MateriaViewHolder(private val binding: ItemMateriaBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(materia: MateriaEntity) {
            binding.textNomeMateria.text = materia.nome

            binding.root.setOnClickListener {
                itemClickListener.onItemClick(materia)
            }

            binding.root.setOnLongClickListener {
                itemClickListener.onItemLongClick(materia)
                true
            }
        }
    }
}
