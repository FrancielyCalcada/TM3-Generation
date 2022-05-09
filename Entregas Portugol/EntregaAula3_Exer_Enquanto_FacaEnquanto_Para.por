programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

		//ENQUANTO
		/*
		 * 1- Elaborar um programa que efetue a leitura sucessiva de valores numﾃｩricos e apresente no final o total do somatﾃｳrio, 
		 * a mﾃｩdia e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuﾃ｡rio
		 * estiver fornecendo valores positivos. Ou seja, o programa deve parar quando o usuﾃ｡rio fornecer um valor negativo.
		 */

		//RESOLUﾃ�ﾃグ 1

		/*inteiro soma = 0, num = 0, cont = 0, media = 0
		


		enquanto (num >= 0){
			
			escreva("\nDigite um nﾃｺmero positivo: ") leia (num)
			soma += num 
			cont++
			
		}	
			cont--
				
			soma -= num
			
			media = (soma/cont)
			
			
			escreva("\n\nSoma: ", soma)
		 	escreva("\n\nMﾃｩdia: ", media)
		 	escreva("\n\nTotal de valores lidos: ", cont, "\n\n")*/

		/*
		 * 2- Obtenha um nﾃｺmero digitado pelo usuﾃ｡rio e repita a operaﾃｧﾃ｣o de multiplicar ele por trﾃｪs  (imprimindo o novo valor)
		 * atﾃｩ que ele seja maior do que 100. Ex.: se o usuﾃ｡rio digita 5,  deveremos observar na tela a seguinte
		 * sequﾃｪncia: 5 15 45 135.
		 */

		 //RESOLUﾃ�ﾃグ 2

		/*inteiro num = 0

		escreva("\nDigite um nﾃｺmero: ") leia (num)
		limpa()
		
		escreva(num, "\n")
		enquanto (num < 100){
			
			num *= 3
			escreva("\n", num, "\n")
		 }*/

		 //FACA... ENQUANTO
		 /*
		  * 1- Faﾃｧa um programa que mostre uma contagem na tela de 233 a 456, sﾃｳ que contando de 3 em 3 quando estiver
		  * entre 300 e 400 e de 5 em 5 quando nﾃ｣o estiver.
		  */

		//RESOLUﾃ�ﾃグ 1

		/*inteiro num = 233

		escreva (num, "\n")
		
		  faca{

		  	se (num >= 300 e num <= 400){
		  		num += 3
		  	}senao{
		  		num += 5
		  	}

			escreva(num, "\n")
		  	
		  }enquanto (num >= 233 e num <= 456)*/

		  /*
		   * 2- Faﾃｧa um programa que pegue um nﾃｺmero do teclado e calcule a soma de todos os nﾃｺmeros  de 1 atﾃｩ ele.
		   * Ex.: o usuﾃ｡rio entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
		   */

		  //RESOLUﾃ�ﾃグ 2
		  /*inteiro num = 0, num2, soma = 0

		  escreva("Digite um nﾃｺmero: ") leia (num2)

		  faca{
		  	num++
		  	soma += num
		  	escreva(soma, "\n")
		  }enquanto (num <= (num2 - 1))


		   escreva("Soma: ", soma)*/

		   //PARA

		   /*
		    * 2- Desenvolver um sistema que efetue a soma de todos os nﾃｺmeros ﾃｭmpares que sﾃ｣o  mﾃｺltiplos de trﾃｪs
		    * e que se encontram no conjunto dos nﾃｺmeros de 1 atﾃｩ 500.
		    */

		    //RESOLUﾃ�ﾃグ 2

		    /*inteiro soma = 0

		    para (inteiro y = 1; y >= 1 e y <= 500; y++){

				se(y % 2 != 0 e y % 3 == 0){
					escreva(y, " + ")
					soma += y
				}
		    	
		    }escreva ("\nResultado: ", soma)*/

		    		
		 	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2655; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */