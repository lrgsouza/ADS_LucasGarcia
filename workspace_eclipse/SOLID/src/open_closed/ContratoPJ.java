package open_closed;

public class ContratoPJ implements Remuneravel {
	public Double valorMensal;
	
	public ContratoPJ(Double valorMensal) {
		super();
		this.valorMensal = valorMensal;
	}
	

	public Double getValorMensal() {
		return valorMensal;
	}


	@Override
	public Double getRemuneracao() {
		return this.getValorMensal();
	}

}
