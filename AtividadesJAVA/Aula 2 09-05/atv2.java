/*
 * 2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */
import java.util.Scanner;
public class atv2 {

	public static void main(String[] args) {
		int num, contador, quantPar=0, quantImpar=0;
		
		Scanner input = new Scanner(System.in);
		
		for(contador=0;contador<10;contador++) {
			
			System.out.println("\nDigite um n�mero inteiro qualquer: ");
			num = input.nextInt();
			
			if(num%2==0) {
				quantPar++;
			} else {
				quantImpar++;
			}
		}
		
		System.out.println("\nA quantidade de n�meros pares �: "+quantPar+"\nE a quantidade de �mpares �: "+quantImpar);

	}

}
