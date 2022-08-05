package br.com.entra21.orientacao.a.objetos.principal.aula02.heranca;

public class Pessoa {
	private String nome;
	private byte idade;
	private String cpf;
	private String observacao;
	
	
	public Pessoa() {
		super();
	}

	public Pessoa(String nome, byte idade, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public byte getIdade() {
		return idade;
	}

	public void setIdade(byte idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
	
}
