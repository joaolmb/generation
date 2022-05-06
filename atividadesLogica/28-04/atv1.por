programa
{
	
	funcao inicio()
	{
		inteiro anos, meses, dias, idadeDias
		
		escreva("Diga na sequência a sua idade em anos, meses e dias (valores inteiros, como: 18 anos, 3 meses e 5 dias)\n")
		escreva("Anos: ")
		leia(anos)
		escreva("Meses: ")
		leia(meses)
		escreva("Dias: ")
		leia(dias)
		
		idadeDias = anos*365 + meses*30 + dias
		escreva("A sua idade em dias é: " + idadeDias + " dias.\n")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 400; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */