/*
 * 5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
 */

import java.util.Scanner;
public class atv5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float num, somaNum=0;
		do { 
			System.out.println("digite um número qualquer para no final ver a soma de valores(digitar 0 interrompe a soma): ");
			num = input.nextFloat();
			somaNum+=num;
		} while(num!=0);
		
		System.out.println("A soma dos valores inseridos é: "+somaNum);

	}

}
