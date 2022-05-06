/*
 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
 */
programa
{
	
	funcao inicio()
	{
		inteiro valorDado[10], maiorP=0, quantMaiorP=1, x
		real media, somaValores=0.0
		
		para(x=0;x<10;x++) {
			escreva("Digite o valor do ",x+1,"º lançamento: ")
			leia(valorDado[x])

			se(valorDado[x]>maiorP) {
				maiorP=valorDado[x]
				quantMaiorP = 1
			} senao se(valorDado[x]==maiorP) {
				quantMaiorP++
			}
			
			somaValores+=valorDado[x]
			
		}
		
		media = somaValores/x
		limpa()
		
		para(x=0;x<10;x++) {
			escreva("Valor do ",x+1,"º lançamento: ", valorDado[x],"\n")
		}
		escreva("\n\tA A média dos lançamentos é: ",media,"\n")
		escreva("\n\tA maior pontuação foi: ",maiorP,"\n")
		escreva("\n\tE ela se repetiu ",quantMaiorP," vez(es)\n")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 875; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valorDado, 12, 10, 9}-{maiorP, 12, 25, 6}-{quantMaiorP, 12, 35, 11}-{media, 13, 7, 5}-{somaValores, 13, 14, 11};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */