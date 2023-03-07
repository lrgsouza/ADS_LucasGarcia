package banco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTest {
	
	@Test
	void testarContaCorrente() {
		Double saldoEsperado = 101.0;
		
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(100.0);
		cc.rentabilizar();

		assertEquals(saldoEsperado, cc.saldo);
		
	}
	
	@Test
	void testarContaPoupanca() {
		
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.depositar(100.0);
		Double saldoEsperado = cp.saldo*1.02;
		cp.rentabilizar();

		assertEquals(saldoEsperado, cp.saldo);
		
	}


}
