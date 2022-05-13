package aula12_05_2022;

public class Cavalo extends Animal {
	
private String deveCorrer;
	
	public Cavalo(String nome, int idade, String emiteSom, String deveCorrer) {
		super(nome, idade, emiteSom);
		this.deveCorrer = deveCorrer;
	}

	public String getDeveCorrer() {
		return deveCorrer;
	}

	public void setDeveCorrer(String deveCorrer) {
		this.deveCorrer = deveCorrer;
	}
	
	public void imprimirInfo() {
		System.out.println("O animal é o cavalo. Seu nome é: "+getNome()+" e sua idade "+getIdade()+" anos. Ele emite som? "+getEmiteSom()+". E deve correr? "+getDeveCorrer());
	}

}
