programa
{
	
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		/*
		 * 8) Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma
			for maior que 100, caso contrário imprimi-la com o valor zero.
		 */

		 //RESOLUÇÃO EXERCÍCIO 8

		/* real num, valor = 0

		 escreva("Digite um número: ") leia (num)

		 limpa()

		 num = mat.arredondar(num, 1)
		 valor = mat.arredondar(valor, 1)

		 se (num > 100){
		 	escreva("O número digitado é ", num, " e ele é maior que 100.\n\n")
		 }senao{
		 	escreva(valor, " - Número digitado é igual ou menor que zero")
		 }*/


		 /*
		  * 7) Receber valores de base e altura de um triângulo e verificar se são valores válidos
		(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
		  */

		  //RESOLUÇÃO EXERCÍCIO 7

		/*real altura, base, valido

		escreva("CALCULANDO A BASE DO TRIÂNGULO\n\n")

		escreva("Digite o valor da base do triangulo: ") leia (base)
		escreva("Digite o valor da altura do triangulo: ") leia (altura)
		limpa()

		se (base > 0 e altura > 0){
			valido = (base * altura)	/ 2
			escreva("A área do triângulo é: ", mat.arredondar(valido, 2))	
		}senao{
			escreva("Valores inválidos!")
		}*/


		/*
		 * 6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
			categorias:
			Infantil A = 5 a 7 anos
			Infantil B = 8 a 11 anos
			Juvenil A = 12 a 13 anos
			Juvenil B = 14 a 17 anos
			Adultos = Maiores de 18 anos
		 */

		 //RESOLUÇÃO EXERCÍCIO 6

		 /*inteiro idade

		 escreva("Digite sua idade: ") leia(idade)
		 limpa()

		 escreva("Categoria: ")

		se (idade >= 5 e idade <= 7){
			escreva("Infantil A")	
		}senao se (idade >= 8 e idade <= 11){
			escreva("Infantil B")
		}senao se (idade >= 12 e idade <= 13){
			escreva("Juvenil A")
		}senao se (idade >= 14 e idade <= 17){
			escreva("Juvenil B")
		}senao se (idade < 5){
			escreva("Não possui idade mínima para nenhuma categoria!")
		}senao se (idade >= 18){
			escreva("Adultos")
		}escreva("\n\n")*/


		 /*
		  * 5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
			indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
			varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a
			suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são
			intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
			notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição
			medido e emita a notificação adequada aos diferentes grupos de empresas.
		  */

		  //RESOLUÇÃO EXERCÍCIO 5

		  /*real num

		  escreva("Indique o indice de poluição medido: ") leia (num)

		  limpa()

		  se (num >= 0.3 e num < 0.4){
		  	escreva("1º grupo são intimados a suspenderem suas atividades.")
		  }senao se (num >= 0.4 e < 0.5){
		  	escreva("1º e 2º grupo são intimados a suspenderem suas atividades.")
		  }senao se (num >= 0.5){
		  	escreva("Todos os grupos devem ser notificados a paralisarem suas atividades.")
		  }escreva("\n\n")*/


		  /*
		   * 4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
			número é par ou ímpar, e se é positivo ou negativo.
		   */

		   //RESOLUÇÃO EXERCÍCIO 4

		/*inteiro num
		
		escreva("Digite um número inteiro: ") leia (num)
		limpa()

		se (num >= 0){
			escreva("Este número é positivo e ")

			se (num % 2 == 0){
				escreva("par.")
			}senao se (num % 2 == 1){
				escreva("ímpar.")
			}
			
		}senao se (num < 0){
			escreva("Este número é negativo e ")

			se (num % 2 == 0){
				escreva("par.")
			}senao {
				escreva("ímpar.")
			}
		}*/
		

		/*
		 * 3) Desenvolva um sistema em que:
			Leia 4 (quatro) números;
			Calcule o quadrado de cada um;
			Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
			Caso contrário, imprima os valores lidos e seus respectivos quadrados.
		 */

		 //RESOLUÇÃO EXERCÍCIO 3

		 /*real n1, n2, n3, n4, p1, p2, p3, p4

		 escreva("Digite o primeiro número: ") leia (n1)
		 escreva("Digite o segundo número: ") leia (n2)
		 escreva("Digite o terceiro número: ") leia (n3)
		 escreva("Digite o quarto número: ") leia (n4)
		 limpa()

		 p1 = mat.potencia(n1, 2)
		 p2 = mat.potencia(n2, 2)
		 p3 = mat.potencia(n3, 2)
		 p4 = mat.potencia(n4, 2)

		 se (p3 >= 1000){
		 	escreva("Quadrado do terceiro número igual a: ", p3)
		 }senao{
		 	escreva("Valor 1 = ", n1, " Quadrado = ", p1)
		 	escreva("\nValor 2 = ", n2, " Quadrado = ", p2)
		 	escreva("\nValor 3 = ", n3, " Quadrado = ", p3)
		 	escreva("\nValor 4 = ", n4, " Quadrado = ", p4)
		 }*/
		 

		 /*
		  * 2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
			horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
			por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
			armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
			trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
			excedente.
		  */

		  //RESOLUÇÃO EXERCÍCIO 2

		  /*inteiro C
		  real N, salario, he = 0.0, extra

		  escreva("Insira o código do operário: ") leia(C)
		  escreva("Insira o número de horas trabalhadas: ") leia(N)

		  se (N <= 50){
		  	salario = N * 10.00
		  	escreva("Operário código: ", C, " - Salário Total: R$ ", salario)
		  }senao{
		  	he = N - 50
		  	extra = he * 20.00
		  	salario = (50 * 10.00) + extra
		  	escreva("Operário código: ", C, " - Salário Total: R$ ", salario, " - Salário excedente: R$ ", extra)
		  }*/

		  
		/*
		 * 1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário
			de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
			regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
			excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
			verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
			da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
			ZERO.
		 */

		 //RESOLUÇÃO EXERCÍCIO 1

		/*real P = 0.0, E = 0.0, M = 0.0

		escreva("Digite o peso de tomates: ") leia (P)
		limpa()

		se (P <= 50){
			
			escreva("Peso = ", P, " - Excesso = ", E, " - Multa = R$ ", M, "\n- Dentro do permitido")
		}senao{
			E = (P - 50)
			M = (E * 4.00)
			escreva("Peso = ", P, " - Excesso = ", E, " - Multa = R$ ", M)
		}*/
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 6644; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */