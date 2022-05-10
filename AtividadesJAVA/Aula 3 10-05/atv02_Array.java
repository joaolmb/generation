/*
 * 2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
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
			System.out.println("Digite um número inteiro qualquer: ");
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
				System.out.println(num[x]+" <-- ímpar\n");
			}
		}
		System.out.println("\nA soma dos pares é: "+somaPar+"\nE a quantidade de ímpares é: "+quantImpar);

	}

}
