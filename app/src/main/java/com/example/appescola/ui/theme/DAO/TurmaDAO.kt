import androidx.room.Dao
import androidx.room.Insert

@Dao
interface TurmaDao {
    @Insert
    suspend fun cadastrarTurma(turma: TurmaEntity)
}