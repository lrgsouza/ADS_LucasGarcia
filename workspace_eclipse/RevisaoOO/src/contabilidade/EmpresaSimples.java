package contabilidade;

public class EmpresaSimples implements Tributavel {
	Double faturamentoMensal;

	public EmpresaSimples(Double faturamentoMensal) {
		super();
		this.faturamentoMensal = faturamentoMensal;
	}

	@Override
	public Double getValorIR() {
		return this.faturamentoMensal*0.15;
	}

	@Override
	public Double getValorISS() {
		return this.faturamentoMensal*0.08;
	}
	
	
}
