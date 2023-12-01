import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "alunos")
data class AlunoEntity(
    @PrimaryKey(autoGenerate = true)
    val alunoId: Long = 0,
    val nome: String,
    val materiaId: Long // Relacionamento com a matéria
)