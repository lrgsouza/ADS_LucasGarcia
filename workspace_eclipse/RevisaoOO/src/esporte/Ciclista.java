package esporte;

public class Ciclista extends Atleta{

	public Ciclista(String nome, Integer idade, Integer peso, Boolean aposentado) {
		super(nome, idade, peso, aposentado);
		// TODO Auto-generated constructor stub
	}
	void pedalar() {
		System.out.println("Ciclista pedalando");
	}

}
