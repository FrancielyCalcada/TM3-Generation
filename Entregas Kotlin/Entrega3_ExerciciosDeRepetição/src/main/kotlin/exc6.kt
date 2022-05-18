fun main(){
    /*
    Escrever um programa que receba vários números inteiros no teclado. E no
    final imprimir a média dos números múltiplos de 3. Para sair digitar
    0(zero).(DO...WHILE)
     */
    var media = 0
    var cont = 0

    do{
        print("Digite um número inteiro: ")
        var num = readln().toInt()
        println("* Digite '0' quando quiser sair.\n")

        if (num % 3 == 0){
            media += num
            cont++
        }
    }while (num != 0)
    cont-- //eliminar a contagem do 0
    println("Média dos números múltiplos de 3: ${media / cont}")

}