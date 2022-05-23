fun main(){
    val cliente = Cliente(
        nomeCompleto = "Rick Sanchez",
        cpf = "000.000.000-00",
        dataDeNascimento = "00/00/1947",
        contato = ("(00) 90000-0000"),
        cep = "00000-000",
        senha = "WubbaLubbaDubDub"
    )

    println("Cadastro do Cliente:\n")
    println(cliente.nomeCompleto)
    println(cliente.cpf)
    println(cliente.dataDeNascimento)
    println(cliente.contato)
    println(cliente.cep)
    println(cliente.senha)
    println()

    print("Digite o total da compra: ")
    val total = readln().toDouble()
    cliente.totalCompra = total

    print("\n'1' - Dinheiro\n'2' - Cartão\nDigite a forma de pagamento: ")
    when(readln().toInt()){
        1 -> {
            print("Digite o valor recebido: ")
            val valor = readln().toDouble()
            cliente.dinheiro(valor)}
        2 -> {
            print("Digite o valor: ")
            val valor = readln().toDouble()
            cliente.cartao(valor)}
    }

}