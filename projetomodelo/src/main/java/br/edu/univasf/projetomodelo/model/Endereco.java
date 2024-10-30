package main.java.br.edu.univasf.projetomodelo.model;

public class Endereco {
	private String CEP;
	private String rua;
	private String bairro;
	private int numero;
	
	public Endereco(String CEP, String rua, String bairro, int numero) {
		super();
		this.CEP = CEP;
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
	}
	
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String CEP) {
		this.CEP = CEP;
	}
	public String getRua() {
		return rua;
	}	
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
}