import androidx.room.Dao
import androidx.room.Insert

@Dao
interface AlunoDao {
    @Insert
    suspend fun cadastrarAluno(aluno: AlunoEntity)
}