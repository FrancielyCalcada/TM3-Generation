//construtor primário
class Cliente (private var nome: String, private val cpf: String, private val dtNascimento: String){

    //declaração das variáveis
    private var endereco = ""
    private var telefone = ""
    private var listaDeCompras = mutableListOf<String>()

    //construtor secundário
    constructor(
        nome: String,
        cpf: String,
        dtNascimento: String,
        telefone: String
    ): this (nome, cpf, dtNascimento){
        this.telefone = telefone
    }

    //construtor terciário
    constructor(
        nome: String,
        cpf: String,
        dtNascimento: String,
        telefone: String,
        endereco: String
    ): this (nome, cpf, dtNascimento, telefone){
        this.endereco = endereco
    }

    //Método para validar o nome
    init {
        if (nome == ""){
            throw Exception ("Campo nome: preenchimento obrigatório!")
        }else{
            println("Cadastro criado com sucesso!")
        }
    }

    //Métodos: adicionar, remover e listar os itens do atributo listaDeCompras

    fun adicionar (item: String) {

        if (item != "" && !listaDeCompras.contains(item)){

            listaDeCompras.add(item)
            println("Item adicionado!\n")

        }else{
            println("Não foi possível adicionar este intem a lista!\n" +
                    "Verifique se o mesmo já existe")
        }

    }

    fun remover(item: String){

        if (listaDeCompras.contains(item)){

            listaDeCompras.remove(item)
            println("Item removido!\n")

        }else {
            println("Não foi possível remover este intem da lista!\n" +
                        "Verifique se o mesmo já existe")
        }

    }

    fun listar(){

        println(listaDeCompras)

    }

}