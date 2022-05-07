import java.util.Scanner;

/*
 * Faça um programa que receba três inteiros e diga qual deles é o maior.
 */
public class atv1 {

	public static void main(String[] args) {
		
		int x,y,z;
		
		Scanner input = new Scanner(System.in);
				
		System.out.println("Digite um número inteiro qualquer: ");
		x = input.nextInt();
		System.out.println("Digite um número inteiro qualquer: ");
		y = input.nextInt();
		System.out.println("Digite um número inteiro qualquer: ");
		z = input.nextInt();
		
		
		if(y>x && y>z) {
			System.out.println("O maior número é o: "+y);
		} else if(z>y && z>x) {
			System.out.println("O maior número é o: "+z);
		} else {
			System.out.println("O maior número é o: "+x);
		
		}
	}

}
