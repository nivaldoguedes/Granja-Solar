package main.java.br.edu.univasf.projetomodelo.escola;
import java.util.Date;

import main.java.br.edu.univasf.projetomodelo.model.Endereco;

public class Graduado extends Estudante{
	private boolean Diploma;
	private Date formatura;
	
	public Graduado(String nome, String CPF, Date nascimento, int idade, char genero, Endereco endereco,
			String escolaridade, String matricula, boolean matriculado, boolean cotista, boolean diploma,
			Date formatura) {
		super(nome, CPF, nascimento, idade, genero, endereco, escolaridade, matricula, matriculado, cotista);
		Diploma = diploma;
		this.formatura = formatura;
	}
	
	public boolean isDiploma() {
		return Diploma;
	}
	
	public void setDiploma(boolean diploma) {
		Diploma = diploma;
	}
	
	public Date getFormatura() {
		return formatura;
	}
	
	public void setFormatura(Date formatura) {
		this.formatura = formatura;
	}
}