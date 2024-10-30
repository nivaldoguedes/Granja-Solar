package main.java.br.edu.univasf.projetomodelo.teste;

public class CamaroteSuperior extends VIP {
	private double valorAdicionalCS = 100;
	
	public double imprimeValor() {
		return super.imprimeValor() + valorAdicionalCS;
	}
}