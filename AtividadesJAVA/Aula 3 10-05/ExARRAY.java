package Aula10_05_2022;

import java.util.Scanner;

public class ExARRAY {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int y;
		System.out.println("\nEntre com o número de alunos: ");
		y = input.nextInt();
		
		
		float[] media = new float[y];
		float n1,n2,n3,somaMedia=0,mg;
		int x;
		
		for(x=0;x<2;x++) {
			
			System.out.println("\nEntre com a primeira nota: ");
			n1 = input.nextFloat();
			
			System.out.println("\nEntre com a segunda nota: ");
			n2 = input.nextFloat();
			
			System.out.println("\nEntre com a terceira nota: ");
			n3 = input.nextFloat();
			
			media[x] = (n1+n2+n3)/3;
			System.out.printf("\nMédia: %.2f",media[x]);
			
			somaMedia+=media[x];
			
		}
		mg=somaMedia/x;
		System.out.printf("\n\nMédia Geral: %.2f",mg);

	}

}
