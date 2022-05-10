/*
 * 1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
 */

package Aula10_05_2022;

import java.util.Scanner;

public class atv01_Array {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] A = new int[6];
		int soma = 0, x;

		// Nessa parte era para pedir o user mesmo?

		for (x = 0; x < 6; x++) {
			System.out.println("\n Digite um valor:");
			A[x] = input.nextInt();

			if (x == 0 || x == 1 || x == 5) {
				soma += A[x];
			}
		}

		A[4] = 100;

		for (x = 0; x < 6; x++) {
			System.out.println("\n" + A[x]);
		}

	}

}
