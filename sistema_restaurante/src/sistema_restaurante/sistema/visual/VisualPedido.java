package sistema_restaurante.sistema.visual;

import sistema_restaurante.sistema.configuracao.Entrada;
import sistema_restaurante.sistema.configuracao.Visual;
import sistema_restaurante.sistema.modelo.Mesa;
import sistema_restaurante.sistema.modelo.Pessoa;
import sistema_restaurante.sistema.tipo.EStatusPedido;

public class VisualPedido {
	// ATRIBUTOS
	private Integer campoCodigo;
	private EStatusPedido campoStatus;
	private Pessoa campoGarcom;
	private Pessoa campoCliente;
	private Mesa camposMesa;
	
	private Integer campoCodigoProduto;
	private String  campoCpfGarcom;
	private String  campoNumeroMesa;
	private String  campoCpfCliente;
	
	
	
	// METODOS FUNCIONAIS
	public void menuPrincipal() {
		Visual.getInstance().visualizarCabecalho("SISTENA RESTAURANTE", "GERENCIAMENTO DE PEDIDOS");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("1 - NOVO");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("2 - BUSCAR");
		
		Visual.getInstance().visualizarEspacoEmBranco();
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("9 - VOLTAR");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("0 - SAIR");
		Visual.getInstance().visualizarLinha();
	}
	
	public void inicioPedido(Integer numero) {
		Visual.getInstance().visualizarCabecalho("SISTENA RESTAURANTE", String.format("PEDIDO: %d STATUS: PENDENTE", numero));
	
		campoCpfGarcom = Entrada.getInstance().retornaDado("DIGITE O CPF DO GARCOM: ");
		campoCpfCliente = Entrada.getInstance().retornaDado("DIGITE O CPF DO CLIENTE: ");
		campoNumeroMesa = Entrada.getInstance().retornaDado("DIGITE O NUMERO DA MESA: ");
		
		Visual.getInstance().visualizarLinha();
	}
	
