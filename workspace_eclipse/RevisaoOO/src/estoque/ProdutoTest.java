package estoque;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class ProdutoTest {

	
	
	@Test
	void testarProduto() {
		
		Produto produto = new Produto();
		
		//atribuindo propriedades
		produto.setDescricao("Banana");
		produto.setValorCompra(5.99);
		produto.setDataValidade(LocalDate.of(2023, 01, 31));
		
		System.out.println("dados do produto:");
		System.out.println(produto.getDescricao());
		System.out.println("Preço R$"+produto.getValorCompra());
		System.out.println("Validade: "+produto.getDataValidade());
	}
}
