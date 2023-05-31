package builder.pizzaria;


public class PizzaBuilder {
	
	private Pizza pizza;
	
	public PizzaBuilder() {
		this.pizza = new Pizza();
	}
	
	public PizzaBuilder addCheese() {
		pizza.setFlagCheese(true);
		return this;
	}
	public PizzaBuilder addPepperoni() {
		pizza.setFlagPepperoni(true);
		return this;
	}
	public PizzaBuilder setSize(Integer size) {
		pizza.setSize(size);
		return this;
	}	
	
	
	public Pizza getPizza() {
		validaSize();
		validateIngredients();
		return pizza;
		
	}
	public void validaSize() {
		if(pizza.getSize() == 0 || pizza.getSize()> 3 ) {
			throw new IllegalStateException("Erro no tamanho");
		}
	}
	public void validateIngredients() {
		if(!pizza.getFlagCheese() && !pizza.getFlagPepperoni()) {
			throw new IllegalStateException("Erro nos ingredientes");
		}
	}

}
