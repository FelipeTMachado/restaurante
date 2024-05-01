package sistema_restaurante.sistema.modelo;

import sistema_restaurante.sistema.persistencia.Lista;

public class Mesa {
	// ATRIBUTOS
	private Lista<Comanda> comandas = new Lista<Comanda>();
	private Integer quantCliente;
	private Integer numero;
	
	
	// CONSTRUTOR
	public Mesa(Integer quantCliente, Integer numero) {
		this.quantCliente = quantCliente;
		this.numero = numero;
	}
	
	
	
	// GETTERS AND SETTERS
	public Lista<Comanda> getComandas() {
		return comandas;
	}
	public void setComandas(Lista<Comanda> comandas) {
		this.comandas = comandas;
	}
	public Integer getQuantCliente() {
		return quantCliente;
	}
	public void setQuantCliente(Integer quantCliente) {
		this.quantCliente = quantCliente;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
}
