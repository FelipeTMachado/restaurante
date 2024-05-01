package sistema_restaurante.sistema.controle;

import sistema_restaurante.sistema.configuracao.Entrada;
import sistema_restaurante.sistema.configuracao.Visual;
import sistema_restaurante.sistema.modelo.Mesa;
import sistema_restaurante.sistema.persistencia.BaseDados;
import sistema_restaurante.sistema.persistencia.Lista;
import sistema_restaurante.sistema.visual.VisualMesa;

public class ControleMesa {
	private VisualMesa visual;
	private Lista<Mesa> base = BaseDados.getInstance().getBaseMesa();
	
	public ControleMesa() {
		visual = new VisualMesa();
	}
	
	public void menuMesa() {
		boolean ehSair = false;
		
		while (!ehSair) {
			visual.menuMesa();
			String opcao = Entrada.getInstance().retornaDado("ESCOLHA SUA OPCAO: ");
			
			switch (opcao) {
			case "1": {
				novaMesa();
				break;
			}
			
			case "2":{
				buscarMesa();
				break;
			}
			
			case "3": {
				excluirMesa();
				break;
			}
			
			case "0": {
				System.exit(1);
			}
			
			case "9": {	
				ehSair = true;
				break;
			}
			
			default:
				Visual.getInstance().visualizarMensagemOpcaoInvalida();;
			}
			
		}
	}

	private void excluirMesa() {
		visual.deleteMesa();
		
		String res = Entrada.getInstance().retornaDado("DELTAR ULTIMA MESA [S / n]: ");
		
		if (res.equals("S") || res.equals("s")) {
			base.deleteEnd();
			Visual.getInstance().visualizarTextoAlinhadoCentro("MESA DELETADA COM SUCESSO!");
		}
	}

	public Mesa buscarMesaPorIndex(Integer index) {
		return base.findIndex(index);
	}
	
	private void buscarMesa() {
		visual.limparCampos();
		visual.mostrarInicioListaMesa();
		
		while (base.hasNext()) {
			Mesa mesaAux = base.next();
			visual.setCampoQuantCliente(mesaAux.getQuantCliente());
			visual.mostrarMesaEmColuna(mesaAux.getNumero());
		}
		
		Entrada.getInstance().retornaDado("PRESSIONE ENTER PARA CONTINUAR ...");
	}

	private void novaMesa() {
		String opcao = visual.novaMesa();
		
		
		if (opcao.equals("S") || opcao.equals("s")) {
			Integer numero;
			if (base.isEmpty()) {
				numero = 1;
			} else {
				numero = base.size() + 1;
			}
			
			base.insertEnd(new Mesa(visual.getCampoQuantCliente(), numero));
		}
	}
}
