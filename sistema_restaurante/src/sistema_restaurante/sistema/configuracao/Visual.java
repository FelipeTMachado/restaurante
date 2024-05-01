package sistema_restaurante.sistema.configuracao;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Visual {
	// ATRIBUTOS
	private static Visual instance;
	private int tamanhoTela = 80;
	
	
	
	// CONSTRUTOR COMPOSTO SINGLETON
	private Visual() {
		
	}
	
	public static Visual getInstance() {
		if (instance == null) {
			instance = new Visual();
			
			return instance;
		} else
			return instance;
	}
	
	
	
	// METODOS DE CONFIGURACAO
	public void configurarTela(int prTamanhoTela) {
		this.tamanhoTela = prTamanhoTela;
	}
	
	
	
	// METODOS DE MANIPULACAO DE STRINGS
	public String multiplicarCaracteres(String prCaractere) {
		return multiplicarCaracteres(prCaractere, tamanhoTela);
	};
	
	public String multiplicarCaracteres(String prCaractere, int prTamanho) {
		String caracteres = "";
		
		for (int i = 0; i < prTamanho; i++) {
			caracteres += prCaractere;
		}
		
		return caracteres;
	};
	
	
	
	// METODOS DE VISUALIZACAO DE METODOS
	public void visualizarTextoSemFormatacao(String prTexto) {
		System.out.println(prTexto);
	}
	
	public void visualizarTelaLimpa() {
		try {
            PrintWriter writer = new PrintWriter(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));

            // ENVIAR SEQUENCIA DE CONTROLE PARA LIMPAR O CONSOLE
            writer.print("\033[H\033[2J");
            writer.flush();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
	}
	
	public void visualizarEspacoEmBranco() {		
		String espacos = "|" + multiplicarCaracteres(" ") + "|";
		
		System.out.println(espacos);
	}
	
	public void visualizarTitulo(String prTexto) {
		visualizarLinha();
		visualizarTextoAlinhadoCentro(prTexto);
		visualizarLinha();
	}
	
	public void visualizarLinha() {
		String linha = "+" + multiplicarCaracteres("-") + "+";
		
		System.out.println(linha);
	}
	
	public void visualizarTextoAlinhadoDireita(String prTexto) {
		System.out.println("|" + multiplicarCaracteres(" ", (tamanhoTela - prTexto.length() - 1)) + prTexto + " |");
	}
	
	public void visualizarTextoAlinhadoEsquerda(String prTexto) {		
		System.out.println("| " + prTexto + multiplicarCaracteres(" ", (tamanhoTela - prTexto.length() - 1)) + "|");
	}
	
	public void visualizarTextoAlinhadoCentro(String prTexto) {
		String textoFinal    = "";
	
		int espacoTotal = 0;
		
		espacoTotal = tamanhoTela - prTexto.length();
		
		if ((espacoTotal % 2) == 0) {
			String lado = multiplicarCaracteres(" ", espacoTotal / 2);
			
			textoFinal = lado + prTexto + lado;
		} else {
			String lado = multiplicarCaracteres(" ", espacoTotal / 2);
			
			textoFinal = lado + " " + prTexto + lado; 
		}
		
		System.out.println("|" + textoFinal + "|");
	}

	public void visualizarMensagemOpcaoInvalida() {
		visualizarTelaLimpa();
		visualizarTitulo("SISTEMA DE RESTAURANTE");
		visualizarTextoAlinhadoCentro("ATENCAO");
		visualizarEspacoEmBranco();
		visualizarTextoAlinhadoCentro("OPCAO INVALIDA!");
		visualizarLinha();
		Entrada.getInstance().retornaDado("CLIQUE EM ENTER PARA CONTINUAR...");
	}
	
	public void visualizarCabecalho(String sistema, String tituloMenu) {
		Visual.getInstance().visualizarTelaLimpa();
		Visual.getInstance().visualizarTitulo(sistema);
		Visual.getInstance().visualizarTextoAlinhadoCentro(tituloMenu);
		Visual.getInstance().visualizarEspacoEmBranco();
	}
	
	// GETTERS AND SETTERS
	public int getTamanhoTela() {
		return tamanhoTela;
	}
	public void setTamanhoTela(int tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}
}