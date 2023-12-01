import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class AlunosViewModel(private val alunoRepository: AlunoRepository) : ViewModel() {
    fun cadastrarAluno(aluno: AlunoEntity) {
        viewModelScope.launch {
            alunoRepository.cadastrarAluno(aluno)
        }
    }
}