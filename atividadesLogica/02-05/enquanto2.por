programa
{
	
	funcao inicio()
	{
		real numero

		escreva("Digite um número qualquer: ")
		leia(numero)
		escreva("Multiplicando ele por 3 até que seja maior que 100: \n")
		escreva(numero+"\n")
		enquanto(numero<100) {
			numero*=3
			escreva(numero+"\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 261; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */