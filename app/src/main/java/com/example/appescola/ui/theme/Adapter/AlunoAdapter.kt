package com.example.appescola.ui.theme.Adapter

import AlunoEntity
import ItemAlunoBinding
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appescola.ui.theme.Item

class AlunoAdapter(
    var alunos: List<AlunoEntity>,
    private val itemClickListener: OnItemClickListener
) : RecyclerView.Adapter<AlunoAdapter.AlunoViewHolder>() {

    interface OnItemClickListener {
        fun onItemClick(aluno: AlunoEntity)
        fun onItemLongClick(aluno: AlunoEntity)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlunoViewHolder {
        val binding = ItemAlunoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AlunoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AlunoViewHolder, position: Int) {
        val aluno = alunos[position]
        holder.bind(aluno)
    }

    override fun getItemCount(): Int = alunos.size

    class AlunoViewHolder(private val binding: ItemAlunoBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(aluno: AlunoEntity) {
            binding.textNomeAluno.text = aluno.nome
            binding.textMatriculaAluno.text = aluno.matricula
            binding.textMateriaAluno.text = aluno.materia

            binding.root.setOnClickListener {
                itemClickListener.onItemClick(aluno)
            }

            binding.root.setOnLongClickListener {
                itemClickListener.onItemLongClick(aluno)
                true
            }
        }
    }
}
