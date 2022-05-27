package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Peixe implements Individuo{

	@Override
	public void alimentar(String alimento) {
		System.out.println("O peixe se alimenta de " + alimento);
		
	}

	@Override
	public void locomover() {
		System.out.println("O peixe se locomove nadando");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println("O peixe se comunica " + conteudo);
		
	}

}
