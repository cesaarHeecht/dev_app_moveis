import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MateriasViewModel(private val materiaRepository: MateriaRepository) : ViewModel() {
    fun cadastrarMateria(materia: MateriaEntity) {
        viewModelScope.launch {
            materiaRepository.cadastrarMateria(materia)
        }
    }
}