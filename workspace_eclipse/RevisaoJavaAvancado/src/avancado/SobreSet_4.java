package avancado;

import java.util.Set;
import java.util.HashSet;

public class SobreSet_4 {
	public static void main(String[] args) {
		Set<Animal> setDeAnimal = new HashSet<>();
		
		setDeAnimal.add(new Animal(1L, "Coelho"));
		setDeAnimal.add(new Animal(2L, "Papagaio"));
		setDeAnimal.add(new Animal(3L, "Piriquito"));
		setDeAnimal.add(new Animal(4L, "Avestruz"));

		setDeAnimal.add(new Animal(1L, "Coelho"));
		
		setDeAnimal.forEach(System.out::println);
		
		
	}
}
/*
Anotações:


*/