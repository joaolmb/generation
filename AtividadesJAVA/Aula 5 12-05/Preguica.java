package aula12_05_2022;

public class Preguica extends Animal {
	
private String sobeArvore;
	
	public Preguica(String nome, int idade, String emiteSom, String sobeArvore) {
		super(nome, idade, emiteSom);
		this.sobeArvore = sobeArvore;
	}

	public String getSobeArvore() {
		return sobeArvore;
	}

	public void setDeveCorrer(String sobeArvore) {
		this.sobeArvore = sobeArvore;
	}
	
	public void imprimirInfo() {
		System.out.println("O animal é o preguiça. Seu nome é: "+getNome()+" e sua idade "+getIdade()+" anos. Ele emite som? "+getEmiteSom()+". E deve subir arvores? "+getSobeArvore());
	}

}