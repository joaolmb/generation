package Familia52;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {

		double n1, n2, n3, media;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nEntre com a primeira 1? nota: ");
		n1 = leia.nextFloat();

		System.out.println("\nEntre com a segunda nota: ");
		n2 = leia.nextFloat();

		System.out.println("\nEntre com a terceira nota: ");
		n3 = leia.nextFloat();

		media = (n1 + n2 + n3) / 3;
		System.out.println("\nM?dia Aritm?tica: " + media);
		System.out.printf("\nM?dia Aritm?tica: %.2f", media); // printf ? para arredondar, mas voc? deve colocar o %n.nf
																// para definir casas antes e depois da virgula

		if (media >= 7 && media < 10) {
			System.out.println("\nAlune aprovade!!!");
		} else if (media >= 5 && media < 7) {
			System.out.println("\nAlune de Exame!");
		} else {
			System.out.println("Alune reprovade! :( ");
		}

		n1 = Math.sqrt(n2);
		n2 = Math.pow(n3, 3);

		int op;
		System.out.println("\n\tMenu de elogios: ");
		System.out.println("\n1 - Fam?lia muito comprenetrada.");
		System.out.println("\n2 - Fam?lia muito unida.");
		System.out.println("\n3 - Fam?lia muito criativa.");
		System.out.println("\n1 - Fam?lia muito gentil.");
		System.out.println("\nEscolha uma op??o: ");
		op = leia.nextInt();

		switch (op) {
		case 1:
			System.out.println("\n1 - Fam?lia muito comprenetrada.");
			break;
		case 2:
			System.out.println("\n2 - Fam?lia muito unida.");
			break;
		case 3:
			System.out.println("\n3 - Fam?lia muito criativa.");
			break;
		case 4:
			System.out.println("\n1 - Fam?lia muito gentil.");
			break;
		default:
			System.out.println("Op??o inv?lida");
		}
	}

}
