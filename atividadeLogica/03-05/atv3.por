/*
 * 3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.
 */programa
{
	
	funcao inicio()
	{
		inteiro linha, coluna
		real n1[4][6], n2[4][6]

		para(linha=0;linha<4;linha++) {

			para(coluna=0;coluna<6;coluna++) {
				escreva("Digite um número qualquer: ")
				leia(n1[linha][coluna])
			}
		}
		
		limpa()
		
		para(linha=0;linha<4;linha++) {

			para(coluna=0;coluna<6;coluna++) {
				escreva("Digite um número qualquer: ")
				leia(n2[linha][coluna])
			}
		}
		
		limpa()

		escreva("\tA soma dos valores das matrizes é: \n\n")
		para(linha=0;linha<4;linha++) {
			para(coluna=0;coluna<6;coluna++) {
				escreva(n1[linha][coluna] + n2[linha][coluna],"\t")
			}
			escreva("\n\n")
		}

		escreva("\tA diferença dos valores das matrizes é: \n\n")
		para(linha=0;linha<4;linha++) {
			para(coluna=0;coluna<6;coluna++) {
				escreva(n1[linha][coluna] - n2[linha][coluna],"\t")
			}
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 911; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 13, 7, 2}-{n2, 13, 17, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */