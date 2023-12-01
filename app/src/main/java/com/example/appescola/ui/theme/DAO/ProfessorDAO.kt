import androidx.room.Dao
import androidx.room.Insert

@Dao
interface ProfessorDao {
    @Insert
    suspend fun cadastrarProfessor(professor: ProfessorEntity)
}