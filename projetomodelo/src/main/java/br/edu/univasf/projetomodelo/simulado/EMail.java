package main.java.br.edu.univasf.projetomodelo.simulado;

public class EMail {
	private String remetente;
	private String destinatario;
	private String corpoEmail;
	private String data;
	Anexo A1;
	Anexo A2;
	Anexo A3;
	
	public boolean equals(Anexo a)
	{
		return true;
	}
	
	public EMail(String remetente, String destinatario, String corpoEmail, String data, Anexo a1, Anexo a2, Anexo a3) {
		super();
		this.remetente = remetente;
		this.destinatario = destinatario;
		this.corpoEmail = corpoEmail;
		this.data = data;
		A1 = a1;
		A2 = a2;
		A3 = a3;
	}	
	
	public String getRemetente() {
		return remetente;
	}
	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public String getCorpoEmail() {
		return corpoEmail;
	}
	public void setCorpoEmail(String corpoEmail) {
		this.corpoEmail = corpoEmail;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Anexo getA1() {
		return A1;
	}
	public void setA1(Anexo a1) {
		if (a1.equals(A2) || a1.equals(A3)) {
			System.out.println ("Anexo 1 já consta no 2 ou 3");
		}
		else {
			A1 = a1;
		}
	}
	
	public Anexo getA2() {
		return A2;
	}
	public void setA2(Anexo a2) {
		if (a2.equals(A1) || a2.equals(A3)) {
			System.out.println ("Anexo 2 já consta no 1 ou 3");
		}
		else {
		A2 = a2;
		}
	}
	public Anexo getA3() {
		return A3;
	}
	public void setA3(Anexo a3) {
		if (a3.equals(A1) || a3.equals(A2)) {
			System.out.println ("Anexo 3 já consta no 1 ou 2");
		}
		else {
			A3 = a3;			
		}
	}
	
}