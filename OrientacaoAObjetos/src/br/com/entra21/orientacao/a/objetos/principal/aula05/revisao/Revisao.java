package br.com.entra21.orientacao.a.objetos.principal.aula05.revisao;

import java.util.Scanner;

public class Revisao {
	static Scanner input = new Scanner(System.in);
	static Professor oliota;

	public static void revisar() {
		byte opcao;

		gerarDados();

		do {
			System.out.println("Escolha uma opcao:");
			System.out.println("0 - Sair");
			System.out.println("1 - Revisar");

			opcao = input.nextByte();

			switch (opcao) {
			case 0:
				System.out.println("See ya");
				break;
			case 1:
				break;

			default:
				System.out.println("Opcao invalida parça");
				break;
			}
		} while (opcao != 0);
	}

	private static void gerarDados() {
		oliota = new Professor("Rubem", (byte) 33, "000.000.000-00");
	}
}
