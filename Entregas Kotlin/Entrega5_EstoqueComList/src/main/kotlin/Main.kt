/*
    Crie um programa para trabalhar com estoque de uma loja, o programa deverá
    trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
    programa deverá atender as seguintes funcionalidades:

        Armazenar dados da List
        Remover dados da list;
        Atualizar dados da list.
        Apresentar todos os dados da list
 */

fun main(){
    val lista = mutableListOf<String>()

    while(true) {
        println("\n    MENU - ESTOQUE   \n")
        print("'1' - Ver os dados da lista\n" +
                "'2' - Adicionar dados na lista\n" +
                "'3' - Editar dados da lista\n" +
                "'4' - Remover dados da lista\n" +
                "'5' - Sair\n" +
                "Digite a opção desejada: ")
        val op = readln().toInt()

        when(op){
            1 -> {
                var sair = ""
                val aux = lista.isEmpty().toString()

                if (sair != "sair"){
                    if (aux == "true"){
                        println("A lista está vazia!")
                    }else{
                        println("\nLista:")
                        print(lista.joinToString("\n"))
                        println()
                    }
                }

                print("Para retornar ao menu digite 'sair': ")
                sair = readln()

            }

            2 -> {
                var sair = ""

                while (true){
                    println("\nAdicionar")
                    print("Digite o nome para adicionar na lista: ")
                    val valor = readln()

                    if (valor != "") {
                        lista.add(valor)
                        println("Adicionado!")
                        print("Digite sair para retornar ao menu ou tecle enter para adicionar novamente: ")
                        sair = readln()
                        if (sair == "sair"){
                            break
                        }
                    }else{
                        print("Digite sair para retornar ao menu ou tecle enter para editar novamente: ")
                        sair = readln()
                        if (sair == "sair"){
                            break
                        }
                    }
                }
            }

            3 -> {
                var sair = ""

                while (true){
                    println("\nEditar")
                    print("Digite um item que você queira editar: ")
                    val edit = readln()

                    if(lista.contains(edit)){
                        val index = lista.indexOf(edit)
                        println("Digite o novo item: ")
                        val valor = readln()
                        lista[index] = valor
                        println("O item foi atualizado com sucesso!")
                    }else{
                        println("O item $edit não existe na lista")
                    }
                    print("Digite sair para retornar ao menu ou tecle enter para editar novamente: ")
                    sair = readln()
                    if (sair == "sair"){
                        break
                    }
                }
            }

            4 -> {
                var sair = ""

                while (true){
                    println("\nRemover")
                    print("Digite um item para você deletar da lista: ")
                    val valor = readln()

                    if(lista.contains(valor)){
                        lista.remove(valor)
                    }else{
                        println("O item $valor não existe na lista!")
                    }
                    print("Digite sair para retornar ao menu ou tecle enter para editar novamente: ")
                    sair = readln()
                    if (sair == "sair"){
                        break
                    }
                }
            }

            5 -> break

            else -> {
                println("\nVocê digitou uma opção inválida!")
                var sair = ""
                print("Pressione enter para retornar ao menu ou 'sair' para finalizar: ")
                sair = readln()
                if (sair == "sair") {
                    break
                }
            }
        }

    }
}