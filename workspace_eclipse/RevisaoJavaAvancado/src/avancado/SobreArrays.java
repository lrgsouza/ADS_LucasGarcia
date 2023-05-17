package avancado;

public class SobreArrays {
	
	
	public static void main(String[] args) {
		
		Animal[] arrayDeAnimais = new Animal[4];
		
		arrayDeAnimais[0] = new Animal(1L, "Tartaruga");
		arrayDeAnimais[1] = new Animal(2L, "Coelho");
		arrayDeAnimais[2] = new Animal(3L,"Cachorro");
		arrayDeAnimais[3] = new Animal(4L, "Gato");
		System.out.println("==================================");
		
		System.out.println("Array de animais: ");
		for (Animal animal : arrayDeAnimais) {
			System.out.println(animal.getNome());
		}
		
		System.out.println("==================================");
		

}
}
