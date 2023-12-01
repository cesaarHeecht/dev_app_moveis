import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appescola.ui.theme.DataClass.Aluno

class ItemAlunoBinding(
    private val binding: ItemAlunoBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(aluno: Aluno) {
        binding.textNomeAluno.text = aluno.nome
        binding.textMatriculaAluno.text = aluno.matricula
        binding.textMateriaAluno.text = aluno.materia
    }

    companion object {
        fun create(parent: ViewGroup): ItemAlunoBinding {
            val inflater = LayoutInflater.from(parent.context)
            val binding = ItemAlunoBinding.inflate(inflater, parent, false)
            return ItemAlunoBinding(binding)
        }
    }
}
