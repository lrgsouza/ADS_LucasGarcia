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
		
		System.out.println("Empresa MEI:");
		EmpresaMEI mei = new EmpresaMEI(90000.00);
		Double expectIR = mei.faturamentoMensal * TAXA_IR_MEI;
		System.out.println("expect:"+expectIR);
		System.out.println("get:"+mei.getValorIR());
		assertEquals(expectIR, mei.getValorIR());
		
		
		Double expectISS = mei.faturamentoMensal * TAXA_ISS_MEI;
		System.out.println("expect:"+expectISS);
		System.out.println("get:"+mei.getValorISS());
		assertEquals(expectISS, mei.getValorISS());		
		
	}
	
	@Test
	void testEmpresaSimples() {
		
		System.out.println("Empresa SIMPLES:");
		EmpresaSimples simples = new EmpresaSimples(180000.00);
		Double expectIR = simples.faturamentoMensal * TAXA_IR_SIMPLES;
		System.out.println("expect:"+expectIR);
		System.out.println("get:"+simples.getValorIR());
		assertEquals(expectIR, simples.getValorIR());
		
		Double expectISS = simples.faturamentoMensal * TAXA_ISS_SIMPLES;
		System.out.println("expect:"+expectISS);
		System.out.println("get:"+simples.getValorISS());
		assertEquals(expectISS, simples.getValorISS());				
	}
}
