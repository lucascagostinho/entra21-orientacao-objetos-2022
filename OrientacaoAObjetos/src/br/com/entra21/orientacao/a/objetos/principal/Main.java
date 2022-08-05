package br.com.entra21.orientacao.a.objetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.a.objetos.principal.aula01.classes.Aluno;
import br.com.entra21.orientacao.a.objetos.principal.aula01.classes.Professor;
import br.com.entra21.orientacao.a.objetos.principal.aula02.heranca.Diretor;
import br.com.entra21.orientacao.a.objetos.principal.aula02.heranca.Funcionario;
import br.com.entra21.orientacao.a.objetos.principal.aula02.heranca.Pessoa;
import br.com.entra21.orientacao.a.objetos.principal.aula03.polimorfismo.Atleta;
import br.com.entra21.orientacao.a.objetos.principal.aula03.polimorfismo.Nadador;
import br.com.entra21.orientacao.a.objetos.principal.aula03.polimorfismo.Velocista;
import br.com.entra21.orientacao.a.objetos.principal.aula04.conceitos.poo.Ponto;
import br.com.entra21.orientacao.a.objetos.principal.aula04.conceitos.poo.Reta;
import br.com.entra21.orientacao.a.objetos.principal.aula04.interfaces.Aviao;
import br.com.entra21.orientacao.a.objetos.principal.aula04.interfaces.Cachorro;
import br.com.entra21.orientacao.a.objetos.principal.aula04.interfaces.Capivara;
import br.com.entra21.orientacao.a.objetos.principal.aula04.interfaces.Gato;
import br.com.entra21.orientacao.a.objetos.principal.aula04.interfaces.Hero;
import br.com.entra21.orientacao.a.objetos.principal.aula04.interfaces.Humano;
import br.com.entra21.orientacao.a.objetos.principal.aula04.interfaces.Planta;
import br.com.entra21.orientacao.a.objetos.principal.aula05.revisao.Revisao;


public class Main {

	// o objeto da classe Scanner esta na variavel de entrada, então é um obj
	// porem o System.in é uma chamada static pq
	// para acessar o in do System nao precisei dar new
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		byte opcao;
		System.out.println("aprendendo sobre orientação a objetos");