	public void mensagemPessoaNaoEncontrada(String tipo) {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "ATENCAO");
		Visual.getInstance().visualizarTextoAlinhadoCentro(tipo + " NAO ENCONTRADO!");
		Visual.getInstance().visualizarLinha();
		Entrada.getInstance().retornaDado("PRESSIONE ENTER PARA CONTINUAR ...");
	}
	
	public void mensagemMesaNaoEncontrada() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "ATENCAO");
		Visual.getInstance().visualizarTextoAlinhadoCentro("MESA NAO ENCONTRADA!");
		Visual.getInstance().visualizarTextoAlinhadoCentro("TENTE UM NUMERO DIFERENTE DE MESA");
		Visual.getInstance().visualizarEspacoEmBranco();
		Visual.getInstance().visualizarLinha();
		Entrada.getInstance().retornaDado("PRESSIONE ENTER PARA CONTINUAR ...");
	}

	public void novoCadastrado(Integer numero) {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "PEDIDO");
		Visual.getInstance().visualizarTextoAlinhadoCentro(String.format("CODIGO: %d STATUS: CADASTRADO", numero));
		Visual.getInstance().visualizarEspacoEmBranco();
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("1 - ADICIONAR PRODUTO");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("2 - VER PRODUTOS");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("3 - EXCLUIR PRODUTOS");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("4 - ENVIAR PARA PRODUCAO");
		
		Visual.getInstance().visualizarEspacoEmBranco();
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("9 - VOLTAR MENU PEDIDOS");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("0 - SAIR");
		Visual.getInstance().visualizarLinha();
	}
	
	public void menuBuscaPedido() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "MENU BUSCA PEDIDO");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("1 - BUSCA POR CODIGO");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("2 - BUSCAR TODOS");
		Visual.getInstance().visualizarEspacoEmBranco();
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("9 - VOLTAR");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("0 - SAIR");
		Visual.getInstance().visualizarLinha();
	}

	public void inicioListaPedidos() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "LISTA DE PEDIDOS");
		Visual.getInstance().visualizarLinha();
	}
	
	public void mostrarPedidoEmColuna() {
		Visual.getInstance().visualizarTextoAlinhadoEsquerda(String.format("CODIGO: . . . . . . %d", campoCodigo));
		Visual.getInstance().visualizarTextoAlinhadoEsquerda(String.format("NOME CLIENTE: . . . %s", campoCliente.getNome()));
		Visual.getInstance().visualizarTextoAlinhadoEsquerda(String.format("GARCOM: . . . . . . %s", campoGarcom.getNome()));
		Visual.getInstance().visualizarTextoAlinhadoEsquerda(String.format("MESA: . . . . . . . %s", camposMesa.getNumero()));
		Visual.getInstance().visualizarTextoAlinhadoEsquerda(String.format("STATUS: . . . . . . %s", campoStatus.toString()));
		Visual.getInstance().visualizarLinha();
	}
	
	public void menuBuscarPedidoPorCodigo() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "BUSCAR PEDIDO POR CODIGO");
		
		try {
			campoCodigo = Integer.parseInt(Entrada.getInstance().retornaDado("DIGITE O CODIGO DO PEDIDO: "));
		} catch (Exception e) {
			campoCodigo = 0;
		}
		
		Visual.getInstance().visualizarLinha();
	}
	
	public void mensagemPedidoNaoEncontrado() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "ATENCAO");
		Visual.getInstance().visualizarTextoAlinhadoCentro("PEDIDO NAO ENCONTRADO!");
		Visual.getInstance().visualizarLinha();
		Entrada.getInstance().retornaDado("PRESSIONE ENTER PARA CONTINUAR ...");
	}
	
	public void mensagemProdutoAdicionado() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "SUCESSO");
		Visual.getInstance().visualizarTextoAlinhadoCentro("PRODUTO ADICIONADO AO PEDIDO!");
		Visual.getInstance().visualizarLinha();
		Entrada.getInstance().retornaDado("PRESSIONE ENTER PARA CONTINUAR ...");
	}
	
	public void excluirProdutoPedido() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "RETIRAR PRODUTO PEDIDO");
		
		try {
			campoCodigoProduto = Integer.parseInt(Entrada.getInstance().retornaDado("DIGITE O CODIGO DO PRODUTO A SER RETIRADO DO PEDIDO: "));
		} catch (Exception e) {
			campoCodigoProduto = 0;
		}
		Visual.getInstance().visualizarLinha();
	}
	
	public void mensagemProdutoNaoEncontrado() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "ATENCAO");
		Visual.getInstance().visualizarTextoAlinhadoCentro("PRODUTO NAO ENCONTRADO NO PEDIDO!");
		Visual.getInstance().visualizarLinha();
		Entrada.getInstance().retornaDado("PRESSIONE ENTER PARA CONTINUAR ...");
	}
	
	public void mensagemProdutoExcluido() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "SUCESSO");
		Visual.getInstance().visualizarTextoAlinhadoCentro("PRODUTO RETIRADO DO PEDIDO!");
		Visual.getInstance().visualizarLinha();
		Entrada.getInstance().retornaDado("PRESSIONE ENTER PARA CONTINUAR ...");
	}
	
	public void menuEmProducao(Integer codigo) {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "PEDIDO");
		Visual.getInstance().visualizarTextoAlinhadoCentro(String.format("CODIGO: %d STATUS: EMPRODUCAO", codigo));
		Visual.getInstance().visualizarEspacoEmBranco();
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("1 - VER PRODUTOS");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("2 - CANCELAR PEDIDO");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("3 - ENTREGAR");
		Visual.getInstance().visualizarEspacoEmBranco();
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("9 - VOLTAR");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("0 - SAIR");
		Visual.getInstance().visualizarLinha();
	}

	public void mensagemNaoHaProdutoNoPedido() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "ATENCAO");
		Visual.getInstance().visualizarTextoAlinhadoCentro("NAO HA PRODUTO CADASTRADO NO PEDIDO");
		Visual.getInstance().visualizarLinha();
		Entrada.getInstance().retornaDado("PRESSIONE ENTER PARA CONTINUAR ...");
	}
	
	public void mensagemPedidoCancelado() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "SUCESSO");
		Visual.getInstance().visualizarTextoAlinhadoCentro("PEDIDO CANCELADO COM SUCESSO !");
		Visual.getInstance().visualizarLinha();
		Entrada.getInstance().retornaDado("PRESSIONE ENTER PARA CONTINUAR ...");
	}
	
	public void mensagemPedidoNaoCancelado() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "ATENCAO");
		Visual.getInstance().visualizarTextoAlinhadoCentro("PEDIDO NAO FOI CANCELADO !");
		Visual.getInstance().visualizarLinha();
		Entrada.getInstance().retornaDado("PRESSIONE ENTER PARA CONTINUAR ...");
	}
	
	public void cancelarProduto() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "ATENCAO");
	}
	
	public void mensagemPedidoNaoEntregue() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "ATENCAO");
		Visual.getInstance().visualizarTextoAlinhadoCentro("NAO ENTREGOU O PEDIDO !");
		Visual.getInstance().visualizarLinha();
		Entrada.getInstance().retornaDado("PRESSIONE ENTER PARA CONTINUAR ...");
	}
	
	public void mensagemPedidoEntregue() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "SUCESSO");
		Visual.getInstance().visualizarTextoAlinhadoCentro("ENTREGOU PEDIDO COM SUCESSO !");
		Visual.getInstance().visualizarLinha();
		Entrada.getInstance().retornaDado("PRESSIONE ENTER PARA CONTINUAR ...");
	}
	
	public void pedidoTerminado() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAUNRANTE", "PRODUTO FINALIZADO E ENTREGUE");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("1 - VER PRODUTOS");
		
		Visual.getInstance().visualizarEspacoEmBranco();
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("9 - VOLTAR");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("0 - SAIR");
		Visual.getInstance().visualizarLinha();
	}
	
	
	// GETTERS AND SETTERS
	public Pessoa getCampoCliente() {
		return campoCliente;
	}
	public void setCampoCliente(Pessoa campoCliente) {
		this.campoCliente = campoCliente;
	}
	public EStatusPedido getCampoStatus() {
		return campoStatus;
	}
	public void setCampoStatus(EStatusPedido campoStatus) {
		this.campoStatus = campoStatus;
	}
	public Pessoa getCampoGarcom() {
		return campoGarcom;
	}
	public void setCampoGarcom(Pessoa campoGarcom) {
		this.campoGarcom = campoGarcom;
	}
	public Mesa getCamposMesa() {
		return camposMesa;
	}
	public void setCamposMesa(Mesa camposMesa) {
		this.camposMesa = camposMesa;
	}
	public String getCampoCpfGarcom() {
		return campoCpfGarcom;
	}
	public void setCampoCpfGarcom(String cpfGarcom) {
		this.campoCpfGarcom = cpfGarcom;
	}
	public String getCampoNumeroMesa() {
		return campoNumeroMesa;
	}
	public void setCampoNumeroMesa(String numeroMesa) {
		this.campoNumeroMesa = numeroMesa;
	}
	public String getCampoCpfCliente() {
		return campoCpfCliente;
	}
	public void setCampoCpfCliente(String campoCpfCliente) {
		this.campoCpfCliente = campoCpfCliente;
	}
	public Integer getCampoCodigo() {
		return campoCodigo;
	}
	public void setCampoCodigo(Integer campoCodigo) {
		this.campoCodigo = campoCodigo;
	}
	public Integer getCampoCodigoProduto() {
		return campoCodigoProduto;
	}
	public void setCampoCodigoProduto(Integer campoCodigoProduto) {
		this.campoCodigoProduto = campoCodigoProduto;
	}






}
