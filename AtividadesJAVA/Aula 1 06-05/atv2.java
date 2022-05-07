import java.util.Scanner;

/*
 * Faça um programa que entre com três números e coloque em ordem crescente.
 */
public class atv2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		float x, y, z;

		System.out.println("Insira o 1º número: ");
		x = input.nextFloat();
		System.out.println("Insira o 2º número: ");
		y = input.nextFloat();
		System.out.println("Insira o 3º número: ");
		z = input.nextFloat();

		if (x > y && x < z) {
			System.out.println("A ordem crescente é: " + y + ", " + x + ", " + z);
		} else if (x > z && x < y) {
			System.out.println("A ordem crescente é: " + z + ", " + x + ", " + y);
		} else if (y > z && y < x) {
			System.out.println("A ordem crescente é: " + z + ", " + y + ", " + x);
		} else if (y > x && y < z) {
			System.out.println("A ordem crescente é: " + x + ", " + y + ", " + z);
		} else if (z > x && z < y) {
			System.out.println("A ordem crescente é: " + x + ", " + z + ", " + y);
		} else {
			System.out.println("A ordem crescente é: " + y + ", " + z + ", " + x);
		}
	}

}
