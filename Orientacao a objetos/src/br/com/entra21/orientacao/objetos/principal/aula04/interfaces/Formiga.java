package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Formiga implements Individuo {
	
	public Formiga() {
		
	}

	@Override
	public void alimentar(String alimento) {
		System.out.println("A formiga se alimenta de " + alimento);
		
	}

	@Override
	public void locomover() {
		System.out.println("A formiga se move com as patas");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println("A fomiga fala " + conteudo);
		
	}
	
	

}
