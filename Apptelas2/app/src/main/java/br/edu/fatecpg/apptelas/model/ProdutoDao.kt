package br.edu.fatecpg.apptelas.model

interface ProdutoDao {

    fun postProduto(produto: Produto)
    fun getProdutos():List<Produto>
}