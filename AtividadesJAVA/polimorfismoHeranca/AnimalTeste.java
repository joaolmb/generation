package polimorfismoHeranca;

import java.util.Scanner;

public class AnimalTeste {

	public static void main(String[] args) throws InterruptedException {

		int op;

		Scanner input = new Scanner(System.in);

		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();

		Animal animal = null;

		do {
			System.out.println("\n\tEscolha o número do animal de sua preferência:\n" + "\n(1) - Cachorro"
					+ "\n(2) - Cavalo" + "\n(3) - Preguiça" + "\n(0) - Para sair");
			op = input.nextInt();

			try {
				switch (op) {
				case 0:
					System.out.print("Saindo");
					for (int x = 0; x < 3; x++) {
						System.out.print(".");
						Thread.sleep(1000);
					}
					break;
				case 1:
					animal = cachorro;
					break;
				case 2:
					animal = cavalo;
					break;
				case 3:
					animal = preguica;
					break;
				default:
					System.out.println("Erro!! Provavelmente você selecionou uma opção inválida");
					animal = null;
					break;
				}
				System.out.println("O nome do animal escolhido é " + animal.getNome());
				System.out.println("Sua idade é de " + animal.getIdade() + " anos");
				animal.somEmitido("O som que ele emite é ");
				animal.funcao("E sua função é ");
			} catch (NullPointerException e) {
				if(op!=0) {
					System.out.println("Digite uma nova opção");
				} else {
					System.out.println(" Até a próxima");
				}
				
			}
			

		} while (op != 0);

	}

}
