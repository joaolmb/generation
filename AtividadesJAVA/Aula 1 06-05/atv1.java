import java.util.Scanner;

/*
 * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */
public class atv1 {

	public static void main(String[] args) {
		
		int x,y,z;
		
		Scanner input = new Scanner(System.in);
				
		System.out.println("Digite um n�mero inteiro qualquer: ");
		x = input.nextInt();
		System.out.println("Digite um n�mero inteiro qualquer: ");
		y = input.nextInt();
		System.out.println("Digite um n�mero inteiro qualquer: ");
		z = input.nextInt();
		
		
		if(y>x && y>z) {
			System.out.println("O maior n�mero � o: "+y);
		} else if(z>y && z>x) {
			System.out.println("O maior n�mero � o: "+z);
		} else {
			System.out.println("O maior n�mero � o: "+x);
		
		}
	}

}
