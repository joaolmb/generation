programa
{
	
	funcao inicio()
	{
		real nota1, nota2, nota3, mediaP
		inteiro peso1, peso2, peso3
		peso1 = 2
		peso2 = 3
		peso3 = 5

		escreva("Digite o valor da nota 1: ")
		leia(nota1)
		escreva("Digite o valor da nota 2: ")
		leia(nota2)
		escreva("Digite o valor da nota 3: ")
		leia(nota3)


		mediaP = (nota1*peso1 + nota2*peso2 + nota3*peso3)/(peso1 + peso2 + peso3)

		escreva("O valor da média ponderada é: " + mediaP)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 8; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */