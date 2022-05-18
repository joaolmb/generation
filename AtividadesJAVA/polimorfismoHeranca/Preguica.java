package polimorfismoHeranca;

public class Preguica extends Animal{
	
	public Preguica() {
		super("Bruno",43);
	}
	
	public void somEmitido(String som) {
		System.out.println(som+"AAAAAAA");
		
	}
	
	public void funcao(String funcao) {
		System.out.println(funcao+"subir árvores");
	}

}
