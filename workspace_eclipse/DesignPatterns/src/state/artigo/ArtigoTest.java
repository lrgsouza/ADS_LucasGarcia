package state.artigo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArtigoTest {

	@Test
	void deveArtigoTransitarDeRascunhoAteAprovado() {
		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();
		Artigo artigo = new Artigo();
		
		// rascunho > revisando
		gerenteDeSeguranca.setUsuarioCorrente("AUTOR");
		artigo.publicar();
		assertTrue(artigo.getEstado() instanceof EstadoRevisando);
		
		
		// Revisando > Aprovado
		gerenteDeSeguranca.setUsuarioCorrente("MODERADOR");
		artigo.publicar();
		assertTrue(artigo.getEstado() instanceof EstadoAprovado);
		
		//imprime resultado
		artigo.getLogHistorico()
		.forEach(System.out::println);		
		
	
	}

}
