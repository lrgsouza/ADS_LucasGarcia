package avancado;

import java.util.Collection;
import java.util.TreeSet;

public class SobreCollection_1 {
	
	
	public static void main(String[] args) {
		
		Collection<String> colecao = buildCollectionImplementation();
		colecao.add("Gato");
		colecao.add("Cachorro");
		colecao.add("Leão");
		colecao.add("Pantera");
		colecao.add("Avestruz");
		
		System.out.println(colecao);
		
		System.out.println("==================================");
		
	}

	private static Collection<String> buildCollectionImplementation() {
//		return new ArrayList<String>();
//		return new HashSet<String>();
		return new TreeSet<String>();

	}
	
}