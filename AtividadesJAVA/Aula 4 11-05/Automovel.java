package Aula11_05_2022;

public class Automovel {

	// Declaração dos atributos da classe

	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;

	// declaração do método construtor
	public Automovel(String nomeProprietario, String modelo, String placa, int ano) {
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	}

	// Declaração dos demais métodos da classe

	public void imprimirInfo() {
		System.out.println("\nNome do proprietário: " + nomeProprietario + " possui o moledo " + modelo + " com placa: "
				+ placa + " e ano " + ano);
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}