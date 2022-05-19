fun main() {
        print("Qual operação deseja fazer?\n'1' - adicao\n'2' - Subtração\n'3' - Multiplicação\n" +
                "'4' - Divisão\nOpção: ")
        var opcao = readln().toInt()


        when(opcao){
            1 -> {
                print("Digite o valor 1: ")
                var num1 = readln().toInt()
                print("Digite o valor 2: ")
                var num2 = readln().toInt()

                println("A adição entre $num1 e $num2 é: ${adicao(num1, num2)}")}

            2 -> {
                print("Digite o valor 1: ")
                var num1 = readln().toInt()
                print("Digite o valor 2: ")
                var num2 = readln().toInt()

                println("A subtração entre $num1 e $num2 é: ${subtracao(num1, num2)}")}

            3 -> {
                print("Digite o valor 1: ")
                var num1 = readln().toInt()
                print("Digite o valor 2: ")
                var num2 = readln().toInt()

                println("A multiplicação entre $num1 e $num2 é: ${multi(num1, num2)}")}

            4 -> {
                print("Digite o valor 1: ")
                var num1 = readln().toInt()
                print("Digite o valor 2: ")
                var num2 = readln().toInt()

                println("A divisão entre $num1 e $num2 é: ${divisao(num1, num2)}")}

            else -> println("Opção inválida")
        }
    }

    fun adicao(n1: Int, n2: Int): Int{
        // numeros = n1 + n2
        //return numeros
        return n1 + n2
    }

    fun subtracao(n1: Int, n2: Int): Int{
        return  n1 - n2
    }

    fun multi(n1: Int, n2: Int): Int{
        return n1 * n2
    }

    fun divisao(n1: Int, n2: Int): Int{
        return  n1 / n2
    }
