package sistema_restaurante.sistema.modelo;

import sistema_restaurante.sistema.tipo.ETipoPessoa;

public class Pessoa {
	// ATRIBUTOS
	private String      nome;
	private String      cpf;
	private String      endereco;
	private ETipoPessoa tipo;
	
	
	
	// CONSTRUTOR SIMPLES
	public Pessoa(String n, String c, String e, ETipoPessoa t) {
		this.nome       = n;
		this.cpf        = c;
		this.endereco   = e;
		this.tipo       = t;
	}
	public Pessoa(String cpf) {
		this.cpf = cpf;
	}
	
	
	// GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public ETipoPessoa getTipo() {
		return tipo;
	}
	public void setTipo(ETipoPessoa tipo) {
		this.tipo = tipo;
	}



	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + 
			   ", endereco=" + endereco + ", tipo=" + tipo + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(((Pessoa) obj).getCpf().equals(this.cpf)) {
			return true;
		} 
		
		return false;
	}
}
