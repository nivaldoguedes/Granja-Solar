package main.java.br.edu.univasf.projetomodelo.teste;

public class Velho extends Imovel {
	private float descontoPreco = getPreco() - 100;
	
	public float imprimePreco() {
		return descontoPreco;
	}

}