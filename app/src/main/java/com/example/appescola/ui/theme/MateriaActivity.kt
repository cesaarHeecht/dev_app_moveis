import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appescola.ui.theme.Adapter.MateriaAdapter

class MateriaActivity : AppCompatActivity() {

    private lateinit var binding: ItemMateriaBinding
    private lateinit var materiaAdapter: MateriaAdapter
    private lateinit var materiaRepository: MateriaRepository // Substitua pelo seu repositório

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ItemMateriaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        materiaRepository = MateriaRepository() // Substitua pelo seu repositório
        materiaAdapter = MateriaAdapter()

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = materiaAdapter

        binding.btnCadastrarMateria.setOnClickListener {
            val nomeMateria = binding.editTextNomeMateria.text.toString()
            val professorId = "id_do_professor" // Substitua pelo ID correto do professor
            val novaMateria = Materia(id = "id_gerado", nome = nomeMateria, professorId = professorId)

            materiaRepository.cadastrarMateria(novaMateria)
            atualizarListaDeMaterias()
        }

        atualizarListaDeMaterias()
    }

    private fun atualizarListaDeMaterias() {
        val listaDeMaterias = materiaRepository.obterListaDeMaterias()
        materiaAdapter.submitList(listaDeMaterias)
    }
}
