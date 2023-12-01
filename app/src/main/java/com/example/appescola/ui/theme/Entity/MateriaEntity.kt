import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "materias")
data class MateriaEntity(
    @PrimaryKey(autoGenerate = true)
    val materiaId: Long = 0,
    val nome: String,
    val professorId: Long // Relacionamento com o professor
)