package banco;

public class ContaCorrente extends Conta {

	@Override
	void rentabilizar() {
		this.saldo += this.saldo*0.01;
	}
	
	
	
	
}
