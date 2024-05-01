package sistema_restaurante.sistema.modelo;

public class Mesa {
	// ATRIBUTOS
	private Integer quantCliente;
	private Integer numero;
	
	
	// CONSTRUTOR
	public Mesa(Integer quantCliente, Integer numero) {
		this.quantCliente = quantCliente;
		this.numero = numero;
	}
	
	
	
	// GETTERS AND SETTERS
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
