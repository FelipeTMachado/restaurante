package sistema_restaurante.sistema.tipo;

public enum EStatusPedido {
	CADASTRANDO,
	EMPRODUCAO,
	ENTREGUE,
	PENDENTE;
	
	@Override
	public String toString() {
		switch (this.ordinal()) {
		case 0: {
			return "Cadastrando";
		}
		case 1: {
			return "Em Producao";
		}
		case 2: {
			return "Entregue";
		}
		case 3: {
			return "Pendente";
		}
		default:
			return "Sem Status";
		}
	}
}