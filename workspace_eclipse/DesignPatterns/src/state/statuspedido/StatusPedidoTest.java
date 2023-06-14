package state.statuspedido;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StatusPedidoTest {

	@Test
	void dadoStatusINICIAL_quandoAvancar_entaoStatusAtualSeraPAGO() {
		StatusPedido status = StatusPedido.INICIAL;
		status = status.avancar();
		assertEquals(status, StatusPedido.PAGO);
	}

}
