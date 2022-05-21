package br.com.entra21.orientacao.objetos.principal.aula01.classes;

public class Professor {

	//atributos static são de dominio da classe e não de cada objeto
	//então nenhum objeto dessa classe tem esse tipo de atributo
	//para fazer acesso static basta informar a classe.oquevcqqquer, sem utilizar o new
	public static String instituicao = "Proway";

	// atributos devem ser private e se possível criar get e set para quem realmente
	// precisa
	private String nome;
	private int idade;
	private byte quantidadeAlunos;

	public Professor() {
		// construtor vazio não inicializa os atributos
	}

	public Professor(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		// contrutor com parametros pode inicializar alguns ou todos atributos
	}

	public String getNome() { // ler o valor lpa fora
		return this.nome;
	}

	public void setNome(String nome) { // receber um valor lá de fora
		this.nome = nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
