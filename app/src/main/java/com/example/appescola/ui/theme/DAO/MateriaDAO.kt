import androidx.room.Dao
import androidx.room.Insert

@Dao
interface MateriaDao {
    @Insert
    suspend fun cadastrarMateria(materia: MateriaEntity)
}