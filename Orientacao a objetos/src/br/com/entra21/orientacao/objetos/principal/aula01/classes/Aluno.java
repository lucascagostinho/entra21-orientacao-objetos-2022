package br.com.entra21.orientacao.objetos.principal.aula01.classes;

import java.util.Scanner;

public class Aluno {
	// aqui ser� uma forma, onde ser� organizado e feito tudo que precisa para ela
	// definir atributos de um aluno e cada objeto(usa classe Aluno para serem
	// criados) ter� essas variaveis, chamadas de atributos
	public String nome;
	public byte idade;
	public byte quantidadePresencas;

	// na declara��o s� tem, acesso e tipo de retorno
	public Aluno() {// metodo(funcao) contrutor vazio que ao utilizar o (new Aluno) ele � executado

	}

	public byte responderChamada() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("O aluno " + this.nome + "es� ai?");
		String resposta = entrada.next();
		if (resposta.equalsIgnoreCase("sim")) {
			this.quantidadePresencas++;
			// this serve para reafirmar que estamos mencionando o atributo do meu objeto 
			
		}
		
		return this.quantidadePresencas;

	}

}
