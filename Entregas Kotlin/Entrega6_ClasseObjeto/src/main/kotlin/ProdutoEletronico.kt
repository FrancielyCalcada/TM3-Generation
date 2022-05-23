class ProdutoEletronico (
    val codigo: Int,
    val tipo: String,
    val nome: String,
    val marca: String,
    var preco: Double,
    var quantidade: Int
){

    fun entrada(qtd: Int){
        quantidade += qtd
        println("Quantidade atualizada!")
    }

    fun saida(qtd: Int){
        quantidade -= qtd
        println("Quantidade atualizada!")
    }

    fun preco(newPreco: Double){
        preco = newPreco
        println("Preço atualizado!")
    }

}