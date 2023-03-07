package contabilidade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContabilidadeTest {

	static final Double TAXA_IR_MEI = 0.275;
	static final Double TAXA_IR_SIMPLES = 0.15;
	static final Double TAXA_ISS_MEI = 0.0;
	static final Double TAXA_ISS_SIMPLES = 0.08;
	
	@Test
	void testEmpresaMEI() {
		EmpresaMEI mei = new EmpresaMEI(90000.00);
		Double expectIR = mei.faturamentoMensal * TAXA_IR_MEI;
		assertEquals(expectIR, mei.getValorIR());
		Double expectISS = mei.faturamentoMensal * TAXA_ISS_MEI;
		assertEquals(expectISS, mei.getValorISS());		
		
	}
	
	@Test
	void testEmpresaSimples() {
		EmpresaSimples simples = new EmpresaSimples(180000.00);
		Double expectIR = simples.faturamentoMensal * TAXA_IR_SIMPLES;
		assertEquals(expectIR, simples.getValorIR());
		Double expectISS = simples.faturamentoMensal * TAXA_ISS_SIMPLES;
		assertEquals(expectISS, simples.getValorISS());				
	}
}
