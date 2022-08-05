package br.com.entra21.orientacao.a.objetos.principal.aula03.polimorfismo;

public class Atleta {
	private String name;
	private byte age;
	private int qtyWin;
	private int qtyLoss;

	public Atleta() {

	}

	public Atleta(String name, byte age, int qtyWin, int qtyLoss) {
		super();
		this.name = name;
		this.age = age;
		this.qtyWin = qtyWin;
		this.qtyLoss = qtyLoss;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public int getQtyWin() {
		return qtyWin;
	}

	public void setQtyWin(int qtyWin) {
		this.qtyWin = qtyWin;
	}

	public int getQtyLoss() {
		return qtyLoss;
	}

	public void setQtyLoss(int qtyLoss) {
		this.qtyLoss = qtyLoss;
	}
	
	public void comemorarVitoria() {
		System.out.println("Thanks God");
		this.qtyWin ++;
	}
	
	public void aprenderComDerrota() {
		System.out.println("Oh shit");
		this.qtyLoss++;
	}

}
