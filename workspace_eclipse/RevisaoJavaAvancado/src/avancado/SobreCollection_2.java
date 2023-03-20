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
		
	}

	private static Collection<String> buildCollectionImplementation() {
		return new ArrayList<String>();

	}
	
}