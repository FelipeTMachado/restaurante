package sistema_restaurante.sistema.visual;

import sistema_restaurante.sistema.configuracao.Entrada;
import sistema_restaurante.sistema.configuracao.Visual;
import sistema_restaurante.sistema.tipo.ETipoPessoa;

public class VisualPessoa {
	// ATRIBUTOS
	private String campoNome;
	private String campoCpf;
	private String campoEndereco;
	private ETipoPessoa campoTipo;
	
	
	
	// CONSTRUTOR
	public VisualPessoa() {

	}
	
	
	
	// METODOS FUNCIONAIS
	public void cabecalho(String titulo) {
		Visual.getInstance().visualizarTelaLimpa();
		Visual.getInstance().visualizarTitulo("SISTEMA RESTAURANTE");
		Visual.getInstance().visualizarTextoAlinhadoCentro(titulo);
		Visual.getInstance().visualizarEspacoEmBranco();
	}
	
	public void menuCliente() {
		Visual v = Visual.getInstance();
		v.visualizarCabecalho("SISTEMA RESTAURANTE", "GERENCIAMENTO CLIENTE");
		v.visualizarTextoAlinhadoEsquerda("1 - NOVO");
		v.visualizarTextoAlinhadoEsquerda("2 - BUSCAR");
		v.visualizarTextoAlinhadoEsquerda("3 - ALTERAR");
		v.visualizarTextoAlinhadoEsquerda("4 - EXCLUIR");
		v.visualizarEspacoEmBranco();
		v.visualizarTextoAlinhadoEsquerda("9 - VOLTAR");
		v.visualizarTextoAlinhadoEsquerda("0 - SAIR");
		v.visualizarLinha();
	}

	public void alterarCliente() {
		cabecalho("ALTERAR CLIENTE");
		preencherCampos();
		campoTipo = ETipoPessoa.CLIENTE;
	}
	
	public void alterarFuncionario() {
		cabecalho("ALTERAR FUNCIONARIO");
		preencherCampos();
		campoTipo = ETipoPessoa.FUNCIONARIO;
	}
	
	public void novoCliente() {
		cabecalho("NOVO CLIENTE");
		preencherCampos();
		campoTipo = ETipoPessoa.CLIENTE;
	}

	public void verificarCampos() {
		cabecalho("VERIFICAR DADOS");
		mostrarCamposEmColuna();
		Visual.getInstance().visualizarLinha();
	}
	
	public void mostrarCamposEmColuna() {
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("NOME                 | " + campoNome);
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("CPF                  | " + campoCpf);
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("ENDERECO             | " + campoEndereco);
	}
	
	public void preencherCampos() {
		campoNome     = Entrada.getInstance().retornaDado("NOME: ");
		campoCpf      = Entrada.getInstance().retornaDado("CPF: ");
		campoEndereco = Entrada.getInstance().retornaDado("ENDERECO: ");
	}
	
	public void mensagemDadosNaoSalvos() {
		cabecalho("ATENCAO");
		Visual.getInstance().visualizarTextoAlinhadoCentro("DADOS NAO FORAM SALVOS");
		Visual.getInstance().visualizarLinha();
		Entrada.getInstance().retornaDado("DIGITE ENTER PARA CONTINUAR ...");
	}
	
	public void mensagemDadosSalvos() {
		cabecalho("SUCESSO");
		Visual.getInstance().visualizarTextoAlinhadoCentro("DADOS SALVOS!");
		Visual.getInstance().visualizarLinha();
		Entrada.getInstance().retornaDado("DIGITE ENTER PARA CONTINUAR ...");
	}
	
	public void menuBuscarCliente() {
		cabecalho("BUSCA CLIENTE");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("1 - BUSCAR POR CPF");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("2 - BUSCAR TODOS");
		Visual.getInstance().visualizarEspacoEmBranco();
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("9 - VOLTAR");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("0 - SAIR");
		Visual.getInstance().visualizarLinha();
	}
	
	public void mensagemClienteCadastradoSistema() {
		cabecalho("ATENCAO");
		Visual.getInstance().visualizarTextoAlinhadoCentro("PESSOA JA CADASTRADA NO SISTEMA!");
		Visual.getInstance().visualizarLinha();
		Entrada.getInstance().retornaDado("PRESSIONE ENTER PARA CONTINUAR ...");
	}
	
	public void buscaClienteNome() {
		cabecalho("BUSCA CLIENTE POR NOME");
		campoNome = Entrada.getInstance().retornaDado("NOME: ");
		Visual.getInstance().visualizarLinha();
	}
	
