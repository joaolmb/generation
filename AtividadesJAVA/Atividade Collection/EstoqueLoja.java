package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueLoja {

	public static void main(String[] args) throws InterruptedException {

		int op;

		// Inst�ncias
		Scanner input = new Scanner(System.in);

		ArrayList<String> estoque = new ArrayList();

		do {
			System.out.println("***********************  -Menu principal-  **********************\n");
			System.out.println("(1) Quero adicionar um produto ao estoque.\n"
					+ "(2) Quero remover um produto do estoque.\n" + "(3) Quero atualizar um produto do estoque.\n"
					+ "(4) Quero mostrar todos os produtos do estoque.\n" + "(0) Sair\n");
			System.out.println("\n****************************************************************");
			System.out.println("\tDigite o n�mero correspondente a op��o que deseja:");
			op = input.nextInt();

			switch (op) {
			case 1:
				input.nextLine();
				System.out.println("Qual o produto que gostaria de adicionar ao estoque?");
				String produto = input.nextLine();
				estoque.add(produto);
				break;
			
			case 2:
				input.nextLine();
				System.out.println("Qual o produto que gostaria de remover do estoque?");
				String produto1 = input.nextLine();
				if(estoque.contains(produto1)) {
					estoque.remove(produto1);
				} else {
					System.out.println("O produto digitadoo n�o existe no estoque. Retornando ao menu...");
					Thread.sleep(2000);
				}
				break;
			
			case 3:
				input.nextLine();
				System.out.println("Digite o produto que voc� deseja atualizar:");
				String verifica = input.nextLine();
				System.out.println("Digite o produto que vai entrar no lugar do produto "+verifica+":");
				String novoProduto = input.nextLine();
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novoProduto);
				} else {
					System.out.println("Produto selecionado n�o existe. Retornando ao menu principal...");
					Thread.sleep(2000);
				}
				break;
				
			case 4:
				System.out.println("Os produtos em estoque s�o: "
						+ "\n"+estoque);
				Thread.sleep(1000);
				break;
				
			case 0:
				System.out.print("Saindo");
				for(int x=0;x<3;x++) {
					System.out.print(".");
					Thread.sleep(1000);
				}
				System.out.println(" At� a pr�xima!");
				break;
			
			default:
				System.out.println("Op��o inv�lida. Digite uma op��o v�lida.");
			}
		} while (op != 0);

	}

}
