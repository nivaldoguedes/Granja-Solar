package main.java.br.edu.univasf.projetomodelo.escola;

import java.util.Date;

import main.java.br.edu.univasf.projetomodelo.model.Endereco;
import main.java.br.edu.univasf.projetomodelo.model.Pessoa;

public class Trabalhador extends Pessoa{
	private String PIS;
	private int CH;
	private boolean empregado, empreendedor, VA, VR, VT;
	private float salario;
	
	public Trabalhador(String nome, String CPF, Date nascimento, int idade, char genero, Endereco endereco, String PIS,
			int CH, boolean empregado, boolean empreendedor, boolean VA, boolean VR, boolean VT, float salario) {
		//super(nome, CPF, nascimento, idade, genero, endereco);
		this.PIS = PIS;
		this.CH = CH;
		this.empregado = empregado;
		this.empreendedor = empreendedor;
		this.VA = VA;
		this.VR = VR;
		this.VT = VT;
		this.salario = salario;
	}
	
	public String getPIS() {
		return PIS;
	}
	public void setPIS(String PIS) {
		this.PIS = PIS;
	}
	public int getCH() {
		return CH;
	}
	public void setCH(int CH) {
		this.CH = CH;
	}
	public boolean isEmpregado() {
		return empregado;
	}
	public void setEmpregado(boolean empregado) {
		this.empregado = empregado;
	}
	public boolean isEmpreendedor() {
		return empreendedor;
	}
	public void setEmpreendedor(boolean empreendedor) {
		this.empreendedor = empreendedor;
	}
	public boolean isVA() {
		return VA;
	}
	public void setVA(boolean VA) {
		this.VA = VA;
	}
	public boolean isVR() {
		return VR;
	}
	public void setVR(boolean VR) {
		this.VR = VR;
	}
	public boolean isVT() {
		return VT;
	}
	public void setVT(boolean VT) {
		this.VT = VT;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
}