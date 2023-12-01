import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appescola.ui.theme.Adapter.ProfessorAdapter
import com.example.appescola.ui.theme.Item

class ProfessorActivity : AppCompatActivity() {

    private lateinit var binding: ItemProfessorBinding
    private lateinit var professorAdapter: ProfessorAdapter
    private lateinit var professorRepository: ProfessorRepository // Substitua pelo seu repositório

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfessorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        professorRepository = ProfessorRepository() // Substitua pelo seu repositório
        professorAdapter = ProfessorAdapter()

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = professorAdapter

        binding.btnCadastrarProfessor.setOnClickListener {
            val nomeProfessor = binding.editTextNomeProfessor.text.toString()
            val turmaId = "id_da_turma" // Substitua pelo ID correto da turma
            val novoProfessor = Professor(id = "id_gerado", nome = nomeProfessor, turmaId = turmaId)

            professorRepository.cadastrarProfessor(novoProfessor)
            atualizarListaDeProfessores()
        }

        atualizarListaDeProfessores()
    }

    private fun atualizarListaDeProfessores() {
        val listaDeProfessores = professorRepository.obterListaDeProfessores()
        professorAdapter.submitList(listaDeProfessores)
    }
}
