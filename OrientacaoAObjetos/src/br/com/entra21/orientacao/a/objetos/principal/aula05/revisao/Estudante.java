package br.com.entra21.orientacao.a.objetos.principal.aula05.revisao;

import br.com.entra21.orientacao.a.objetos.principal.aula02.heranca.Pessoa;

public class Estudante extends Pessoa implements ComportamentosAcademicos {

	private Disciplina disciplinas[];

	public Estudante() {

	}

	public Estudante(Disciplina[] disciplinas) {
		super();
		this.disciplinas = disciplinas;
	}

	// construtor vindo da superclasse Pessoa
	public Estudante(String nome, byte idade, String cpf) {
		super(nome, idade, cpf);
		// TODO Auto-generated constructor stub
	}

	public Estudante(String nome, byte idade, String cpf, Disciplina[] disciplinas) {
		super(nome, idade, cpf);
		this.disciplinas = disciplinas;
	}

	public Disciplina[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplina[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	// métodos da interface ComportamentosAcademicos
	@Override
	public String realizarApresentacao() {
		String apresentacao = "Oi, meu nome e" + super.getName();
		return apresentacao;
	}

	@Override
	public String gerarDossie(String nome) {
		String mensagem = "";
		if (nome.equals(super.getName())) {
			mensagem = "O dossie sobre mim é gerado com a minha interação entre professor e colegas";
		}else {
			mensagem = "Ei, você errou meu nome!!!!";
		}
		return mensagem;
	}

}
