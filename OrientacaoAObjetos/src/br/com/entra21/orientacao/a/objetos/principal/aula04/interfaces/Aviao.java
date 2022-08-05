package br.com.entra21.orientacao.a.objetos.principal.aula04.interfaces;

public class Aviao implements Veiculo {
	private String modelo;
	
	public Aviao() {
		
	}

	public Aviao(String modelo) {
		super();
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String frear() {
		// TODO Auto-generated method stub
		return "Aviao freia como? usar Flap";
	}

	@Override
	public void acelerar() {
		System.out.println("ran dan dan dan dan");
		
	}
	
	
}
