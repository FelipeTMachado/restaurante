package sistema_restaurante.sistema.persistencia;

import sistema_restaurante.sistema.modelo.Mesa;
import sistema_restaurante.sistema.modelo.Pedido;
import sistema_restaurante.sistema.modelo.Pessoa;
import sistema_restaurante.sistema.modelo.Produto;

public class BaseDados {
	// ATRIBUTO
	private static BaseDados instance;
	private Lista<Pessoa>    basePessoa;
	private Lista<Pessoa>    baseFuncionario;
	private Lista<Pedido>    basePedido;
	private Lista<Mesa>      baseMesa;
	private Lista<Produto>   baseProduto;
	
	
	
	// CONSTRUTOR COMPOSTO SINGLETON
	private BaseDados() {
		basePessoa 		= new Lista<Pessoa>();
		baseFuncionario = new Lista<Pessoa>();
		basePedido 		= new Lista<Pedido>();
		baseMesa        = new Lista<Mesa>();
		baseProduto     = new Lista<Produto>();
	}
	
	public static BaseDados getInstance() {
		if (instance == null) {
			instance = new BaseDados();
		}
		
		return instance;
	}
	
	
	
	// GETTERS AND SETTERS
	public Lista<Pessoa> getBasePessoa() {
		return basePessoa;
	}
	public void setBasePessoa(Lista<Pessoa> basePessoa) {
		this.basePessoa = basePessoa;
	}
	public Lista<Pedido> getBasePedido() {
		return basePedido;
	}
	public void setBasePedido(Lista<Pedido> basePedido) {
		this.basePedido = basePedido;
	}
	public Lista<Mesa> getBaseMesa() {
		return baseMesa;
	}
	public void setBaseMesa(Lista<Mesa> baseMesa) {
		this.baseMesa = baseMesa;
	}
	public Lista<Pessoa> getBaseFuncionario() {
		return baseFuncionario;
	}
	public void setBaseFuncionario(Lista<Pessoa> funcionario) {
		this.baseFuncionario = funcionario;
	}
	public Lista<Produto> getBaseProduto() {
		return baseProduto;
	}
	public void setBaseProduto(Lista<Produto> baseProduto) {
		this.baseProduto = baseProduto;
	}
}
