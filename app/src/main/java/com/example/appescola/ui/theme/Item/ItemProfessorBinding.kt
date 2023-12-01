import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ItemProfessorBinding(
    private val binding: ItemProfessorBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(professor: Professor) {
        binding.textNomeProfessor.text = professor.nome
    }

    companion object {
        fun create(parent: ViewGroup): ItemProfessorBinding {
            val inflater = LayoutInflater.from(parent.context)
            val binding = ItemProfessorBinding.inflate(inflater, parent, false)
            return ItemProfessorBinding(binding)
        }
    }
}
