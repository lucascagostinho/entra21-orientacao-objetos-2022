package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.aula01.classes.Aluno;
import br.com.entra21.orientacao.objetos.principal.aula01.classes.Professor;

public class Main {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Professor professorJava = new Professor();
		
		Professor professiraIngles = new Professor("Isabelle", 25);
		
		System.out.println("Nome dela = " +professiraIngles.getNome());
		
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

}
