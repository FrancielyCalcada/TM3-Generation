fun main() {
    /*
      1 — Faça um programa em que o usuário digite o diâmetro de um círculo e calcule a área e o perímetro dele
       */

    println("Calculadora\n")
    print("Digite o diâmetro do círculo: ")
    var diametro = readln().toDouble()

    var pi = 3.14
    var raio = diametro / 2

    var area = pi * Math.pow(raio,2.0)
    var perimetro = (2 * pi) * raio

    println("Valor da área = $area \nValor do perímetro: $perimetro")
}