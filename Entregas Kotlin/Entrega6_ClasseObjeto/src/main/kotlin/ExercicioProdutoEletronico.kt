fun main(){
    val produtoEletronico = ProdutoEletronico(
        codigo = 1,
        tipo = "Eletrônicos",
        nome = "Fone de Ouvido",
        marca = "Xiaomi",
        preco = 89.9,
        quantidade = 12
    )

    fun dados(){
    println("Cadastro do Produto:\n")
    println("Código: ${produtoEletronico.codigo}")
    println("Tipo: ${produtoEletronico.tipo}")
    println("Nome: ${produtoEletronico.nome}")
    println("Marca: ${produtoEletronico.marca}")
    println("Preço: ${produtoEletronico.preco}")
    println("Quantidade: ${produtoEletronico.quantidade}")
    println()}

    dados()

    print(  "'1' - incluir no estoque\n" +
            "'2' - retirar do esoque\n" +
            "'3' - alterar preço\n" +
            "Digite a opção desejada: ")
    when(readln().toInt()){
        1 -> {
            print("Digite a quantidade a ser incluída: ")
            val aux = readln().toInt()
            produtoEletronico.entrada(aux)
        }
        2 -> {
            print("Digite a quantidade a ser retirada: ")
            val aux = readln().toInt()
            produtoEletronico.saida(aux)}
        3 -> {
            print("Digite o novo valor: ")
            val aux = readln().toDouble()
            produtoEletronico.preco(aux)
        }

    }

    println()
    dados()

}