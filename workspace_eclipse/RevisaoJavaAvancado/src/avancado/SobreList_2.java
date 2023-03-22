package avancado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SobreList_2 {
	
	public static void main(String[] args) {
		List<Animal> listaDeAnimais = new ArrayList<>();
		listaDeAnimais.add(new Animal(1L, "Tartaruga"));
		listaDeAnimais.add(new Animal(2L, "Coelho"));
		listaDeAnimais.add(new Animal(3L, "Cachorro"));
		listaDeAnimais.add(new Animal(4L, "Gato"));
		listaDeAnimais.add(new Animal(5L, "Girafa"));
		listaDeAnimais.add(new Animal(6L, "Vaca"));
		System.out.println(listaDeAnimais);
		for (Animal animal : listaDeAnimais) {
			System.out.println(animal.getNome());
		}
		System.out.println("==== Ordenando =====");
		Collections.sort(listaDeAnimais);
	}

}
