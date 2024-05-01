package sistema_restaurante.sistema;

import sistema_restaurante.sistema.configuracao.Entrada;
import sistema_restaurante.sistema.configuracao.Visual;
import sistema_restaurante.sistema.controle.ControleCaixa;
import sistema_restaurante.sistema.controle.ControleMesa;
import sistema_restaurante.sistema.controle.ControlePedido;
import sistema_restaurante.sistema.controle.ControlePessoa;
import sistema_restaurante.sistema.controle.ControleProduto;
import sistema_restaurante.sistema.modelo.Mesa;
import sistema_restaurante.sistema.modelo.Pedido;
import sistema_restaurante.sistema.modelo.Pessoa;
import sistema_restaurante.sistema.modelo.Produto;
import sistema_restaurante.sistema.persistencia.BaseDados;
import sistema_restaurante.sistema.tipo.EStatusPedido;
import sistema_restaurante.sistema.tipo.ETipoPessoa;

public class Main {
	public static void main(String[] args) {
		dadosPreCadastrados();
		controlePrincipal();	
	}
	
	public static void dadosPreCadastrados() {
		Pessoa cliente = new Pessoa("Taina Jaspin", "12180829922", "Rua Alfredo Bratting, 46", ETipoPessoa.CLIENTE);
		Pessoa garcom = new Pessoa("Felipe Camargo", "09297363970", "Rua Alfredo Baner, 90", ETipoPessoa.FUNCIONARIO);
		Mesa mesa = new Mesa(4, 1);
		Produto produto = new Produto(1, "Coca Cola Light 500ml", 5.0);
		
		
		BaseDados.getInstance().getBasePessoa().insertBegin(cliente);
		BaseDados.getInstance().getBasePessoa().insertBegin(new Pessoa("Iren Machado", "85110523991", "Rua Alfredo Bratting, 46", ETipoPessoa.CLIENTE));
		
		BaseDados.getInstance().getBaseFuncionario().insertBegin(new Pessoa("Paulo Pedroso", "00773120904", "Rua Pedro Moretto, 102", ETipoPessoa.FUNCIONARIO));
		BaseDados.getInstance().getBaseFuncionario().insertEnd(garcom);
		
		BaseDados.getInstance().getBaseMesa().insertBegin(mesa);
		BaseDados.getInstance().getBaseMesa().insertEnd(new Mesa(2, 2));
		
		BaseDados.getInstance().getBaseProduto().insertEnd(produto);
		BaseDados.getInstance().getBaseProduto().insertEnd(new Produto(2, "Guarana 500ml", 5.0));
		BaseDados.getInstance().getBaseProduto().insertEnd(new Produto(3, "Prato Feito", 25.0));
		
		Pedido pedido = new Pedido(1);
		pedido.setCliente(cliente);
		pedido.setGarcom(garcom);
		pedido.setMesa(mesa);
		pedido.getProdutos().insertBegin(produto);
		pedido.setStatus(EStatusPedido.CADASTRANDO);
		
		BaseDados.getInstance().getBasePedido().insertBegin(pedido);
	}

	
	// CONTROLES DO MENU PRINCIPAL
	private static void controlePrincipal() {
		boolean ehSair = false;
		
		while (!ehSair) {	
			visualPrincipal();
			String opcao = Entrada.getInstance().retornaDado("DIGITE SUA ESCOLHA: ");
			
			switch (opcao) {
			case "1": {
				cadastros();
				break;
			}
			
			case "2": {
				pedidos();
				break;
			}
			
			case "3": {
				caixa();
				break;
			}
			
			case "0": {
				System.exit(1);
			}
			
			default:
				Visual.getInstance().visualizarMensagemOpcaoInvalida();;
			}
		}
	}
	
	private static void caixa() {
		ControleCaixa caixa = new ControleCaixa();
		caixa.menuPrincipal();
	}

	private static void pedidos() {
		ControlePedido pedido = new ControlePedido();
		pedido.menuPrincipal();
	}

	private static void cadastros() {
		boolean ehSair = false;
		
		while (!ehSair) {
			visualCadastros();
			String opcao = Entrada.getInstance().retornaDado("ESCOLHA SUA OPCAO: ");
			
			switch (opcao) {
			case "1": {
				ControlePessoa controle = new ControlePessoa();
				controle.menuCliente();
				break;
			}
			
			case "2": {
				ControlePessoa controle = new ControlePessoa();
				controle.menuFuncionario();
				break;
			}
			
			case "3": {
				ControleMesa controle = new ControleMesa();
				controle.menuMesa();
				break;
			}
			
			case "4": {
				ControleProduto controle = new ControleProduto();
				controle.menuProduto();
				break;
			}
		
			case "9": {
				ehSair = true;
				break;
			}
			
			case "0": {
				System.exit(1);
			}
			default:
				Visual.getInstance().visualizarMensagemOpcaoInvalida();
			}			
		}
	}


	// VISUAIS DO MENU PRINCIPAL
	private static void visualPrincipal() {
		Visual.getInstance().configurarTela(70);
		Visual.getInstance().visualizarTelaLimpa();
		Visual.getInstance().visualizarTitulo("SISTEMA RESTAURANTE");
		Visual.getInstance().visualizarTextoAlinhadoCentro("MENU PRINCIPAL");
		Visual.getInstance().visualizarEspacoEmBranco();
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("1 - CADASTROS");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("2 - PEDIDOS");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("3 - CAIXA");
		Visual.getInstance().visualizarEspacoEmBranco();
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("0 - SAIR");
		Visual.getInstance().visualizarLinha();
	}
	
	private static void visualCadastros() {
		Visual.getInstance().visualizarTelaLimpa();
		Visual.getInstance().visualizarTitulo("SISTEMA RESTAURANTE");
		Visual.getInstance().visualizarTextoAlinhadoCentro("CADASTROS");
		Visual.getInstance().visualizarEspacoEmBranco();
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("1 - CLIENTES");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("2 - FUNCIONARIOS");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("3 - MESAS");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("4 - PRODUTO");
		Visual.getInstance().visualizarEspacoEmBranco();
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("9 - VOLTAR");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("0 - SAIR");
		Visual.getInstance().visualizarLinha();
	}
	
}


//Pessoa pessoa = new Pessoa("Felipe", "09297363970", "Rua Alfredo Bratting", ETipoPessoa.CLIENTE);
//Pessoa pessoa1 = new Pessoa("Paulo", "09297363970", "Rua Alfredo Bratting", ETipoPessoa.CLIENTE);
//
//while (BaseDados.getInstance().getBasePessoa().hasNext()) {
//	System.out.println(BaseDados.getInstance().getBasePessoa().next().getNome());
//