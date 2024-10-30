package main.java.br.edu.univasf.projetomodelo.escola;
import java.util.Date;

import main.java.br.edu.univasf.projetomodelo.model.Endereco;
import main.java.br.edu.univasf.projetomodelo.model.Pessoa;

public class Estudante extends Pessoa {
	private String escolaridade, matricula;
	private boolean matriculado, cotista;

	public boolean equals (Estudante e) {
		if (this.mesmoNome(e) && matricula == e.matricula)
			return true;
		else
			return false;
	}
	
	public boolean equals (Object o) {
		if (!(o instanceof Estudante))
			return false;
		Estudante e = (Estudante) o;
			return this.equals(e);
	}

	public Estudante(String nome, String CPF, Date nascimento, int idade, char genero, Endereco endereco, String escolaridade, String matricula, boolean matriculado, boolean cotista) {
		//super(nome, CPF, nascimento, idade, genero, endereco);
		this.escolaridade = escolaridade;
		this.matricula = matricula;
		this.matriculado = matriculado;
		this.cotista = cotista;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public boolean isMatriculado() {
		return matriculado;
	}

	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}

	public boolean isCotista() {
		return cotista;
	}

	public void setCotista(boolean cotista) {
		this.cotista = cotista;
	}
}