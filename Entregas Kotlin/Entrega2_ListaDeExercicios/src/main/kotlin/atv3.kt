fun main() {
    /*
    Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
    categoria ela se encontra:
        - 10-14 infantil
        - 15-17 juvenil
        - 18-25 adulto
     */

    print("Digite a idade: ")
    val idade = readln().toInt()

    print("Categoria: ")

    when(idade){
        in 10 .. 14 -> println("infantil")
        in 15 .. 17 -> println("juvenil")
        in 18 .. 25 -> println("adulto")
        else -> println("Idade fora do permitido!")
    }
}