package br.com.entra21.orientacao.a.objetos.principal.aula04.interfaces;

import br.com.entra21.orientacao.a.objetos.principal.aula02.heranca.Pessoa;

public class Gato implements Individuo{
	private String nomeMimi;
	private Pessoa dono;
	
	public Gato() {
		
	}

	public Gato(String nomeMimi, Pessoa dono) {
		super();
		this.nomeMimi = nomeMimi;
		this.dono = dono;
	}

	public String getNomeMimi() {
		return nomeMimi;
	}

	public void setNomeMimi(String nomeMimi) {
		this.nomeMimi = nomeMimi;
	}

	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	@Override
	public void alimentar(String alimento) {
		System.out.println(this.nomeMimi + " meow, posso nao gostar disso, mas meu dono " + this.dono.getName() + "so me da" + alimento);
		
	}

	@Override
	public void locomover() {
		System.out.println(this.nomeMimi + " prefiro amimir");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println(this.nomeMimi + " meow meow meow, traduzindo conteudo");
		
	}
	
	
}
