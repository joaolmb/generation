/*
 * 4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.
 */
programa
{
	
	funcao inicio()
	{
		inteiro numero

		escreva("Olá! Insira um número inteiro(positivo ou negativo): ")
		leia(numero)

		se(numero==0) {
			escreva("O número é 0")
		}senao{
			se(numero%2 == 0) {
				se(numero > 0) {
					escreva("O número "+numero+" é par e positivo")
				} senao{
					escreva("O número "+numero+" é par e negativo")
				}
			} senao se(numero>0) {
				escreva("O número "+numero+" é impar e positivo")	
			} senao {
				escreva("O número "+numero+" é impar e negativo")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 220; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */