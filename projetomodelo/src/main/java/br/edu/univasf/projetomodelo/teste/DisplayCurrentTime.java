package main.java.br.edu.univasf.projetomodelo.teste;

public class DisplayCurrentTime {
	public static void main (String [] args) {
		long hora, minuto, segundo, horaTotal, minutoTotal, segundoTotal;
		long currentTime = System.currentTimeMillis();
		
		segundoTotal = currentTime / 1000;
		segundo = segundoTotal % 60;
		minutoTotal = segundoTotal / 60;
		minuto = minutoTotal % 60;
		horaTotal = minutoTotal / 24;
		hora = horaTotal % 24 + 2;
		
		System.out.println ("Tempo corrente: " + hora + ":" + minuto + ":" + segundo);
	}
}