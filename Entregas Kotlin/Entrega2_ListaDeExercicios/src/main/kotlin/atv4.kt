import java.lang.Math.pow
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    /*
    Faça um programa em que permita a entrada de um número qualquer e exiba se este
    número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
    ímpar exiba o número elevado ao quadrado.
     */
    print("Digite um valor: ")
    val num = readln().toDouble()

    if (num % 2 == 0.0){

        val raiz = sqrt(num.toDouble())
        print("O valor ($num) informado é par e a raiz é $raiz")

    }else{

        val quadrado = num.pow(2)
        print("O valor ($num) informado é ímpar e elevado ao quadrado é $quadrado")

    }

}