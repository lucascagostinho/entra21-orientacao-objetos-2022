package br.com.entra21.orientacao.a.objetos.principal.aula04.interfaces;

public class Capivara implements Individuo{
	// quando não escrevo meu construtor vazio, e pq ele ja existe por padrao
	// quando eu nao crio um construtor customizado, eu perco meu construtor padrao e sou obrigado a criar um manualmente
	@Override
	public void alimentar(String alimento) {
		System.out.println("A capivara come mato e " + alimento);
		
	}

	@Override
	public void locomover() {
		System.out.println("A capivara anda, corre e nada");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println("...");
		
	}
	
}
