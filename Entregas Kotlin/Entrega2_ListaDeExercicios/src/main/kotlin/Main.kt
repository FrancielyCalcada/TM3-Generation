fun main() {
    /*
    Faça um programa que receba três inteiros e diga qual deles é o maior.
     */

    // Resolução ---------------------------------------------------------------------------------

    print("Digite o primeiro número inteiro: ")
    val num = readln().toInt()

    print("Digite o segundo número inteiro: ")
    val num2 = readln().toInt()

    print("Digite o terceiro número inteiro: ")
    val num3 = readln().toInt()

    if (num >= num2 && num >= num3) {
        println("O maior número digitado foi: $num")
    }else if (num2 >= num && num >= num3){
        println("O maior número digitado foi: $num2")
    }else{
        println("O maior número digitado foi: $num3")
    }

}