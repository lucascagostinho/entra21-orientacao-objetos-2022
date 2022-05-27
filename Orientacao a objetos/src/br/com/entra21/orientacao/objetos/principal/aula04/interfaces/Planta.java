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
		System.out.println(this.nomeCientifico + "eu não priciso de " + alimento + " pois faço fotosíntese");
		
	}

	@Override
	public void locomover() {
		System.out.println(this.nomeCientifico + " não preciso me mexer");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println(this.nomeCientifico + " Planta não fala!" + conteudo
				);
		
	}

}
