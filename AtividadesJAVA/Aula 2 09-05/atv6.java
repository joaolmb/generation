/*
 * 6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
 */

import java.util.Scanner;
public class atv6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num, quantMult3=0;
		float mediaMult3, somaMult3=0;
		
		do {
			System.out.println("digite um n�mero inteiro qualquer: ");
			num = input.nextInt();
			if(num%3==0) {
				quantMult3++;
				somaMult3+=num;
			}
			
		} while(num!=0);
		quantMult3--; //-1 para o 0 ser desconsiderado, sen�o atrapalha.
		mediaMult3 = somaMult3/(quantMult3); 
		System.out.println("A m�dia dos n�meros multiplos de 3 digitados �: "+mediaMult3 +" "+ quantMult3 +" "+ somaMult3 );
	}

}