	public void buscaClienteCpf() {
		cabecalho("BUSCA CLIENTE POR CPF");
		campoCpf = Entrada.getInstance().retornaDado("CPF: ");
		Visual.getInstance().visualizarLinha();
	}
	
	
	
	public void clienteNaoEncontrado() {
		cabecalho("BUSCA CLIENTE POR CPF");
		Visual.getInstance().visualizarTextoAlinhadoCentro("CLIENTE NAO ENCONTRADO NO SISTEMA");
		Visual.getInstance().visualizarLinha();
	}
	
	public void buscarTodosClientesInicio() {
		cabecalho("TODOS OS CLIENTES CADASTRADOS");
		Visual.getInstance().visualizarLinha();
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("CAMPOS               | DADOS");
		Visual.getInstance().visualizarLinha();
	}
	
	public void mostrarClienteEmColuna() {
		mostrarCamposEmColuna();
		Visual.getInstance().visualizarLinha();
	}
	
	public void buscarTodosClientesFim() {
		Visual.getInstance().visualizarLinha();
	}
	
	public void limparCampos() {
		setCampoNome("");
		setCampoCpf("");
		setCampoEndereco("");
		setCampoTipo(null);
	}
	
	// METODOS FUNCIONARIO
	public void menuFuncionario() {
		cabecalho("GERENCIAMENTO FUNCIONARIO");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("1 - NOVO");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("2 - BUSCAR");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("3 - ALTERAR");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("4 - EXCLUIR");
		Visual.getInstance().visualizarEspacoEmBranco();
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("9 - VOLTAR");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("0 - SAIR");
		Visual.getInstance().visualizarLinha();
	}
	
	public void novoFuncionario() {
		cabecalho("NOVO FUNCIONARIO");
		preencherCampos();
		campoTipo = ETipoPessoa.FUNCIONARIO;
	}

	public void menuBuscarFuncionario() {
		cabecalho("BUSCA FUNCIONARIO");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("1 - BUSCAR POR CPF");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("2 - BUSCAR TODOS");
		Visual.getInstance().visualizarEspacoEmBranco();
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("9 - VOLTAR");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("0 - SAIR");
		Visual.getInstance().visualizarLinha();
	}
	
	public void funcionarioNaoEncontrado() {
		cabecalho("BUSCA FUNCIONARIO POR CPF");
		Visual.getInstance().visualizarTextoAlinhadoCentro("FUNCIONARIO NAO ENCONTRADO NO SISTEMA");
		Visual.getInstance().visualizarLinha();
	}
	
	public void buscaFuncionarioCpf() {
		cabecalho("BUSCA FUNCIONARIO POR CPF");
		campoCpf = Entrada.getInstance().retornaDado("CPF: ");
		Visual.getInstance().visualizarLinha();
	}
	
	// GETTERS AND SETTERS
	public String getCampoNome() {
		return campoNome;
	}
	public void setCampoNome(String campoNome) {
		this.campoNome = campoNome;
	}
	public String getCampoCpf() {
		return campoCpf;
	}
	public void setCampoCpf(String campoCpf) {
		this.campoCpf = campoCpf;
	}
	public String getCampoEndereco() {
		return campoEndereco;
	}
	public void setCampoEndereco(String campoEndereco) {
		this.campoEndereco = campoEndereco;
	}
	public ETipoPessoa getCampoTipo() {
		return campoTipo;
	}
	public void setCampoTipo(ETipoPessoa campoTipo) {
		this.campoTipo = campoTipo;
	}



	public void buscarTodosFuncionariosInicio() {
		cabecalho("TODOS OS FUNCIONARIOS CADASTRADOS");
		Visual.getInstance().visualizarLinha();
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("CAMPOS                 DADOS");
		Visual.getInstance().visualizarLinha();
		
	}



	public void baseVazia(String nomeBase) {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "ATENCAO");
		Visual.getInstance().visualizarTextoAlinhadoCentro("BASE DE " + nomeBase + " VAZIA");
		Visual.getInstance().visualizarLinha();
	}



	public void pessoaExcluidaComSucesso() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "ATENCAO");
		Visual.getInstance().visualizarTextoAlinhadoCentro("PESSOA EXCLUIDA COM SUCESSO!");
		Visual.getInstance().visualizarLinha();
		Entrada.getInstance().retornaDado("DIGITE ENTER PARA CONTINUAR ...");
	}





}