fun main(){
    /*
    Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
     */
    var auxPar = 0
    var auxImpar = 0

    for(i in 1 .. 10){
        print("Digite um número: ")
        val num = readln().toInt()

        if(num % 2 == 0){
            auxPar++
        }else{
            auxImpar++
        }
    }

    println("Quantidade de números par: $auxPar\nQuantidade de números ímpar: $auxImpar")

}