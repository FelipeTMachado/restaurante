package sistema_restaurante.sistema.visual;

import sistema_restaurante.sistema.configuracao.Visual;

public class VisualCaixa {
	// CONSTRUTOR
	public VisualCaixa() {
		// TODO Auto-generated constructor stub
	}

	public void menuPrincipal() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "CAIXA");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("1 - VALOR ARRECADO COM PEDIDOS");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("2 - VALOR ARRECADO POR CLIENTE");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("3 - VALOR TOTAL RECEBIDO");
		
		Visual.getInstance().visualizarEspacoEmBranco();
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("9 - VOLTAR");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("0 - SAIR");
		Visual.getInstance().visualizarLinha();
	}

	public void inicioValorArrecadado(String titulo) {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", titulo);
	}
	
	public void finalValorArrecadadoComPedidos(Double valorTotal) {
		Visual.getInstance().visualizarTextoAlinhadoEsquerda(String.format("VALOR TOTAL DOS PEDIDOS: . . . . R$ %.2f", valorTotal));
		Visual.getInstance().visualizarLinha();
	}
	
	public void finalValorArrecadadoComCliente(Double valorTotal) {
		Visual.getInstance().visualizarTextoAlinhadoEsquerda(String.format("VALOR TOTAL DOS CLIENTES: . . . R$ %.2f", valorTotal));
		Visual.getInstance().visualizarLinha();
	}
	
	public void valorTotalArrecadado(Double valorTotal) {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "VALORES");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda(String.format("VALOR TOTAL RECEBIDO: . . . . . . . . . . . R$ %.2f", valorTotal));
		Visual.getInstance().visualizarLinha();
	}
	
	
	public void mostrarPedidoPorColuna(Integer codigo, String nomeCliente, Double valor) {
		Visual.getInstance().visualizarTextoAlinhadoEsquerda(String.format("CODIGO:  . . . . . . . . . . . . %d", codigo));
		Visual.getInstance().visualizarTextoAlinhadoEsquerda(String.format("CLIENTE: . . . . . . . . . . . . %s", nomeCliente));
		Visual.getInstance().visualizarTextoAlinhadoEsquerda(String.format("VALOR: . . . . . . . . . . . . . R$ %.2f ", valor));
		Visual.getInstance().visualizarLinha();
	}

	public void mostrarClienteEValor(String nome, String cpf, Double valor) {
		Visual.getInstance().visualizarTextoAlinhadoEsquerda(String.format("CPF CLIENTE:  . . . . . . . . . %s", cpf));
		Visual.getInstance().visualizarTextoAlinhadoEsquerda(String.format("NOME CLIENTE: . . . . . . . . . %s", nome));
		Visual.getInstance().visualizarTextoAlinhadoEsquerda(String.format("VALOR:  . . . . . . . . . . . . R$ %.2f", valor));
		Visual.getInstance().visualizarLinha();
	}
}
