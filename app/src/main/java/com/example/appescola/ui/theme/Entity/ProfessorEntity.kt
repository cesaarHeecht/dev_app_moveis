import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "professores")
data class ProfessorEntity(
    @PrimaryKey(autoGenerate = true)
    val professorId: Long = 0,
    val nome: String,
    val turmaId: Long // Relacionamento com a turma
)