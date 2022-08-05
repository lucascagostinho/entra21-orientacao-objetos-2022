package br.com.entra21.orientacao.a.objetos.principal.aula03.polimorfismo;

public class Nadador extends Atleta {
	private String ambienteAquatico;
	private String equipamentoAquatico;

	public Nadador() {
		super();
	}

	public Nadador(String ambienteAquatico, String equipamentoAquatico) {
		super();
		this.ambienteAquatico = ambienteAquatico;
		this.equipamentoAquatico = equipamentoAquatico;
	}

	public Nadador(String name, byte age, int qtyWin, int qtyLoss, String ambienteAquatico,
			String equipamentoAquatico) {
		super(name, age, qtyWin, qtyLoss);
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
	
	public void comemorarVitoria(String comemoracao) {
		this.setQtyWin(getQtyWin()+1);
		System.out.println(getName() + (comemoracao.isEmpty()?" splash splash * batendo na agua * splash splash": comemoracao));
	}

}
