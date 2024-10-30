package main.java.br.edu.univasf.projetomodelo.teste;
import java.util.Date;
import main.java.br.edu.univasf.projetomodelo.escola.*;
import main.java.br.edu.univasf.projetomodelo.model.*;
import main.java.br.edu.univasf.projetomodelo.fazenda.*;

public class TesteMain {
	/*public static void main (String[] args) {
		// Teste da Pessoa
		/*java.util.Date data = new Date();
		System.out.println(data.toString());
		
		Pessoa pessoa1 = new Pessoa ("Nome", "0912031", data, 10, 'm', new Endereco(null, null, null, 0));
		pessoa1.setNome("Aluno de Sobrenome");
		pessoa1.setCPF("123.456.789-00");
		pessoa1.setGenero('m');
		pessoa1.setIdade(10);
		System.out.println (pessoa1.toString());*/
		
		// Teste da Fazenda
		Animal a1 = new Animal();
		Animal g1 = new Gato();
		Animal c1 = new Cachorro();
		System.out.println(g1.emitirSom());
		System.out.println(c1.emitirSom());
		
		Pessoa r1 = new Rica(5000);
		Pessoa p1 = new Pobre();
		Pessoa m1 = new Miseravel();
		
	}*/
}