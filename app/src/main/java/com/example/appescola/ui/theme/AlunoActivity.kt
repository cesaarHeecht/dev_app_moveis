package com.example.appescola.ui.theme
import androidx.databinding.DataBindingUtil
import AlunoRepository
import ItemAlunoBinding
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appescola.R
import com.example.appescola.ui.theme.Adapter.AlunoAdapter
import com.example.appescola.ui.theme.DataClass.Aluno

class AlunoActivity : AppCompatActivity() {

    private lateinit var binding: ItemAlunoBinding
    private lateinit var alunoAdapter: AlunoAdapter
    private lateinit var alunoRepository: AlunoRepository // Substitua pelo seu repositório

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.activity_aluno, null, false)
        setContentView(binding.root)

        alunoRepository = AlunoRepository() // Substitua pelo seu repositório
        alunoAdapter = AlunoAdapter()

        binding.recyclerview.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = alunoAdapter

        binding.btnCadastrarAluno.setOnClickListener {
            val nomeAluno = binding.editTextNomeAluno.text.toString()
            val materiaId = "id_da_materia" // Substitua pelo ID correto da matéria
            val novoAluno = Aluno(id = "id_gerado", nome = nomeAluno, materiaId = materiaId)

            alunoRepository.cadastrarAluno(novoAluno)
            atualizarListaDeAlunos()
        }

        atualizarListaDeAlunos()
    }

    private fun atualizarListaDeAlunos() {
        val listaDeAlunos = alunoRepository.obterListaDeAlunos()
        alunoAdapter.submitList(listaDeAlunos)
    }
}

