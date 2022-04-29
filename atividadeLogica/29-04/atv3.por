/*
 * Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
 */
programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real n1,n2,n3,n4

		escreva("Digite o número 1: ")
		leia(n1)
		escreva("Digite o número 2: ")
		leia(n2)
		escreva("Digite o número 3: ")
		leia(n3)
		escreva("Digite o número 4: ")
		leia(n4)

		limpa()
		
		se(n3>=1000) {
			escreva("O valor do número 3("+n3+") ao quadrado é:"+mat.potencia(n3, 2))
		} senao {
			escreva("O valor do número 1 é: "+n1+" e seu quadrado é : " )
			n1= mat.potencia(n1,2)
			escreva(n1)
			escreva("\nO valor do número 2 é: "+n2+" e seu quadrado é: ")
			n2= mat.potencia(n2,2)
			escreva(n2)
			escreva("\nO valor do número 3 é: "+n3+" e seu quadrado é: ")
			n3= mat.potencia(n3,2)
			escreva(n3)
			escreva("\nO valor do número 2 é: "+n4+" e seu quadrado é: ")
			n4= mat.potencia(n4,2)
			escreva(n4)
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 399; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */