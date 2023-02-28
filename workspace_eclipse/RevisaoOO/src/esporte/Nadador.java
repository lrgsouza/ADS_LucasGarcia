package esporte;

public class Nadador extends Atleta {

	public Nadador(String nome, Integer idade, Integer peso, Boolean aposentado) {
		super(nome, idade, peso, aposentado);
		// TODO Auto-generated constructor stub
	}

	void nadar() {
		System.out.println("Nadador nadando");
	}
	
}
