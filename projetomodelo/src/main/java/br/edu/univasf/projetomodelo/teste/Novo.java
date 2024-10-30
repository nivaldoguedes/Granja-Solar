package main.java.br.edu.univasf.projetomodelo.teste;

public class Novo extends Imovel {
	private float precoAdicional = getPreco() + 200;
	
	public float imprimePreco() {
		return precoAdicional;
	}
}