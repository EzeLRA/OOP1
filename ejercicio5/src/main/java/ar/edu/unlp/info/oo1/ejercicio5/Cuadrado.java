package ar.edu.unlp.info.oo1.ejercicio5;

public class Cuadrado extends Figura2D{
	
	private double lado;
	
	public Cuadrado() {
		this.lado = 0;
	}
	
	public void setLado(double valor) {
		this.lado = valor;
	}
	
	public double getLado() {
		return this.lado;
	}
	
	public double getPerimetro() {
		return 4 * this.lado;
	}
	
	public double getArea() {
		return this.lado * this.lado;
	}
	
}
