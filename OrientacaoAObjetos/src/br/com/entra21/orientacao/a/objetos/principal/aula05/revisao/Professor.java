package br.com.entra21.orientacao.a.objetos.principal.aula05.revisao;

import br.com.entra21.orientacao.a.objetos.principal.aula02.heranca.Pessoa;

public class Professor extends Pessoa implements ComportamentosAcademicos {
	private Estudante estudantes[];
	private Disciplina disciplinas[];

	public Professor() {

	}

	public Professor(Estudante[] estudantes, Disciplina[] disciplinas) {
		super();
		this.estudantes = estudantes;
		this.disciplinas = disciplinas;
	}

	public Professor(String name, byte idade, String cpf) {
		super(name, idade, cpf);
	}

	public Professor(String name, byte idade, String cpf, Estudante[] estudantes, Disciplina[] disciplinas) {
		super(name, idade, cpf);
		this.estudantes = estudantes;
		this.disciplinas = disciplinas;
	}

	public Estudante[] getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(Estudante[] estudantes) {
		this.estudantes = estudantes;
	}

	public Disciplina[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplina[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String realizarApresentacao() {
		String apresentacao = "Oi, sou o professor " + super.getName() + " e tenho " + this.estudantes.length;
		return apresentacao;
	}

	@Override
	public String gerarDossie(String nome) {
		String mensagem = "";
		Estudante estudanteLocalizado = null;
		for (byte estudante = 0; estudante < this.estudantes.length; estudante++) {
			if (this.estudantes[estudante] != null && this.estudantes[estudante].getName().equals(nome)) {
				estudanteLocalizado = this.estudantes[estudante];
				break;
			}
		}
		if (estudanteLocalizado != null) {
			mensagem = escreverDetalheDossie(estudanteLocalizado);

		} else {
			mensagem = "Esse aluno não existe na minha lista!";
		}
		return mensagem;
	}

	private String escreverDetalheDossie(Estudante estudante) {
		String detalhe = "O estudante " + estudante.getName() + " ja aprendeu " + estudante.getDisciplinas().length
				+ " disciplinas";
		detalhe += "\n Observações que percebi sobre esse estudante:";
		detalhe += "\n" + estudante.getObservacao();

		return null;
	}

}
