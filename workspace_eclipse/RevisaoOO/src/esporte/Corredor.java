package esporte;

public class Corredor extends Atleta{

	public Corredor(String nome, Integer idade, Integer peso, Boolean aposentado) {
		super(nome, idade, peso, aposentado);
		// TODO Auto-generated constructor stub
	}
	void correr() {
		System.out.println("Corredor correndo");
	}

}
