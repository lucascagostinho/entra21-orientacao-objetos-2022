package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.aula01.classes.Aluno;
import br.com.entra21.orientacao.objetos.principal.aula01.classes.Professor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Diretor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Funcionario;

public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		byte option;

		do {
			System.out.println("Escolha uma opção:");
			System.out.println("0 - Sair");
			System.out.println("1 - Aprender Classes");
			System.out.println("2 - Aprender Herança");
			option = input.nextByte();

			switch (option) {
			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				aprenderClassesObjetos();

				break;

			case 2:
				aprenderHeranca();

				break;

			default:
				System.out.println("Escolha uma opção válida");
				break;
			}

		} while (option != 0);

	}

	public static void aprenderClassesObjetos() {

		Professor professorJava = new Professor();

		Professor professiraIngles = new Professor("Isabelle", 25);

		System.out.println("Nome dela = " + professiraIngles.getNome());

		professiraIngles.setNome("Isabelle 2");

		System.out.println("agora o nome dela = " + professiraIngles.getNome());

		Aluno alunoTeste = new Aluno();

		Aluno outroAluno = new Aluno();

		Aluno alunoNovato = new Aluno();

		alunoTeste.nome = "Lucas";
		alunoTeste.idade = 25;

		outroAluno.idade = 18;
		outroAluno.nome = "teste";

		alunoTeste.responderChamada();

		/*
		 * System.out.println("Qual o nome do aluno novato?"); alunoNovato.nome =
		 * entrada.next(); System.out.println("Qual a idade do aluno novato?");
		 * alunoNovato.idade = entrada.nextByte();
		 * 
		 * System.out.println("Bem vindo:" + alunoNovato.nome);
		 */

	}

	public static void aprenderHeranca() {

		Funcionario funcionario1 = new Funcionario();
		funcionario1.setIdade((byte) 22);
		funcionario1.setNome("Ana");
		funcionario1.setCargoAtual("Suporte");
		funcionario1.setSalario(2.500f);
		System.out
				.println("oi meu nome é: " + funcionario1.getNome() + " e tenho " + funcionario1.getIdade() + " anos");

		Funcionario funcionario2 = new Funcionario("Clara", (byte) 24, "07428461995", "Desenvolvedor", 3.000f);
		funcionario2.getCpf();

		Diretor diretor1 = new Diretor();
		diretor1.realizarApresentacao();

		Diretor diretor2 = new Diretor();
		diretor2.realizarApresentacao();

		Diretor diretor3 = new Diretor("Lucas", (byte) 25);
		diretor3.realizarApresentacao();

		Diretor diretor4 = new Diretor("Teste", (byte) 15, "07428461995", "Teste", (byte) 2500);
		diretor4.setObservacao("testte");

	}

}
