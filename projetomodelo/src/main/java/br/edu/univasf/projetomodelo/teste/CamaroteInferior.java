package main.java.br.edu.univasf.projetomodelo.teste;

public class CamaroteInferior extends VIP {
	private String localizacao = "Camarote inferior";
	
	public String imprimeLocalizacao() {
		return localizacao;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
}