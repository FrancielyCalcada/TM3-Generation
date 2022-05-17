fun main() {
    /*
    Faça um programa que entre com três números e coloque em ordem crescente.
     */

    print("Digite o primeiro número inteiro: ")
    val num = readln().toInt()

    print("Digite o segundo número inteiro: ")
    val num2 = readln().toInt()

    print("Digite o terceiro número inteiro: ")
    val num3 = readln().toInt()

    var pri = 0
    var seg = 0
    var ter = 0

    if (num >= num2 && num >= num3) {

        ter = num
        if (num2 >= num3) {
            seg = num2
            pri = num3
        } else {
            seg = num3
            pri = num2
        }

    } else if (num2 >= num && num2 >= num3) {

        ter = num2
        if (num >= num3) {
            seg = num
            pri = num3
        } else {
            seg = num3
            pri = num
        }

    } else {

        ter = num3
        if (num2 >= num) {
            seg = num2
            pri = num
        } else {
            seg = num
            pri = num2
        }

    }

    println("A ordem crescente destes números é: $pri, $seg, $ter")

}