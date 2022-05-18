fun main(){
    /*
    Uma empresa desenvolveu uma pesquisa para saber as características
    psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
    era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
    (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
    agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
    pessoas, calcule e mostre: (WHILE)
     o número de pessoas calmas;
     o número de mulheres nervosas;
     o número de homens agressivos;
     o número de outros calmos;
     o número de pessoas nervosas com mais de 40 anos;
     o número de pessoas calmas com menos de 18 anos.
     */
    var num = 1
    var idade = 0
    var sexo = 0
    var tracoPerson = 0
    var contC = 0; var contFeN = 0; var contMeA = 0; var contOeC = 0 ; var contNe40 = 0; var contCe18 = 0

    while (num in 1 .. 150) {
        println("*FORMULÁRIO*\n")

        print("Idade: ")
        idade = readln().toInt()

        print("Sexo ('1' = Feminino / '2' = Masculino / '3' = Outros): ")
        sexo = readln().toInt()

        print("Traço de personalidade ('1' = Calma / '2' = Nervosa / '3' = Agressiva): ")
        tracoPerson = readln().toInt()

        if (tracoPerson == 1){
            contC++
        }

        if (sexo == 1 && tracoPerson == 2){
            contFeN++
        }

        if (sexo == 2 && tracoPerson == 3){
            contMeA++
        }

        if (sexo == 3 && tracoPerson == 1){
            contOeC++
        }

        if (tracoPerson == 2 && idade > 40){
            contNe40++
        }

        if (tracoPerson == 1 && idade < 18){
            contCe18++
        }

        num++
    }

    println("Resultado:\n" +
            "o número de pessoas calmas é: $contC \n" +
            "o número de mulheres nervosas é: $contFeN \n" +
            "o número de homens agressivos é: $contMeA \n" +
            "o número de outros calmos é: $contOeC \n" +
            "o número de pessoas nervosas com mais de 40 anos é: $contNe40 \n" +
            "o número de pessoas calmas com menos de 18 anos é: $contCe18")

}