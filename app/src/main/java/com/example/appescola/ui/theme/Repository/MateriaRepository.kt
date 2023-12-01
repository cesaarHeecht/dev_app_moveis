class MateriaRepository(private val materiaDao: MateriaDao) {
    suspend fun cadastrarMateria(materia: MateriaEntity) {
        materiaDao.cadastrarMateria(materia)
    }
}