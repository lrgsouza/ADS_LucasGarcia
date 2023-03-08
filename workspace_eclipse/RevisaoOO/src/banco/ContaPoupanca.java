package banco;

public class ContaPoupanca extends Conta {

	@Override
	void rentabilizar() {
		this.saldo += this.saldo*0.02;
	}

}
