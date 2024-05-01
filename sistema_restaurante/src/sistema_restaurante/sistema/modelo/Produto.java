package sistema_restaurante.sistema.modelo;

public class Produto {
	// ATRIBUTOS
	private Integer codigo;
	private String descricao;
	private Double valor;
	
	
	
	// CONSTRUTORES
	public Produto(String descricao, Double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	public Produto(Integer codigo, String descricao, Double valor) {
		this.codigo    = codigo;
		this.descricao = descricao;
		this.valor     = valor;
	}
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	// GETTERS AND SETTERS
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	@Override
	public boolean equals(Object obj) {
		if (((Produto) obj).getCodigo() == this.getCodigo()) {
			return true;
		} 
			
		return false;
	}
}
