package esporte;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

	@Test
	void testarNadador() {
		Nadador nadador = new Nadador("Lucas", 30, 80, false);
		
		assertEquals(nadador.idade, 30);
		nadador.envelhecer();
		assertEquals(nadador.idade,31);
	}
	
	@Test
	void testarCiclista() {
		Ciclista ciclista = new Ciclista("Lucas", 44, 85, false);
		assertFalse(ciclista.aposentado);
		System.out.println("Esta aposenntado?");
		
		if (ciclista.aposentado) {
			System.out.println("Sim");
		} else {
			System.out.println("Não");
		}
		ciclista.pedalar();
		ciclista.envelhecer();
		ciclista.aposentar();
		assertTrue(ciclista.aposentado);
		
		System.out.println("Agora esta aposentado?");
		System.out.println(ciclista.aposentado ? "Sim" : "Não");
		
		
	}
}

		