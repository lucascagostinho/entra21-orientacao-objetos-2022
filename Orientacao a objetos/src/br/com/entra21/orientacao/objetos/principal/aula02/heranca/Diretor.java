package br.com.entra21.orientacao.objetos.principal.aula02.heranca;

public class Diretor extends Pessoa {

	private String cursoAtual;
	private byte qtdProfessores;

	public Diretor() {

	}

	public Diretor(String nome, byte idade) {
		super();
	}

	// Botão direito -> Source -> gerar contrutor usando filds
	public Diretor(String nome, byte idade, String cpf, String cursoAtual, byte qtdProfessores) {
		super(nome, idade, cpf);
		this.cursoAtual = cursoAtual;
		this.qtdProfessores = qtdProfessores;
	}

	public void realizarApresentacao() {
		System.out.println("Oi meu nome é: " + getNome() + " e tenho " + getIdade() + " anos");

	}

	public String getCursoAtual() {
		return cursoAtual;
	}

	public void setCursoAtual(String cursoAtual) {
		this.cursoAtual = cursoAtual;
	}

	public byte getQtdProfessores() {
		return qtdProfessores;
	}

	public void setQtdProfessores(byte qtdProfessores) {
		this.qtdProfessores = qtdProfessores;
	}

}
