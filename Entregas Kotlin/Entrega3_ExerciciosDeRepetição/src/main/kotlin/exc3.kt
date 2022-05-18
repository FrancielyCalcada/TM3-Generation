fun main(){
    /*
    Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
    21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
    idade for =-99. (WHILE)
     */
    var num = 1
    var menor = 0
    var maior = 0

    while(num != -99){

        print("Digite uma idade: ")
        num = readln().toInt()

        if (num < 21){
            menor++
        }else if (num > 50){
            maior++
        }

    }
    menor-- //Eliminar o -99 da contagem de pessoas com menos de 21 anos
    println("Pessoas com menos de 21 anos: $menor\nPessoas com mais de 50 anos: $maior")
}