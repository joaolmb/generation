package Aula11_05_2022;

public class ClienteATV01 {

	// Declarar atributos da classe
	private String nome;
	private int codigo;
	private String telefone;
	private String email;

	// Declarar m�todo construtor
	public ClienteATV01(String nome, int codigo, String telefone, String email) {
		this.nome = nome;
		this.codigo = codigo;
		this.telefone = telefone;
		this.email = email;
	}

	// Declarar demais m�todos da classe

	public void apresentarInfo() {
		System.out.println("O nome do cliente � " + nome + ", seu c�digo � " + codigo
				+ " e seus contatos s�o: -->Telefone: " + telefone + " -->E-mail: " + email);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
