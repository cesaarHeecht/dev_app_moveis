class ProfessorRepository(private val professorDao: ProfessorDao) {
    suspend fun cadastrarProfessor(professor: ProfessorEntity) {
        professorDao.cadastrarProfessor(professor)
    }
}