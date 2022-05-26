package br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo;

public class Velocista extends Atleta{

	private String tipoPista;
	private String marcaCalcado;

	public Velocista() {
		super();
	}

	public Velocista(String tipoPista, String marcaCalcado) {
		super();
		this.tipoPista = tipoPista;
		this.marcaCalcado = marcaCalcado;
	}

	public String getTipoPista() {
		return tipoPista;
	}

	public void setTipoPista(String tipoPista) {
		this.tipoPista = tipoPista;
	}

	public String getMarcaCalcado() {
		return marcaCalcado;
	}

	public void setMarcaCalcado(String marcaCalcado) {
		this.marcaCalcado = marcaCalcado;
	}

	@Override
	public void comemorarVitoria() {
		// TODO Auto-generated method stub
		super.comemorarVitoria();
		System.out.println("MEU NOMEEEEE!" + getName() + "isso ai");
	}
	
	

}
