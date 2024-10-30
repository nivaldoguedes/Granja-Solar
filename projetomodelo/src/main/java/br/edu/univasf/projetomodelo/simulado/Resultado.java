package main.java.br.edu.univasf.projetomodelo.simulado;

public class Resultado {
	private String time1, time2;
	private int golsTime1, golsTime2;
		
	public Resultado(String time1, String time2, int golsTime1, int golsTime2) {
		super();
		this.time1 = time1;
		this.time2 = time2;
		this.golsTime1 = golsTime1;
		this.golsTime2 = golsTime2;
	}
	
	public void vencedor() {
		if (golsTime1 > golsTime2) {
			System.out.println (time1 + "vencedor da partida!");
		}
		else if (golsTime2 > golsTime1) {
			System.out.println (time2 + "vencedor da partida!");
		}
		else {
			System.out.println ("");
		}
	}
	
	public int gols(String s) {
		int resposta=0;
		if (s == time1) {
			resposta = golsTime1;
		}
		else if (s == time2) {
			resposta = golsTime2;
		}
		else {
			System.out.println ("Time inválido.");
		}
		return resposta;
	}

	public String getTime1() {
		return time1;
	}

	public void setTime1(String time1) {
		this.time1 = time1;
	}

	public String getTime2() {
		return time2;
	}

	public void setTime2(String time2) {
		this.time2 = time2;
	}

	public int getGolsTime1() {
		return golsTime1;
	}

	public void setGolsTime1(int golsTime1) {
		this.golsTime1 = golsTime1;
	}

	public int getGolsTime2() {
		return golsTime2;
	}

	public void setGolsTime2(int golsTime2) {
		this.golsTime2 = golsTime2;
	}
	
}