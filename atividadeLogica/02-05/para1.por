programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		inteiro nHab, nFilhos, somaFilhos=0
		real salario, medSalario=0.0, somaSalario=0.0, medFilhos=0.0, menor100=0.0, maiorSal=0.0
	
		para(nHab=0;nHab<4;nHab++) {
			escreva("Qual seu salário? ")
			leia(salario)
			se(salario>maiorSal) {
				maiorSal=salario
			}
			se(salario<100) {
				menor100++
			} 
			escreva("Quantos filhos você possui? ")
			leia(nFilhos)
			limpa()
			somaFilhos += nFilhos
			somaSalario += salario
		}
		
		medFilhos = somaFilhos/(nHab)
		medSalario = somaSalario/(nHab)
		
		escreva("\nA média do salário dos 20 habitantes é: R$"+mat.arredondar(medSalario, 2))
		escreva("\nA média de filhos dos 20 habitantes é: "+mat.arredondar(medFilhos, 2))
		escreva("\nO maior salário é: R$" + maiorSal)
		escreva("\nA porcentagem de pessoas com o salário menor que R$100,00 é: "+ mat.arredondar(menor100/(nHab-1)*100,2) + "%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 106; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */