package strategy.frete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraFreteTest {

	@Test
	void deveCalcularFreteParaDHL() {
		Double pesoEmKg = 50.00;
		Fretavel calculadora = new ServicoFreteDHL();
		Double valor = calculadora.calcularValor(pesoEmKg);
		assertEquals(90.00, valor);

	}
	@Test
	void deveCalcularFreteParaSedex() {
		Double pesoEmKg = 50.00;
		Fretavel calculadora = new ServicoFreteSedex();
		Double valor = calculadora.calcularValor(pesoEmKg);
		assertEquals(90.00, valor);
	}
	@Test
	void deveCalcularFreteParaJadLog() {
		Double pesoEmKg = 50.00;
		Fretavel calculadora = new ServicoFreteJadLog();
		Double valor = calculadora.calcularValor(pesoEmKg);
		assertEquals(150.00, valor);
	}
	
	@Test
	void deveCalcularFreteParaFedex() {
		Double pesoEmKg = 8000.00;
		Fretavel calculadora = new ServicoFreteFedex();
		calculadora.calcularValor(pesoEmKg);
		Double valor = calculadora.calcularValor(pesoEmKg);
		assertEquals(75.00, valor);
																					
	}
}
