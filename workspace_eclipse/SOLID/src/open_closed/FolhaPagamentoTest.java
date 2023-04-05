package open_closed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FolhaPagamentoTest {

	@Test
	void test() {
      ContratoCLT contratoCLT = new ContratoCLT(1000.0);
      Estagio estagio = new Estagio(500.0);
      ContratoPJ contratoPJ = new ContratoPJ(5000.0);

      FolhaPagamento folhaPagamento = new FolhaPagamento();
      folhaPagamento.calcular( contratoCLT );
      folhaPagamento.calcular( estagio );
      folhaPagamento.calcular( contratoPJ );

      Double valorEsperado = 6500.0;
      Double valorAtual = folhaPagamento.getTotalFolha();
      assertEquals(valorEsperado, valorAtual); 

	}

}
