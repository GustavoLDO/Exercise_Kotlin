package br.edu.fatecpg.appfilmes.model

class FilmeDaoImpl : FilmeDao {

    companion object{
        private val filmes = mutableListOf<Filme>()
    }

    override fun postFilme(filme: Filme) {
        filmes.add(filme)
    }

    override fun getFilme(): List<Filme> {
        return filmes
    }
}