		do {
			System.out.println("Escolha uma opção");
			System.out.println("0 - Sair");
			System.out.println("1 - Classes e objetos");
			System.out.println("2 - Herança");
			System.out.println("3 - Polimorfismo");
			System.out.println("4 - Aprender conceitos POO");
			System.out.println("5 - Aprender polimorfismo com interface");
			System.out.println("6 - Revisar POO");
			opcao = entrada.nextByte();

			switch (opcao) {
			case 0:

				break;
			case 1:
				aprenderClasses();
				break;
				
			case 2:
				aprenderHeranca();
				break;
				
			case 3:
				aprenderPolimorifsmo();
				break;
				
			case 4:
				aprenderConceitosPOO();
				break;
				
			case 5:
				aprenderPolimorfismoInterface();
				break;	
			case 6: 
				revisarPOO();
			default:
				System.out.println("C'monnnnnnnn :(");
				break;
			}

		} while (opcao != 0);

	}

	
	private static void aprenderClasses() {
		// instanciando um objeto da classe Professor na variavel professorJava
		Professor professorJava = new Professor();

		// instanciando um objeto da classe Professor na variavel professoraIngles
		Professor professoraIngles = new Professor("Isabelle", (byte) 30);

		// Acessando os atributos com encapsulamento
		System.out.println("Nome dela = " + professoraIngles.getNome());
		professoraIngles.setNome("Isabelle 2");
		System.out.println("agora o nome  dela = " + professoraIngles.getNome());
		System.out.println("A idade dela é " + professoraIngles.getIdade());

		// Acessando o atributo estático da Classe Professor, atributos estáticos ou
		// metodos estatico não pertencem aos objetos da Classe
		// dessa forma é possivel acessar em a necessidade de criar um objeto com new
		System.out.println("Os professoes trabalham na " + Professor.instituicao);

		// Criando varios objetos da classe Aluno nas variaveis
		// cada variavel é independente e possui seus atributos e metodos
		Aluno alunoTeste = new Aluno();
		Aluno outroAluno = new Aluno();
		Aluno alunoNovato = new Aluno();
		Aluno alunoObjeto;
		alunoObjeto = new Aluno();

		// as alterações aqui só afetam esse objeto
		alunoObjeto.idade = 18;

		// as alterações aqui só afetam esse objeto
		alunoTeste.nome = "Rubem";
		alunoTeste.idade = 33;

		// as alterações aqui só afetam esse objeto
		outroAluno.idade = 18;
		outroAluno.nome = "Visitante";

		// Executando varias vezes o metodo desse objeto
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();

		// Interagindo com o usuario para preencher os atributos do Aluno que ainda não
		// tem encapsulamento
		System.out.println("Qual o nome do aluno novato?");
		alunoNovato.nome = entrada.next();

		System.out.println("Qual a idade do " + alunoNovato.nome + "?");
		alunoNovato.idade = entrada.nextByte();

		System.out.println("Bem vindo " + alunoNovato.nome);

	}

	private static void aprenderHeranca() {
		 //aprender herança
		Funcionario funcionario1 = new Funcionario();		
		funcionario1.setIdade((byte)22);
		//funcionario1.setNome("Ariana");
		funcionario1.setCargoAtual("Analista de suporte");
		funcionario1.setSalario(1500.00f);
		
		//System.out.println("Oi meu nome e: " + funcionario1.getNome() + "e tenho " + funcionario1.getIdade() + "anos.");
		
		//Funcionario funcionario2 = new Funcionario("Steven Rogers", (byte)84, "Primeiro Vingador", 18555.33f);
		
		Diretor diretor1 = new Diretor();
		diretor1.realizarApresentacao();
		
		Diretor diretor2 = new Diretor();
		diretor2.realizarApresentacao();
		
		Diretor diretor3 = new Diretor("Paulo", (byte) 30);
		diretor3.realizarApresentacao();

	}

	private static void aprenderPolimorifsmo() {
		Atleta cr7 = new Atleta();
		cr7.setName("Cristianinho");
		cr7.comemorarVitoria();
		cr7.aprenderComDerrota();
		
		Nadador aquaman = new Nadador("Arthur Joseph Curry", (byte)25, 15, 15, "Mar", "Tridente");
		aquaman.comemorarVitoria("");
		aquaman.aprenderComDerrota();
		aquaman.setName("Arthur Joseph Curry");
		
		Velocista flash = new Velocista();
		flash.setMarcaCalcado("Converse");  
		flash.setName("Barry Allen");
		flash.comemorarVitoria();
		flash.aprenderComDerrota();
	}
	
	private static void aprenderConceitosPOO() {
		// A classe Ponto tem alta coesao pois ele e preciso nas suas responsabilidades
		Ponto pontoAlto = new Ponto(30, 10000);
		Ponto esquerdaBaixo = new Ponto(-20, -100);
		
		// A classe Reta e agregada por pontos que podem nao estar incializados
		// A associacao de reta e ponto e de 1 para muitos, respectivamente 
		Reta torta = new Reta();
		Reta diagonal = new Reta(pontoAlto, esquerdaBaixo);
	}
	
	private static void aprenderPolimorfismoInterface() {
		Humano ariana = new Humano();
		ariana.setName("Ariana");
		
		ariana.apresentarSe();
		ariana.alimentar("Macarroni");
		ariana.locomover();
		ariana.comunicar("Hola que tal ?");
		
		Gato vezu = new Gato("Abobora", new Pessoa("Ariana", (byte) 22, ""));
		vezu.alimentar("Racao");
		vezu.comunicar("Quero papar");
		vezu.locomover();
		
		Capivara robson = new Capivara();
		robson.alimentar("agua");
		robson.comunicar("");
		robson.locomover();
		
		Planta maracuja = new Planta(" Passiflora edulis Sims");
		maracuja.alimentar("chocolatin");
		maracuja.comunicar("Tá sol ai?");
		maracuja.locomover();
		
		Cachorro thor = new Cachorro("Thor", new Pessoa("Ariana", (byte) 22, ""));
		thor.alimentar("o que vier");
		thor.comunicar("joga a bolinha humano otario");
		thor.locomover();
		
		Hero superHeroiSensacional = new Hero("todos", "Super Heroi Heroico");
		superHeroiSensacional.alimentar("exatamente tudo");
		superHeroiSensacional.comunicar("Eu sou a força");
		superHeroiSensacional.locomover();
		
		Aviao comercial = new Aviao();
		comercial.setModelo("Boeing 737");
		System.out.println(comercial.frear());
		comercial.acelerar();
	}
	
	private static void revisarPOO() {
		Revisao.revisar();
	}

}
