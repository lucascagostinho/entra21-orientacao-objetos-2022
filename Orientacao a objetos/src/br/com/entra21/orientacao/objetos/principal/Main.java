package br.com.entra21.orientacao.objetos.principal;

import java.awt.Panel;
import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.aula01.classes.Aluno;
import br.com.entra21.orientacao.objetos.principal.aula01.classes.Professor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Diretor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Funcionario;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Pessoa;
import br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo.Atleta;
import br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo.Nadador;
import br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo.Velocista;
import br.com.entra21.orientacao.objetos.principal.aula04.conceitospoo.Ponto;
import br.com.entra21.orientacao.objetos.principal.aula04.conceitospoo.Reta;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Aviao;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Capivara;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Formiga;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Gato;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Humano;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Peixe;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Planta;

public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		byte option;

		do {
			System.out.println("Escolha uma opção:");
			System.out.println("0 - Sair");
			System.out.println("1 - Aprender Classes");
			System.out.println("2 - Aprender Herança");
			System.out.println("3 - Polimorfismo");
			System.out.println("4 - Aprender conceitos POO");
			System.out.println("5 - Aprender polimorfismo com interface");
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

			case 3:
				aprenderPolimorfismo();

				break;

			case 4:
				aprenderConceitosPoo();
				break;

			case 5:
				aprenderPolimorfismoComInterface();
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

	public static void aprenderPolimorfismo() {
		// possuo esse método dentro de Atleta, com o o polimorfismo ele busca primeiro
		// na classe, se não tiver, ele vai na herança
		// comemorar vitoria já existe na super classe, mas se eu criar com mesmo nome e
		// vizibilidade e tipo de reotnro e argumeentos
		// o metodo excolhido será esse aqui e não o da super classe
		// o padrão de polimorfismo é herdar, a segunda forma é fazer completamente do
		// meu jeito, o que eu herdei
		// a terceira forma do polimorfismo é aproveitar a minhba herança e fazer um
		// diferencial
		Atleta atleta1 = new Atleta();
		atleta1.comemorarVitoria();
		atleta1.aprenderComDerrota();

		Nadador nadador1 = new Nadador("Mar", "Sunga");
		nadador1.comemorarVitoria();
		nadador1.aprenderComDerrota();
		nadador1.setName("Lucas");

		Nadador nadador2 = new Nadador("Lucas", (byte) 25, 5, 1, "Mar", "Bermuda");

		Velocista velocista1 = new Velocista();
		velocista1.setMarcaCalcado("Nike");
		velocista1.setName("Forest");
		velocista1.comemorarVitoria();
		velocista1.aprenderComDerrota();

	}

	public static void aprenderConceitosPoo() {
		// Coesão
		// Coesão está ligado ao princípio da responsabilidade única, onde uma classe
		// deve ter apenas uma única responsabilidade e realizá-la de maneira
		// satisfatória, ou seja, uma classe não deve assumir responsabilidades que não
		// são suas .
		// Uma vez sendo ignorado este princípio, passamos a ter problemas, como
		// dificuldades de manutenção e de reuso.
		Ponto pontoAlto = new Ponto(30f, 10000f);
		Ponto esquerdaBaixo = new Ponto(-20f, -100f);

		// Agregação
		// É uma forma especial de associação onde: É uma associação unidirecional, ou
		// seja, um relacionamento de mão única. Por exemplo, o departamento pode ter
		// alunos, mas vice-versa não é possível e, portanto, de natureza unidirecional.
		// Na agregação, ambas as entradas podem sobreviver individualmente, o que
		// significa
		Reta torta = new Reta();
		Reta retaDiagonal = new Reta(pontoAlto, esquerdaBaixo);

	}

	public static void aprenderPolimorfismoComInterface() {

		Humano lucas = new Humano();
		lucas.setNome("Lucas");
		lucas.apresentarSe();
		lucas.alimentar("Frango");
		lucas.locomover();
		lucas.comunicar("Viu só");

		Gato gato = new Gato("Vicente", new Pessoa("Marcela", (byte) 21, ""));
		gato.alimentar("Ração");
		gato.comunicar("Quero ração");
		gato.locomover();

		Capivara capivara = new Capivara();
		capivara.alimentar("Não sei");
		capivara.comunicar("nem fala");
		capivara.locomover();

		Planta planta = new Planta();
		planta.alimentar("nãosei");
		planta.comunicar("nãosei");
		planta.locomover();
		
		Formiga formiga = new Formiga();
		formiga.alimentar("Tudo");
		formiga.comunicar("ota");
		formiga.locomover();
		
		Peixe peixe = new Peixe();
		peixe.alimentar("Pão");
		peixe.comunicar("Blupe");
		peixe.locomover();
		
		Aviao aviao = new Aviao();
		aviao.setModelo("Boeing 737");
		System.out.println(aviao.getModelo() + aviao.freiar());
		aviao.acelerar(870f);
		

	}

}
