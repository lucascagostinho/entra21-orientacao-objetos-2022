package br.com.entra21.orientacao.a.objetos.principal.aula04.interfaces;

import br.com.entra21.orientacao.a.objetos.principal.aula02.heranca.Pessoa;

public class Cachorro implements Individuo {
	private String nomeCatioro;
	private Pessoa donoCatioro;
	
	public Cachorro() {
		
	}

	public Cachorro(String nomeCatioro, Pessoa donoCatioro) {
		super();
		this.nomeCatioro = nomeCatioro;
		this.donoCatioro = donoCatioro;
	}

	public String getNomeCatioro() {
		return nomeCatioro;
	}

	public void setNomeCatioro(String nomeCatioro) {
		this.nomeCatioro = nomeCatioro;
	}

	public Pessoa getDonoCatioro() {
		return donoCatioro;
	}

	public void setDonoCatioro(Pessoa donoCatioro) {
		this.donoCatioro = donoCatioro;
	}

	@Override
	public void alimentar(String alimento) {
		System.out.println(this.nomeCatioro + " au au, posso nao gostar disso, mas meu dono " + this.donoCatioro.getName() + "so me da" + alimento);
		
	}

	@Override
	public void locomover() {
		System.out.println(this.nomeCatioro + " vamos brincar?????");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println(this.nomeCatioro + " au au eu sou legal");
		
	}
}
