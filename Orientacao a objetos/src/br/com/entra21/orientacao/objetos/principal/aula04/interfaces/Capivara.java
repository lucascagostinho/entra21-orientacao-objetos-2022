package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Capivara implements Individuo {
	//qunado n�o escrevo meu construtor vazio, � porque ele j� tem como padr�o
	// porem quando eu crio meu contrutor customizado eu perco o meu padr�o e tenho que cirar o vazio
	@Override
	public void alimentar(String alimento) {
		System.out.println("A capivara come mato e" + alimento);
		
	}

	@Override
	public void locomover() {
		System.out.println("A capivara anda, come e nada");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println("A capivcara n�o se comunica" + conteudo);
		
	}

}
