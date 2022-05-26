package br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo;

public class Nadador extends Atleta {

	private String ambienteAquatico;
	private String equipamentoAquatico;

	public Nadador() {

	}

	public Nadador(String ambienteAquatico, String equipamentoAquatico) {
		super();
		this.ambienteAquatico = ambienteAquatico;
		this.equipamentoAquatico = equipamentoAquatico;
	}

	public String getAmbienteAquatico() {
		return ambienteAquatico;
	}

	public void setAmbienteAquatico(String ambienteAquatico) {
		this.ambienteAquatico = ambienteAquatico;
	}

	public String getEquipamentoAquatico() {
		return equipamentoAquatico;
	}

	public void setEquipamentoAquatico(String equipamentoAquatico) {
		this.equipamentoAquatico = equipamentoAquatico;
	}

	public Nadador(String name, byte age, int qtdWin, int qtdLoss, String ambienteAquatico,
			String equipamentoAquatico) {
		super(name, age, qtdWin, qtdLoss);
		this.ambienteAquatico = ambienteAquatico;
		this.equipamentoAquatico = equipamentoAquatico;

	}
	// o padr�o de polimorfismo � herdar, a segunda forma � fazer completamente do meu jeito, o que eu herdei 
	public void comemorarVitoria() {
		setQtdWin(getQtdWin() + 1);
		System.out.println("comemorando com setQtdWin(getQtdWin() + 1);");
		// possuo esse m�todo dentro de Atleta, com o o polimorfismo ele busca primeiro
		// na classe, se n�o tiver, ele vai na heran�a
		// comemorar vitoria j� existe na super classe, mas se eu criar com mesmo nome e
		// vizibilidade e tipo de reotnro e argumeentos
		// o metodo excolhido ser� esse aqui e n�o o da super classe
	}

}
