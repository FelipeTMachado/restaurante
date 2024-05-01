package sistema_restaurante.sistema.modelo;

import sistema_restaurante.sistema.persistencia.Lista;

public class Comanda {
	// ATRIBUTOS
	private Lista<Produto> produtos = new Lista<Produto>();
	private Lista<Pessoa> clientes = new Lista<Pessoa>();
	
	
	
	// CONSTRUTOR
	public Comanda() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	// GETTERS AND SETTERS
	public Lista<Pessoa> getClientes() {
		return clientes;
	}
	public void setClientes(Lista<Pessoa> clientes) {
		this.clientes = clientes;
	}
	public Lista<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(Lista<Produto> produtos) {
		this.produtos = produtos;
	}
}