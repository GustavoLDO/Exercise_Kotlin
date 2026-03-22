package br.edu.fatecpg.appfilmes.model

interface FilmeDao {

    fun postFilme (filme: Filme)
    fun getFilme():List<Filme>
}