package sistema_restaurante.sistema.configuracao;

import java.io.Console;
import java.util.Scanner;

public class Entrada {
	// ATRIBUTOS
	private static Entrada instance;
	private Scanner scanner = new Scanner(System.in);
	private Console console = System.console();
	
	
	
	// CONSTRUTOR COMPOSTO SINGLETON
	private Entrada() {
		// TODO Auto-generated constructor stub
	}
	
	public static Entrada getInstance() {
		if (instance == null) 
			instance = new Entrada();
		
		return instance;
	}	
	
	
	
	// METODOS FUNCIONAIS
	public String retornaDado(String prTexto) {
		if (prTexto.trim().equals("")) {
			System.out.print(prTexto);
			return scanner.nextLine();
			
		} else {
			if (console == null) {
				System.out.print("| " + prTexto);
				
				return scanner.nextLine();
			} else {
				String msg = ("| " + prTexto);
				return console.readLine(msg);
			}
		}
	}
	
	public String retornaSenha(String prTexto) {
		if (console  == null) {
			System.out.print("| " + prTexto);
			return scanner.nextLine();
		} else {
			return new String(console.readPassword("| " + prTexto));
		}
	}
	
	
	
	// GETTERS AND SETTERS
	public Scanner getScanner() {
		return scanner;
	}
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
	public Console getConsole() {
		return console;
	}
	public void setConsole(Console console) {
		this.console = console;
	}
}
