package esporte;

import org.junit.jupiter.api.Test;

class AtletaTest {

	@Test
	void testarConstrutor() {
		Pessoa pessoa = new Pessoa("Edson", 40);
		System.out.println(pessoa.nome);
		System.out.println(pessoa.idade);
		
		Atleta atleta = new Atleta("Edson", 40, 90, false);
		System.out.println(atleta.nome);
		System.out.println(atleta.idade);
		System.out.println(atleta.peso);
		System.out.println(atleta.aposentado);
		
		Corredor corredor = new Corredor("João", 25, 75, false);
		corredor.aquecer();
		corredor.correr();
		
		Nadador nadador = new Nadador("Gustavo", 35, 90, false);
		
		nadador.nadar();
		nadador.envelhecer();
		System.out.println("Idade: "+nadador.idade);
		nadador.aposentar();
		System.out.println("Aposentado: "+nadador.aposentado);
		
		
		
		
		
		
		
	}

}
