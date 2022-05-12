package Aula11_05_2022;

public class TesteAutomovel {

	public static void main(String[] args) {
		
		//instanciando um objeto da classe Automóvel
		Automovel auto1 = new Automovel("Luciana Rocha", "Mazda", "LD2019", 2023);
		
		auto1.imprimirInfo();
		System.out.println("\n**********Transferência de Proprietárie**********");
		auto1.setNomeProprietario("Tácio Ferreira");
		auto1.imprimirInfo();
		
	}

}
