package polimorfismoHeranca;

public class Cavalo extends Animal {
	
	public Cavalo() {
		super("Pé de pano",22);
	}
	
	public void somEmitido(String som) {
		System.out.println(som+"hihihihi");
		
	}
	
	public void funcao(String funcao) {
		System.out.println(funcao+"correr");
	}

}
