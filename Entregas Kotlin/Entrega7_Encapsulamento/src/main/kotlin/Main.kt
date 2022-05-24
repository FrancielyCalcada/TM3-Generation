fun main() {

    //Instanciando Cliente através de imputs
    println("\nCadastro\n")
    print ("Nome: ")
        var nome = readln()
    print("CPF: ")
        var cpf = readln()
    print("Data de Nascimento (dd/mm/yyyy): ")
        var dtNasc = readln()
    print("Telefone: ")
        var tel = readln()
    print("endereço: ")
        var end = readln()

        //Try...Catch: Tratamento para o erro (campo nome vazio)
        try {

            val cliente = Cliente(nome, cpf, dtNasc, tel, end)

            //Laço de repetição | Menu para puxar os métodos de Cliente
            while(true) {
            println("\nLista de Compras\n")
            print("'1' - Adicionar\n'2' - Remover\n'3' - Ver Lista\n'4' - Sair\nDigite a opção desejada: ")
            when(readln().toInt()){

                1 -> {
                    print("Digite o item para adicionar: ")
                    val item = readln()
                    cliente.adicionar(item)
                }

                2 -> {
                    print("Digite o item para remover: ")
                    val item = readln()
                    cliente.remover(item)
                }

                3 -> cliente.listar()

                4 -> break
            }

            }

        } catch (erro: Exception){
            println(erro.message)
        }

}