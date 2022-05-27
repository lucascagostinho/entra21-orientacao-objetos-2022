package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Planta implements Individuo {
	
	private String nomeCientifico;
	
	public Planta() {
		
	}

	public String getNomeCientifico() {
		return nomeCientifico;
	}

	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}

	@Override
	public void alimentar(String alimento) {
		System.out.println(this.nomeCientifico + "eu n�o priciso de " + alimento + " pois fa�o fotos�ntese");
		
	}

	@Override
	public void locomover() {
		System.out.println(this.nomeCientifico + " n�o preciso me mexer");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println(this.nomeCientifico + " Planta n�o fala!" + conteudo
				);
		
	}

}
