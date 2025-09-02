package ar.edu.unlp.info.oo1.ejercicio5;

public class Circulo {
	
	private float radio;
	private float diametro;
	
	public Circulo() {
		this.radio = 0;
		this.diametro = 0;
	}
	
	public float getDiametro() {
		return (this.diametro != 0.0)?(this.diametro):(this.radio*2);
	}
	
	public void setDiametro(float valor) {
		this.diametro = valor;
	}
	
	public float getRadio() {
		return this.radio;
	}
	
	public void setRadio(float valor) {
		this.radio = valor;
	}
	
	public float getPerimetro() {
		return (float) (Math.PI * (this.diametro));
	}
	
	public float getArea() {
		return (float) (Math.PI * (this.radio * this.radio));
	}
	
}
