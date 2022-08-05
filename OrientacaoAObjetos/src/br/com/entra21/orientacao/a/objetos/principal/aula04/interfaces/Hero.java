package br.com.entra21.orientacao.a.objetos.principal.aula04.interfaces;

import br.com.entra21.orientacao.a.objetos.principal.aula02.heranca.Pessoa;

public class Hero extends Pessoa implements Individuo{
	private String superPower;
	private String superHeroName;
	
	public Hero() {
		super();
	}
	
	public Hero(String superPower, String superHeroName) {
		super();
		this.superPower = superPower;
		this.superHeroName = superHeroName;
	}

	public String getSuperPower() {
		return superPower;
	}

	public void setSuperHeroName(String superHeroName) {
		this.superHeroName = superHeroName;
	}
	
	public String getSuperHeroName() {
		return superHeroName;
	}

	public void setSuperPower(String superPower) {
		this.superPower = superPower;
	}


	@Override
	public void alimentar(String alimento) {
		System.out.println(this.getName() + " gasta mta energia, o que vier nois mata!");
		
	}

	@Override
	public void locomover() {
		System.out.println(this.superHeroName + " é incrivel, pode andar, correr, nadar e voar");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println(this.superHeroName + " disse que e poliglota");
		
	}
	
	
}
