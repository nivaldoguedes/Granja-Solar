package main.java.br.edu.univasf.projetomodelo.fazenda;
import java.util.Date;

import main.java.br.edu.univasf.projetomodelo.model.*;

public class Rica extends Pessoa {
	private double dinheiro;
	
	public Rica(double dinheiro) {
		super();
		this.dinheiro = dinheiro;
	}

	public String Realizar() {
		return "faz compras";
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	};
	
}