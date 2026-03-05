package br.edu.fatecpg.apptelas.model

class ProdutoDaoImpl : ProdutoDao {

    companion object{
        private val produtos = mutableListOf<Produto>()
    }
    override fun postProduto(produto: Produto) {
        produtos.add(produto)
    }

    override fun getProdutos(): List<Produto> {
       return produtos
    }
}