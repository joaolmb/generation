programa
{
	
	funcao inicio()
	{
		real soma=0.0, media, total=0.0, numero

		escreva("Digite um número qualquer(caso seja negativo, o programa é interrompido): ")
		leia(numero)
		
		enquanto(numero>=0) {
			
			total++
			soma+=numero
			media=soma/total

			limpa()
			
			escreva("A soma é: "+soma+", já a média: "+media+" e o total de números inseridos é: "+total+"\n")
			
			escreva("\n Digite um número qualquer(caso seja negativo, o programa é interrompido): ")
			leia(numero)
		} 
		
		//por que não consigo apresentar o resultado fora do escopo? Como poderia fazer isso?
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 583; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */