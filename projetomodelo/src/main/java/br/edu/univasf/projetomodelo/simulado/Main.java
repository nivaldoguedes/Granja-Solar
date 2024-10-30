package main.java.br.edu.univasf.projetomodelo.simulado;

public class Main {
	public static void main (String[] args) {
		// Teste do EMail
		EMail e1 = new EMail("","","","", new Anexo(""), new Anexo(""), new Anexo(""));
		e1.setA1(new Anexo ("Anexo 1 do doc"));
		e1.setA2(new Anexo ("Anexo 2 do doc"));
		e1.setA3(new Anexo ("Anexo 2 do doc"));
		e1.setRemetente("Pessoa que envia");
		e1.setDestinatario("Pessoa que recebe");
		e1.setCorpoEmail("Email enviado para teste");
		e1.setData("09/09/2024");
		e1.getRemetente();
		e1.getDestinatario();
		e1.getCorpoEmail();
		e1.getData();
		e1.getA1();
		e1.getA2();
		e1.getA3();
		
		// Teste do Resultado
		Resultado r1 = new Resultado ("","",0,0);
		r1.setTime1("Equipários");
		r1.setTime2("Timéticos");
		r1.setGolsTime1(4);
		r1.setGolsTime2(2);
		r1.gols("Equipários");
		r1.gols("Timéticos");
		r1.gols("Varzea");
		r1.vencedor();
		r1.setGolsTime1(2);
		r1.vencedor();
		
		// Teste da Banda
		Banda b1 = new Banda ("","",0);
		b1.setNome("Cantores de chuveiro");
		b1.setNumeroIntegrantes(5);
		b1.setEstilo("Rock'n roll");
		b1.getNome();
		b1.getEstilo();
		b1.getNumeroIntegrantes();
		
		// Teste do CD
		CD c1 = new CD ("","",0);
		c1.setBandaAutora("Banda da rua");
		c1.setTitulo("Primeiro álbum");
		c1.setAno(2024);
		c1.getBandaAutora();
		c1.getTitulo();
		c1.getAno();
	}
}