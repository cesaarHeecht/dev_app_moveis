class TurmaRepository(private val turmaDao: TurmaDao) {
    suspend fun cadastrarTurma(turma: TurmaEntity) {
        turmaDao.cadastrarTurma(turma)
    }
}