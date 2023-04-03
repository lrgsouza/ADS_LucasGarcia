package avancado;

import java.util.ArrayList;
import java.util.List;

public class SobreStreams {
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto(1L, "Cadeira", 100.0));
		produtos.add(new Produto(2L, "Cama", 400.0));
		produtos.add(new Produto(3L, "Mesa", 200.0));
		produtos.add(new Produto(4L, "Sofá", 500.0));
		produtos.add(new Produto(5L, "Cadeira", 150.0));
		
		//filter
		List<Produto> produtosFiltrados = produtos.stream()
				.filter(p -> p.getPreco() > 300.0)
				.toList();
		
		produtosFiltrados.forEach(System.out::println);
		
		//map
		List<String> descricoes = produtos.stream()
				.map(p -> p.getDescricao())
				.toList();
		
		descricoes.forEach(System.out::println);
		
		//map reduce
		Double precototal = produtos.stream()
				.map(p->p.getPreco())
				.reduce(0.0, Double::sum);
		
		System.out.println(precototal);
		
		//desafio calcular o preço total de produtos cujo preço é abaixo de 300
		//utilizando stream, filtramos, pegamos os resultados e somamos com o reduce.
		Double somadesafio = produtos.stream()
				.filter(p->p.getPreco()<300.0)
				.map(p->p.getPreco())
				.reduce(0.0,Double::sum);
		System.out.println(somadesafio);
		
	}
}
