/*
 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.
package Aula10_05_2022;
 */
package Aula10_05_2022;

import java.util.Scanner;

public class atv02_Array {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] num = new int[6];
		int x, somaPar=0,quantImpar=0;
		
		for(x=0;x<6;x++) {
			System.out.println("Digite um n�mero inteiro qualquer: ");
			num[x] = input.nextInt();
			
			if(num[x]%2==0) {
				somaPar+=num[x];
			} else {
				quantImpar++;
			}
		}
		
		for(x=0;x<6;x++) {
			if(num[x]%2==0) {
				System.out.println(num[x]+" <-- par\n");
			} else {
				System.out.println(num[x]+" <-- �mpar\n");
			}
		}
		System.out.println("\nA soma dos pares �: "+somaPar+"\nE a quantidade de �mpares �: "+quantImpar);

	}

}
