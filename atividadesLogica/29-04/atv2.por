/*
 * 2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.
 */
programa
{
	
	funcao inicio()
	{
		inteiro N,E,S, T
		cadeia C
		escreva("Digite o seu código: ")
		leia(C)
		escreva("Agora insira o número de horas trabalhadas por você: ")
		leia(N)

		limpa()
		
		se(N>50) {
			E = (N%50)*20
		} senao {
			E = 0
		}

		S = N*10
		T = S+E
		
		escreva("Funcionário "+C+", o seu salário é: R$" +S+",00")
		escreva("\nO seu salário excedente é: R$" +E+",00\nE seu salário total é: R$"+T+",00")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 872; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */