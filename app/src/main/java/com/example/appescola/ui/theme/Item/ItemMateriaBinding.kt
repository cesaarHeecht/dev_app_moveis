import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ItemMateriaBinding(
    private val binding: ItemMateriaBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(materia: Materia) {
        binding.textNomeMateria.text = materia.nome
    }

    companion object {
        fun create(parent: ViewGroup): ItemMateriaBinding {
            val inflater = LayoutInflater.from(parent.context)
            val binding = ItemMateriaBinding.inflate(inflater, parent, false)
            return ItemMateriaBinding(binding)
        }
    }
}
