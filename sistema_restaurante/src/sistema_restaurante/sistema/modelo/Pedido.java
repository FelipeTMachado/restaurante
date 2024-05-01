package sistema_restaurante.sistema.modelo;

import sistema_restaurante.sistema.persistencia.Lista;
import sistema_restaurante.sistema.tipo.EStatusPedido;

public class Pedido {
	// ATRIBUTOS
	private Integer codigo;
	private Pessoa cliente;
	private Pessoa garcom;
	private Mesa mesa;
	private Lista<Produto> produtos = new Lista<Produto>(); 
	private EStatusPedido status;
	
	
	
	// CONSTRUTORES
	public Pedido() {
		
	}
	
	public Pedido(Integer codigo) {
		this.codigo = codigo;
	}
	
	// GETTERS AND SETTERS
	public Pessoa getCliente() {
		return cliente;
	}
	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Pessoa getGarcom() {
		return garcom;
	}
	public void setGarcom(Pessoa garcom) {
		this.garcom = garcom;
	}
	public Mesa getMesa() {
		return mesa;
	}
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
	public Lista<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(Lista<Produto> produtos) {
		this.produtos = produtos;
	}
	public EStatusPedido getStatus() {
		return status;
	}
	public void setStatus(EStatusPedido status) {
		this.status = status;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (((Pedido) obj).getCodigo() == this.getCodigo()) {
			return true;
		} 
		
		return false;
	}
}