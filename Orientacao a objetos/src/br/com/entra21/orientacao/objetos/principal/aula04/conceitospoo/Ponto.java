package br.com.entra21.orientacao.objetos.principal.aula04.conceitospoo;

public class Ponto {
	private float coordenadaX;
	private float coorddenadaY;

	public Ponto() {
		super();
	}

	public Ponto(float coordenadaX, float coorddenadaY) {
		super();
		this.coordenadaX = coordenadaX;
		this.coorddenadaY = coorddenadaY;
	}

	public float getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(float coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public float getCoorddenadaY() {
		return coorddenadaY;
	}

	public void setCoorddenadaY(float coorddenadaY) {
		this.coorddenadaY = coorddenadaY;
	}

}
