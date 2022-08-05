package br.com.entra21.orientacao.a.objetos.principal.aula02.heranca;

public class Diretor extends Pessoa{
	// remover os metodos que são comuns
	/*
	 * private String name; private byte idade; private String cpf;
	 */
	
	// manter os quesao diferentes
	private String cursoAtual;
	private byte quantidadeProfessores;

	public Diretor() {

	}

	public Diretor(String nome, byte age) {
		super();
		}

	public Diretor(String name, byte age, String cursoAtual, byte quantidadeProfessores) {
		super(name, quantidadeProfessores, cursoAtual);
		this.cursoAtual = cursoAtual;
		this.quantidadeProfessores = quantidadeProfessores;
	}

	public void realizarApresentacao() {
		System.out.println("Oi meu nome é " + getName() + " e minha idade é " + getIdade());

	}


	public String getCursoAtual() {
		return cursoAtual;
	}

	public void setCursoAtual(String cursoAtual) {
		this.cursoAtual = cursoAtual;
	}

	public byte getQuantidadeProfessores() {
		return quantidadeProfessores;
	}

	public void setQuantidadeProfessores(byte quantidadeProfessores) {
		this.quantidadeProfessores = quantidadeProfessores;
	}

}