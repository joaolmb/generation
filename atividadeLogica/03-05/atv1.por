/*
 * 1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
 */

programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real valor[5], maiorValor=0.
		inteiro x
		para(x=0; x<5; x++) {
			escreva("Digite o valor ",x+1,": ")
			leia(valor[x])
			se(valor[x]>maiorValor) {
				maiorValor=valor[x]
			}
			
		}

		limpa()
		
		para(x=0;x<5;x++) {
			escreva("O valor da nota ",x+1," é: [",valor[x],"] \n")
		}
		
		escreva("\nO maior valor é: ",maiorValor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 507; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valor, 12, 7, 5}-{maiorValor, 12, 17, 10};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */