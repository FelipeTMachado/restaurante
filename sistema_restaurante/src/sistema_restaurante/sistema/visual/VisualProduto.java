package sistema_restaurante.sistema.visual;

import sistema_restaurante.sistema.configuracao.Entrada;
import sistema_restaurante.sistema.configuracao.Visual;

public class VisualProduto {
	// ATRIBUTOS
	private Integer campoCodigo;
	private String campoDescricao;
	private Double campoValor;
	
	
	
	// CONSTRUTOR
	public VisualProduto() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	// METODOS FUNCIONAIS
	public void menuGerenciamento() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "GERENCIMENTO PRODUTO");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("1 - NOVO");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("2 - EXCLUIR");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("3 - BUSCAR");
		Visual.getInstance().visualizarEspacoEmBranco();
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("9 - VOLTAR");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("0 - SAIR");
		Visual.getInstance().visualizarLinha();
	}
	
	public void menuNovo() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "PREENCHER NOVO PRODUTO");
		preencherNovoProduto();
	}
	
	public void preencherNovoProduto() {
		campoDescricao = Entrada.getInstance().retornaDado("DESCRICAO: ");
		try {
			campoValor = Double.parseDouble(Entrada.getInstance().retornaDado("VALOR: "));
		} catch (Exception e) {
			campoValor = 0.0;
		}
		Visual.getInstance().visualizarLinha();
	}
	
	public void visualizarProdutoEmColuna() {
		Visual.getInstance().visualizarTextoAlinhadoEsquerda(String.format("CODIGO:  . . . . . . %d", campoCodigo));
		Visual.getInstance().visualizarTextoAlinhadoEsquerda(String.format("DESCRICAO: . . . . . %s", campoDescricao));
		Visual.getInstance().visualizarTextoAlinhadoEsquerda(String.format("VALOR: . . . . . . . R$ %.2f", campoValor));
		Visual.getInstance().visualizarLinha();
	}
	
	public void menuBuscar() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "LISTA DE PRODUTOS");
		Visual.getInstance().visualizarLinha();
	}
	
	public void mensagemProdutoCadastradoSucesso() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "SUCESSO");
		Visual.getInstance().visualizarTextoAlinhadoCentro("PRODUTO CADASTRADO COM SUCESSO!");
		Visual.getInstance().visualizarLinha();
	}
	
	public void mensagemProdutoExcluido() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "SUCESSO");
		Visual.getInstance().visualizarTextoAlinhadoCentro("PRODUTO EXCLUIDO COM SUCESSO!");
		Visual.getInstance().visualizarLinha();
		Entrada.getInstance().retornaDado("PRESSIONE ENTER PARA CONTINUAR ...");
	}
	
	public void menuExcluir() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "EXCLUIR PRODUTO");
		try {
			campoCodigo = Integer.parseInt(Entrada.getInstance().retornaDado("DIGITE O CODIGO DO PRODUTO: "));
		} catch (Exception e) {
			campoCodigo = 0;
		}
		
		Visual.getInstance().visualizarLinha();
	}
	
	public void mensagemProdutoNaoExcluido() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "ATENCAO");
		Visual.getInstance().visualizarTextoAlinhadoCentro("PRODUTO NAO FOI EXCLUIDO!");
		Visual.getInstance().visualizarLinha();
		Entrada.getInstance().retornaDado("PRESSIONE ENTER PARA CONTINUAR ...");
	}
	
	public void mensagemProdutoNaoExiste() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "ATENCAO");
		Visual.getInstance().visualizarTextoAlinhadoCentro("CODIGO DE PRODUTO NAO EXISTE NO SISTEMA!");
		Visual.getInstance().visualizarLinha();
		Entrada.getInstance().retornaDado("PRESSIONE ENTER PARA CONTINUAR ...");
	}

	
	
	// GETTERS AND SETTERS
	public Integer getCampoCodigo() {
		return campoCodigo;
	}
	public void setCampoCodigo(Integer campoCodigo) {
		this.campoCodigo = campoCodigo;
	}
	public String getCampoDescricao() {
		return campoDescricao;
	}
	public void setCampoDescricao(String campoDescricao) {
		this.campoDescricao = campoDescricao;
	}
	public Double getCampoValor() {
		return campoValor;
	}
	public void setCampoValor(Double campoValor) {
		this.campoValor = campoValor;
	}











}