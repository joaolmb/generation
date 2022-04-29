programa
{
	
	funcao inicio()
	{	
		inteiro tempoSegundo, hora, minuto, segundo
		escreva("Digite o tempo do processo em segundos: ")
		leia(tempoSegundo)

		hora = tempoSegundo/3600
		minuto = (tempoSegundo%3600)/60
		segundo = tempoSegundo%3600%60

		escreva("O tempo do processo em horas, minutos e segundos é: "+hora+"h"+minuto+"m"+segundo+"s")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 354; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */