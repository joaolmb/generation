import java.util.Scanner;

/*
 * Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
 */
public class atv2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		float x, y, z;

		System.out.println("Insira o 1� n�mero: ");
		x = input.nextFloat();
		System.out.println("Insira o 2� n�mero: ");
		y = input.nextFloat();
		System.out.println("Insira o 3� n�mero: ");
		z = input.nextFloat();

		if (x > y && x < z) {
			System.out.println("A ordem crescente �: " + y + ", " + x + ", " + z);
		} else if (x > z && x < y) {
			System.out.println("A ordem crescente �: " + z + ", " + x + ", " + y);
		} else if (y > z && y < x) {
			System.out.println("A ordem crescente �: " + z + ", " + y + ", " + x);
		} else if (y > x && y < z) {
			System.out.println("A ordem crescente �: " + x + ", " + y + ", " + z);
		} else if (z > x && z < y) {
			System.out.println("A ordem crescente �: " + x + ", " + z + ", " + y);
		} else {
			System.out.println("A ordem crescente �: " + y + ", " + z + ", " + x);
		}
	}

}
