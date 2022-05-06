import java.util.Scanner;

/*
 * Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.

 */
public class atv4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Digite um número qualquer: ");
		numero = input.nextFloat();
		
		if(numero%2==0) {
			System.out.printf("O número " + numero + " é par e sua raiz(arredondada) é: %2.2f" , Math.sqrt(numero));
		} else {
			System.out.println("O número " + numero + " é impar e o seu quadrado é: " + Math.pow(numero, 2));
		}

	}

}
