programa
{

	inclua biblioteca Matematica-->M
	
	funcao inicio()
	{
		//Entrega: Calcular IMC
		
		real imc, peso, altura

		escreva("índice de Massa Corporal (IMC)\n\n")

		escreva("Inserir o seu peso atual: ") leia(peso)

		escreva("Inserir a sua altura atual: ") leia(altura)

		imc = peso / (altura * altura)

		escreva("\nCLASSIFICAÇÂO DO IMC\n\n")

		imc = M.arredondar(imc, 2)

		se(imc < 16){
			escreva("IMC = ", imc, " Status: Magreza grave (^ 0 ^) ノ\n\n")
		}senao se(imc < 17){
			escreva("IMC = ", imc, " Status: Magreza moderada (^ 0 ^) ノ\n\n")
		}senao se(imc < 18.5){
			escreva("IMC = ", imc, " Status: Magreza leve (^ 0 ^) ノ\n\n")
		}senao se(imc < 25){
			escreva("IMC = ", imc, " Status: Saudável (^ – ^ *) /\n\n")
		}senao se(imc < 30){
			escreva("IMC = ", imc, " Status: Sobrepeso (* ゚ ー ゚) ノ\n\n")
		}senao se(imc < 35){
			escreva("IMC = ", imc, " Status: Obesidade Grau I (^ 0 ^) ノ\n\n")
		}senao se(imc < 40){
			escreva("IMC = ", imc, " Status: Obesidade Grau II (severa) (^ 0 ^) ノ\n\n")
		}senao{
			escreva("IMC = ", imc, " Status: Obesidade Grau III (mórbida) (^ 0 ^) ノ\n\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1121; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */