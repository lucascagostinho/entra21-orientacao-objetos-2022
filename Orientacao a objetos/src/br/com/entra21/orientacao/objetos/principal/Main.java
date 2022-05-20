package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.aula01.classes.Aluno;

public class Main {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {

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

}
