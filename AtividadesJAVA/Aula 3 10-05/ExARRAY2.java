package Aula10_05_2022;

import java.util.Scanner;

public class ExARRAY2 {

	public static void main(String[] args) {

		final int linha = 2, coluna = 3;
		
		int[][] numeros = new int[linha][coluna];
		int contMaior10 = 0, contMenor10 = 0, l, c;

		Scanner input = new Scanner(System.in);

		for (l = 0; l < 2; l++) {
			for (c = 0; c < 3; c++) {
				System.out.println("\nEntre com um número inteiro");
				numeros[l][c] = input.nextInt();
			}
		}

		for (l = 0; l < 2; l++) {
			for (c = 0; c < 3; c++) {

				if (numeros[l][c] > 10) {
					System.out.println(numeros[l][c] + " <-- Maior que 10");

				} else if (numeros[l][c] < 10) {
					System.out.println(numeros[l][c] + " <-- Menor que 10");
				} else {
					System.out.println("O número é o próprio 10");
				}
			}
		}
	}
}
