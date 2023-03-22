package avancado;
import java.util.ArrayList;
import java.util.Collection;


public class SobreCollection_2 {
	
	
	public static void main(String[] args) {
		
		Collection<String> engenhariasAtuais = buildCollectionImplementation();
		engenhariasAtuais.add("Telecomunicações");
		engenhariasAtuais.add("Biomédica");
		engenhariasAtuais.add("Computação");
		engenhariasAtuais.add("Software");
		engenhariasAtuais.add("Produção");
		
		System.out.println("Engenharias Atuais: "+engenhariasAtuais);
		
		System.out.println("==================================");
		
		Collection<String> engenhariasFuturas = buildCollectionImplementation();
		engenhariasFuturas.add("Mecânica");
		engenhariasFuturas.add("Mecatrônica");
		
		Collection<String> todas = buildCollectionImplementation();
		todas.addAll(engenhariasAtuais);
		todas.addAll(engenhariasFuturas);
		
		System.out.println("Todas as engenharias: "+todas);
		
		System.out.println("==================================");
		
		System.out.println("Entendendo isEmpty() e size().");
		System.out.println("==================================");
		Collection<String> engenharias = new ArrayList<>(todas);
		System.out.println("Engenharias vazias? "+ engenharias.isEmpty());
		System.out.println("Qtos elementos engenharias tem? " + engenharias.size());
		System.out.println("==================================");
		printCollectionStatus(engenharias);
		System.out.println("==================================");
		System.out.println("Entendento clear()");
		System.out.println("...invocando clear");
		engenharias.clear();
		printCollectionStatus(engenharias);
		
	}

	private static Collection<String> buildCollectionImplementation() {
		return new ArrayList<String>();

	}
	
	private static void printCollectionStatus(Collection<String> engenharias) {
		System.out.print("A coleção ");
		if (engenharias.isEmpty()) {
			System.out.println("esta vazia.");
		}else {
			System.out.println("tem elementos.");
		}
	}
	
}