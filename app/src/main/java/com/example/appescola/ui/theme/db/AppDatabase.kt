import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [AlunoEntity::class, MateriaEntity::class, ProfessorEntity::class, TurmaEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun alunoDao(): AlunoDao
    abstract fun materiaDao(): MateriaDao
    abstract fun professorDao(): ProfessorDao
    abstract fun turmaDao(): TurmaDao
}
