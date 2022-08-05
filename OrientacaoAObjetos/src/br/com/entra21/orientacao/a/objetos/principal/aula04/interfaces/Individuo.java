package br.com.entra21.orientacao.a.objetos.principal.aula04.interfaces;

public interface Individuo {
	// interfaces contem apenas assinatura ou declaracao dos metodos, sem implementacao
	// a classe que implementar essa interface é obrigada a codificar o escopo de cada uma delas
	
	public void alimentar(String alimento);
	
	public void locomover();
	
	public void comunicar(String conteudo);
}
