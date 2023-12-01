class AlunoRepository(private val alunoDao: AlunoDao) {
    suspend fun cadastrarAluno(aluno: AlunoEntity) {
        alunoDao.cadastrarAluno(aluno)
    }
}