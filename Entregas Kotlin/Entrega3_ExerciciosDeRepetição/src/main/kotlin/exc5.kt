fun main() {
    /*
    Crie um programa que leia um número do teclado até que encontre um
    número igual a zero. No final, mostre a soma dos números
    digitados.(DO...WHILE)
     */
    var aux = 0

    do {
        print("Digite um número do teclado: ")
        var num = readln().toInt()
        aux += num
    } while (num != 0)
    println("A soma dos números digitados é: $aux")
}