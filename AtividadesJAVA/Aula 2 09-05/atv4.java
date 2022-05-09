/*
 * 4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 */
import java.util.Scanner;

public class atv4 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numPessoas=0, idade, sexo, paciencia, pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0, menor18calmo=0, maior40nerv=0; 
		
		while(numPessoas<150) {
			System.out.println("Olá. Qual a sua idade? ");
			idade = leia.nextInt();
			System.out.println("Qual seu sexo? \n1 - Feminino\n2 - Masculino\n3 - Outro ");
			sexo = leia.nextInt();
			System.out.println("Qual opção reflete como você é? \n1 - Calme\n2 - Nervose\n3 - Agressive ");
			paciencia = leia.nextInt();
			
			
			if(paciencia==1) {
				pessoasCalmas++;
			}
			if(sexo==1 && paciencia==2) {
				mulheresNervosas++;
			}
			if(sexo==2 && paciencia==3) {
				homensAgressivos++;
			}
			if(sexo==3 && paciencia==1) {
				outrosCalmos++;
			}
			if(idade>=40 && paciencia==2) {
				maior40nerv++;
			}
			if(idade<=18 && paciencia==1) {
				menor18calmo++;
			}
			
			numPessoas++;
		}
		
		System.out.println("O número de pessoas calmas é: "+pessoasCalmas);
		System.out.println("O número de mulheres nervosas é: "+mulheresNervosas);
		System.out.println("O número de homens agressivos; é: "+homensAgressivos);
		System.out.println("O número de outros calmos;s é: "+outrosCalmos);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é: "+maior40nerv);
		System.out.println("O número de pessoas calmas com menos de 18 anos é: "+menor18calmo);
		
	}

}
