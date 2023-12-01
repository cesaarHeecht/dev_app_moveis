import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class TurmasViewModel(private val turmaRepository: TurmaRepository) : ViewModel() {
    fun cadastrarTurma(turma: TurmaEntity) {
        viewModelScope.launch {
            turmaRepository.cadastrarTurma(turma)
        }
    }
}