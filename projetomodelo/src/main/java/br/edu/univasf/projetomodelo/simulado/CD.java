package main.java.br.edu.univasf.projetomodelo.simulado;

public class CD {
	private String titulo, bandaAutora;
	private int ano;
	
	public CD(String titulo, String bandaAutora, int ano) {
		super();
		this.titulo = titulo;
		this.bandaAutora = bandaAutora;
		this.ano = ano;
	}

	public String getBandaAutora() {
		return bandaAutora;
	}
	public void setBandaAutora(String bandaAutora) {
		this.bandaAutora = bandaAutora;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
}