import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appescola.R
import com.example.appescola.ui.theme.DataClass.Turma

class ItemTurmaBinding(
    private val binding: ItemTurmaBinding?
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(turma: Turma) {
        binding.textNomeTurma.text = turma.nome
    }

    companion object {
        fun create(parent: ViewGroup): ItemTurmaBinding {
            val inflater = LayoutInflater.from(parent.context)
            val binding = ItemTurmaBinding.inflate(inflater, parent, false)
            return ItemTurmaBinding(binding)
        }
    }
}
}