package aula12_05_2022;

public class TesteAnimal {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Toto", 3, "Auau", "sim");
		dog.imprimirInfo();
		
		Cavalo cavalo = new Cavalo("horse", 10, "Hihihihi", "sim, demais");
		cavalo.imprimirInfo();
		
		Preguica lazy = new Preguica("lazy", 12, "...", "sim, lentamente");
		lazy.imprimirInfo();
			
	}

}