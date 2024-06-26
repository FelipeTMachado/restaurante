package sistema_restaurante.sistema.visual;

import sistema_restaurante.sistema.configuracao.Entrada;
import sistema_restaurante.sistema.configuracao.Visual;

public class VisualMesa {
	private Integer campoQuantCliente;
	
	public void menuMesa() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "GERENCIAMENTO MESA");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("1 - NOVA");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("2 - BUSCAR");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("3 - EXCLUIR");
		Visual.getInstance().visualizarEspacoEmBranco();
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("9 - VOLTAR");
		Visual.getInstance().visualizarTextoAlinhadoEsquerda("0 - SAIR");
		Visual.getInstance().visualizarLinha();
	}
	
	public String novaMesa() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "NOVA MESA");
		String res = Entrada.getInstance().retornaDado("QUANTIDADE DE CLIENTES MAXIMA: ");
		
		boolean isNumeric = true;
		
		for(int i = 0; i < res.length(); i++) {
			char c = res.charAt(i);
			
			if (!Character.isDigit(c)) {
				isNumeric = false;
			}
		}
		
		
		campoQuantCliente = (isNumeric ? Integer.parseInt(res) : 2);
		return Entrada.getInstance().retornaDado(("ADICIONAR UMA NOVA MESA AO SISTEMA [S / N]: "));
	}

	public void mostrarInicioListaMesa() {
		Visual.getInstance().visualizarTelaLimpa();
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "LISTA DE MESAS");
	}

	public void mostrarMesaEmColuna(int numero) {
		Visual.getInstance().visualizarTextoAlinhadoEsquerda(String.format("NUMERO MESA: %d", numero));
		Visual.getInstance().visualizarTextoAlinhadoEsquerda(String.format("QUANTIDADE MAXIMA DE PESSOAS: %d", campoQuantCliente));
		Visual.getInstance().visualizarLinha();
	}
	
	// GETTERS AND SETTERS
	public Integer getCampoQuantCliente() {
		return campoQuantCliente;
	}
	public void setCampoQuantCliente(Integer campoQuantCliente) {
		this.campoQuantCliente = campoQuantCliente;
	}

	
	public void deleteMesa() {
		Visual.getInstance().visualizarCabecalho("SISTEMA RESTAURANTE", "DELETAR MESA");
		Visual.getInstance().visualizarTextoAlinhadoCentro("... SEMPRE DELETARA A ULTIMA MESA CADASTRADA ...");
		Visual.getInstance().visualizarLinha();
	}

	public void limparCampos() {
		campoQuantCliente = 0;
	}
}
