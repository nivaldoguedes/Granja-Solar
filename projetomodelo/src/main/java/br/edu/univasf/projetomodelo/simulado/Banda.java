package main.java.br.edu.univasf.projetomodelo.simulado;

public class Banda {
	private String nome, estilo;
	private int numeroIntegrantes = 0;
	
	public Banda(String nome, String estilo, int numeroIntegrantes) {
		super();
		this.nome = nome;
		this.estilo = estilo;
		this.numeroIntegrantes = numeroIntegrantes;
	}
	
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroIntegrantes() {
		return numeroIntegrantes;
	}

	public void setNumeroIntegrantes(int numeroIntegrantes) {
		this.numeroIntegrantes = numeroIntegrantes;
	}	
}