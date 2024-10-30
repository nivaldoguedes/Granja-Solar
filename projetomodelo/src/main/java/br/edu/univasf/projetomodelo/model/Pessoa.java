package main.java.br.edu.univasf.projetomodelo.model;
import java.util.Date;

import main.java.br.edu.univasf.projetomodelo.escola.*;

public class Pessoa {
	private String nome, CPF;
	private Date nascimento;
	private int idade;
	private char genero;
	private Endereco endereco;
	
	public boolean mesmoNome(Pessoa p) {
		return this.nome.equals(p.getNome());
	}
	
	public String toString () {
		return "Nome: " + this.nome + "\nCPF: " + this.CPF + "\nGênero: " + this.genero + "\nIdade: " + this.idade;
	}
	
	public String Realizar() {
		return "Faz coisas";
	}
	
	public Pessoa () {
		
	};
	/*public Pessoa(String nome, String CPF, Date nascimento, int idade, char genero, Endereco endereco) {
		super();
		this.nome = nome;
		this.CPF = CPF;
		this.nascimento = nascimento;
		this.idade = idade;
		this.genero = genero;
		this.endereco = endereco;
	}*/

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}