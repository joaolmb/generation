package aula12_05_2022;
	
public class Animal {
	
	// definição de atributos
	private String nome;
	private int idade;
	private String emiteSom;
	
	// Montar o construtor da classe
	public Animal(String nome, int idade, String emiteSom ) {
		super(); // indica que o construtor faz parte da superclasse
		this.nome = nome;
		this.idade = idade;
		this.emiteSom = emiteSom;
		
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmiteSom() {
		return emiteSom;
	}

	public void setEmiteSom(String emiteSom) {
		this.emiteSom = emiteSom;
	}
	
	
	
}
