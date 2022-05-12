package Aula11_05_2022;

public class ATV01 {

	public static void main(String[] args) {
		
		ClienteATV01 cliente01 = new ClienteATV01("João Lucas", 01, "31998065243", "joaolmb2@gmail.com");
		
		cliente01.apresentarInfo();
		
		Automovel joao = new Automovel("joao", "joao", "joao", 23);
		joao.imprimirInfo();

	}

}
