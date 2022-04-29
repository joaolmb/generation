programa
{
	
	funcao inicio()
	{
		real custoFabrica, custoConsumidor, percentagemDistribuidor, impostos

		impostos = 0.45
		percentagemDistribuidor = 0.28
		
		escreva("Digite o custo de fábrica para saber o valor final: ")
		leia(custoFabrica)

		custoConsumidor = custoFabrica * (1 + impostos + percentagemDistribuidor)

		escreva("\nO valor final para o consumidor é: R$" + custoConsumidor+"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 405; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */