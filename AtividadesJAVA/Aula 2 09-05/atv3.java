/*
 * 3- Solicitar a idade de v�rias pessoas e imprimir: 
 * Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. 
 * O programa termina quando
idade for =-99. (WHILE)
 */
import java.util.Scanner;

public class atv3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int idade, maior50=0, menor21=0;
		
		System.out.println("\nDigite uma idade qualquer(anos): ");
		idade = input.nextInt();
		
		while(idade!=-99) {
			if(idade<21) {
				menor21++;
			} else if(idade>50) {
				maior50++;
			}
			
			System.out.println("\nDigite uma idade qualquer(anos): ");
			idade = input.nextInt();
		}
		System.out.println("\nO n�mero de pessoas com a idade menor que 21 anos �: "+menor21+"\nE o n�mero de pessoas com idade maior que 50 anos �: "+maior50);

	}

}
