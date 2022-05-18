package polimorfismoHeranca;

public class Cachorro extends Animal {
	
	public Cachorro() {
		super("Toto",12);
	}
	
	public void somEmitido(String som) {
		System.out.println(som+" Au Au");
		
	}
	
	public void funcao(String funcao) {
		System.out.println(funcao+" proteger casa");
	}
	

}
