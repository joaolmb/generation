import java.util.Scanner;

public class exWhile {

	public static void main(String[] args) {
		
		int num,somaNum=0, quantNum=0;
		float mediaNum;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nEntre com um número(int): ");
		num = input.nextInt();
		
		while(num!=0) {
			somaNum+=num;
			quantNum++;
			System.out.println("\nEntre com um número(int): ");
			num = input.nextInt();
		}
		mediaNum = somaNum/quantNum;
		System.out.println("\nMédia dos números lidos foi de "+mediaNum);

	}

}
