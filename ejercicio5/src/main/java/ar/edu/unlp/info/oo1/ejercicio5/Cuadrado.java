package ar.edu.unlp.info.oo1.ejercicio5;

public class Cuadrado extends Figura2D{
	
	private float lado;
	
	public Cuadrado() {
		this.lado = 0;
	}
	
	public void setLado(float valor) {
		this.lado = valor;
	}
	
	public float getLado() {
		return this.lado;
	}
	
	public float getPerimetro() {
		return 4 * this.lado;
	}
	
	public float getArea() {
		return this.lado * this.lado;
	}
	
}
