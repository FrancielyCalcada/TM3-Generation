class Cliente (
    var nomeCompleto: String,
    val cpf: String,
    val dataDeNascimento: String,
    var contato: String,
    var cep: String,
    var senha: String
        ){
    var email = ""
    var obs = ""
    var totalCompra = 0.0
    var troco = 0.0


    fun dinheiro(pagoDinheiro: Double){
        troco = totalCompra - pagoDinheiro
        if (pagoDinheiro >= totalCompra) {
            println("Troco: RS$troco")
        }else{
            println("Pagamento restante: RS$troco")
        }
    }

    fun cartao(valor: Double){
        if(valor == totalCompra){
            println("Pagamento realizado com sucesso!")
        }else{
            if (valor < totalCompra) {
                troco = totalCompra - valor
                println("Pagamento restante: RS$troco")
            }else{
                println("Valor digitado R$$valor, é maior que o total da compra realizada R$$totalCompra!")
            }
        }
    }
}