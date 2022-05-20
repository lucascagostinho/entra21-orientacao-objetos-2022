package br.com.entra21.orientacao.objetos.principal.aula01.classes;

import java.util.Scanner;

public class Aluno {
	// aqui será uma forma, onde será organizado e feito tudo que precisa para ela
	// definir atributos de um aluno e cada objeto(usa classe Aluno para serem
	// criados) terá essas variaveis, chamadas de atributos
	public String nome;
	public byte idade;
	public byte quantidadePresencas;

	// na declaração só tem, acesso e tipo de retorno
	public Aluno() {// metodo(funcao) contrutor vazio que ao utilizar o (new Aluno) ele é executado

	}

	public byte responderChamada() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("O aluno " + this.nome + "esá ai?");
		String resposta = entrada.next();
		if (resposta.equalsIgnoreCase("sim")) {
			this.quantidadePresencas++;
			// this serve para reafirmar que estamos mencionando o atributo do meu objeto 
			
		}
		
		return this.quantidadePresencas;

	}

}
