package polimorfismoHeranca;

public abstract class Animal {
	
	protected String nome;
	protected int idade;
	
	abstract public void somEmitido(String som);
	abstract public void funcao(String funcao);
	
	public Animal(String nome, int idade) {
		this.nome=nome;
		this.idade=idade;
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
	
}
