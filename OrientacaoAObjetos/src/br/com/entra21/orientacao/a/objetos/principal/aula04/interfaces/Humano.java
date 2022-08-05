package br.com.entra21.orientacao.a.objetos.principal.aula04.interfaces;

import br.com.entra21.orientacao.a.objetos.principal.aula02.heranca.Pessoa;

public class Humano extends Pessoa implements Individuo{
	
	public Humano() {
		
	}
	
	public void apresentarSe() {
		System.out.println("Oi, meu nome e: " + getName());
	}

	@Override
	public void alimentar(String alimento) {
		System.out.println(getName() + " pode comer de tudo, inclusive " + alimento);
		
	}

	@Override
	public void locomover() {
		System.out.println(getName() + " pode andar e correr, as vezes ate nadar");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println(getName() + " sou especial pois sou o unico que oide falar");
		System.out.println(conteudo);
	}
}
