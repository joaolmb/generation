import java.util.Scanner;

/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.

 */
public class atv4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Digite um n�mero qualquer: ");
		numero = input.nextFloat();
		
		if(numero%2==0) {
			System.out.printf("O n�mero " + numero + " � par e sua raiz(arredondada) �: %2.2f" , Math.sqrt(numero));
		} else {
			System.out.println("O n�mero " + numero + " � impar e o seu quadrado �: " + Math.pow(numero, 2));
		}

	}

}
