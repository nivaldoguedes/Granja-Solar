package main.java.br.edu.univasf.projetomodelo.teste;

public class VIP extends Ingresso {
	private double valorAdicional = 100;
	
	public double imprimeValor() {
		return getValor() + valorAdicional;
	}
}