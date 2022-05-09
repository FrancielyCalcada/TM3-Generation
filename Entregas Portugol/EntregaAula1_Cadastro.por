programa
{
	
	funcao inicio()
	{
		//CADASTRO PARA ENTREGA

		cadeia nomeCompleto
		cadeia apelido
		inteiro idade
		cadeia contato
		cadeia email
		logico receberEmail
		

		escreva("CADASTRO DA LOJA\n\n")

		escreva("Olá, vamos iniciar seu cadastro?\n\nPor favor me informe os dados abaixo:\n")
		escreva("Qual o seu nome completo? ") leia(nomeCompleto)
		escreva("Ótimo e como deseja ser chamado? ") leia(apelido)
		escreva("Certo ", apelido, ", qual a sua idade? ") leia(idade)
		escreva("Qual o seu telefone de contato (DDD+número)? ") leia(contato)
		escreva("Qual é o seu melhor e-mail? ") leia(email)
		escreva("Perfeito!\nPara concluir, informe se deseja receber informações da loja por e-mail(verdadeiro ou falso): ") leia(receberEmail)

		escreva("Ótimo, seu cadastro foi realizado com sucesso.\n\n")

		escreva("CADASTRO DA LOJA\n\n")

		escreva("Nome Completo: ", nomeCompleto, "\n")
		escreva("Nome/Apelido: ", apelido, "\n")
		escreva("Idade: ", idade, "\n")
		escreva("Contato: ", contato, "\n")
		escreva("E-mail: ", email, "\n")
		escreva("Deseja receber informações por e-mail: ", receberEmail, "\n\n")

		escreva("Obrigada por se cadastrar em nossa loja!\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1192; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */