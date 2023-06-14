package state.statuspedido;

public enum StatusPedido {
	INICIAL {
		@Override
		public StatusPedido avancar() {
			// TODO Auto-generated method stub
			return PAGO;
		}

		@Override
		public StatusPedido cancelar() {
			// TODO Auto-generated method stub
			return CANCELADO;
		}
	},
	PAGO {
		@Override
		public StatusPedido avancar() {
			// TODO Auto-generated method stub
			return ENTREGUE;
		}

		@Override
		public StatusPedido cancelar() {
			// TODO Auto-generated method stub
			return CANCELADO;
		}
	},
	ENTREGUE {
		@Override
		public StatusPedido avancar() {
			// TODO Auto-generated method stub
			return FINALIZADO;
		}

		@Override
		public StatusPedido cancelar() {
			// TODO Auto-generated method stub
			return CANCELADO;
		}
	},
	FINALIZADO {
		@Override
		public StatusPedido avancar() {
			// TODO Auto-generated method stub
			return FINALIZADO;
		}

		@Override
		public StatusPedido cancelar() {
			// TODO Auto-generated method stub
			return FINALIZADO;
		}
	},
	CANCELADO {
		@Override
		public StatusPedido avancar() {
			// TODO Auto-generated method stub
			return CANCELADO;
		}

		@Override
		public StatusPedido cancelar() {
			// TODO Auto-generated method stub
			return CANCELADO;
		}
	};
	
	
	
	abstract public StatusPedido avancar();
	abstract public StatusPedido cancelar();

}
