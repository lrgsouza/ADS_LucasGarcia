	package singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import builder.pizzaria.Pizza;
import builder.pizzaria.PizzaBuilder;

class PizzaBuilderTest {

	@Test
	void dadoIngredientesETamanhoCorreto_quandoGetPizza_EntaoPizzafeita() {
		Pizza pizza = new PizzaBuilder()
				.setSize(1)
				.addCheese()
				.addPepperoni()
				.getPizza();
		//assertions
		assertNotNull(pizza);
		assertNotNull(pizza.getSize());
		assertTrue(pizza.getFlagCheese());
		assertTrue(pizza.getFlagPepperoni());
		
		
		}
	@Test
	void dadoTamanhoerrado_quandoGetPizza_EntaoPizzaNaoFeita() {
		try {
		@SuppressWarnings("unused")
		Pizza pizza = new PizzaBuilder()
				.setSize(4)
				.addCheese()
				.addPepperoni()
				.getPizza();
				fail();
		}catch (Exception e) {
			// TODO: handle exception
		}

		
		}
	@Test
	void dadoIngredientesErrados_quandoGetPizza_EntaoPizzaNaoFeita() {
		try {
		@SuppressWarnings("unused")
		Pizza pizza = new PizzaBuilder()
				.setSize(1)
				.getPizza();
				fail();
		}catch (Exception e) {
			// TODO: handle exception
		}

		
		}	
	
}
