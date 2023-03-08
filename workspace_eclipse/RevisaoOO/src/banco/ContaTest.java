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
	
	@Test
	void testaPolimorfismo() {
		
		//flag para definir tipo de conta default
		Boolean defaultCC = false;
		
		Conta conta = null;
		if(defaultCC) {
			conta = new ContaCorrente();
		}else {
			conta = new ContaPoupanca();
		}
		
		//depositando 1000 reais e contabilizando
		conta.depositar(1000.00);
		conta.rentabilizar();
		
		System.out.println(conta.getClass().getName());
		System.out.println("Saldo: "+conta.saldo);
		//testando override de toString
		System.out.println(conta);
		
	}


}
