/*
 * 4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.

 */
package Aula10_05_2022;

import java.util.Scanner;

public class atv04_Array {

	public static void main(String[] args) {

		// Para cada matriz precisamos de declarar ou tem como eu declarar todas
		// juntas??
		Scanner input = new Scanner(System.in);
		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float[2][2];
		float[][] matrizRes = new float[2][2];
		int l, c, escolha;

		// Matriz 1
		System.out.println("\tMatriz 1:");
		for (l = 0; l < 2; l++) {
			for (c = 0; c < 2; c++) {
				System.out.println("Digite um valor para a posição da linha " + (l+1) + " e coluna " + (c+1));
				matriz1[l][c] = input.nextFloat();
			}
		}
		
		System.out.println("\tMatriz 2:");
		for (l = 0; l < 2; l++) {
			for (c = 0; c < 2; c++) {
				System.out.println("Digite um valor para a posição da linha " + (l+1) + " e coluna " + (c+1));
				matriz2[l][c] = input.nextFloat();
			}
		}
		
		System.out.println("Escolha uma das opções abaixo:\n1 - Somar matrizes\n2 - Subtrair a primeira matriz da segunda\n3 - Adicionar constante de sua esscolha às matrizes\n4 - Imprimir matrizes");
		escolha = input.nextInt();
		
		while(escolha!=1 && escolha!=2 && escolha!=3 && escolha!=4) {
			System.out.println("\nValor inválido. Digite um número inteiro de 1 a 4");
			escolha = input.nextInt();
		}
		
		switch(escolha) {
		case 1:
			for(l=0;l<2;l++) {
				for(c=0;c<2;c++) {
					matrizRes[l][c] = matriz1[l][c] + matriz2[l][c];
				}
			}
			break;
		case 2:
			for(l=0;l<2;l++) {
				for(c=0;c<2;c++) {
					matrizRes[l][c] = matriz2[l][c] - matriz1[l][c];
				}
			}
			break;
		case 3:
			final float constante;
			System.out.println("Qual valor você gostaria de adicionar?");
			constante = input.nextFloat();
			for(l=0;l<2;l++) {
				for(c=0;c<2;c++) {
					matriz1[l][c]+=constante;
					matriz2[l][c]+=constante;
				}
			}
			break;
		case 4:
			System.out.println("\tMatriz 1:\n");
			for(l=0;l<2;l++) {
				for(c=0;c<2;c++) {
					System.out.print(matriz1[l][c]+"\t");
				}
				System.out.println("\n");
			}
			System.out.println("\tMatriz 2:\n");
			for(l=0;l<2;l++) {
				for(c=0;c<2;c++) {
					System.out.print(matriz2[l][c]+"\t");
				}
				System.out.println("\n");
			}
			break;
		}

	}

}