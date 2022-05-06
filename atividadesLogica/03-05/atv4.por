/*
 * 4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
 */
programa
{
	
	funcao inicio()
	{
		real matriz[3][3], soma=0.0, somaDiagonal=0.0
		inteiro linha, coluna

		para(linha=0;linha<3;linha++) {
			escreva("Linha ",linha+1,"\n")
			para(coluna=0;coluna<3;coluna++) {
				escreva("Digite um número qualquer: ")
				leia(matriz[linha][coluna])

				soma+=matriz[linha][coluna]
				
				se(linha==coluna) {
					somaDiagonal+=matriz[linha][coluna]
				}
			}
			escreva("\n")
		}
		limpa()


		//coloquei a visualização da matriz para ficar mais fácil para entender na visão do usuário
		para(linha=0;linha<3;linha++) {
			para(coluna=0;coluna<3;coluna++) {
				escreva(matriz[linha][coluna]," | ")
			}
			escreva("\n")
		}
		
		escreva("A soma dos valores inseridos é: ",soma)
		escreva("\nA soma da diagonal principal é: ",somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 739; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 11, 7, 6}-{soma, 11, 21, 4}-{somaDiagonal, 11, 31, 12};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */