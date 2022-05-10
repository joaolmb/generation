/*
 * 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */
package Aula10_05_2022;

import java.util.Scanner;

public class atv03_Array {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int linhas, colunas, quantMaior10=0;
		float num;

		for (linhas = 0; linhas < 3; linhas++) {
			for (colunas = 0; colunas < 3; colunas++) {
				System.out.println("Digite um número qualquer: ");
				matriz[linhas][colunas] = input.nextInt();
			}
		}
		for (linhas = 0; linhas < 3; linhas++) {
			for (colunas = 0; colunas < 3; colunas++) {
				
				if(matriz[linhas][colunas]>10) {
					quantMaior10++;
				}

			}

		}
		
		System.out.println("\nA quantidade de números maiores que 10 é: "+quantMaior10);

	}

}
