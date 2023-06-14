package state.artigo;

public class EstadoAprovado implements Estado {
	@SuppressWarnings("unused")
	private Artigo artigo;

	public EstadoAprovado(Artigo artigo) {
		this.artigo = artigo;
	}

	@Override
	public void publicar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reprovar() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
