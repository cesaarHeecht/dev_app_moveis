import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "turmas")
data class TurmaEntity(
    @PrimaryKey(autoGenerate = true)
    val turmaId: Long = 0,
    val nome: String,
    val alunoId: Long // Relacionamento com o aluno
)