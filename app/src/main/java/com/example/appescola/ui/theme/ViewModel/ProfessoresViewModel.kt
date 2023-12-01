import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ProfessoresViewModel(private val professorRepository: ProfessorRepository) : ViewModel() {
    fun cadastrarProfessor(professor: ProfessorEntity) {
        viewModelScope.launch {
            professorRepository.cadastrarProfessor(professor)
        }
    }
}