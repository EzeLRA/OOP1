package ar.edu.unlp.info.oo1.ejercicio5;

public class Circulo extends Figura2D{
	
	private double radio;
	private double diametro;
	
	public Circulo() {
		this.radio = 0;
		this.diametro = 0;
	}
	
	public double getDiametro() {
		return (this.diametro != 0.0)?(this.diametro):(this.radio*2);
	}
	
	public void setDiametro(double valor) {
		this.diametro = valor;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public void setRadio(double valor) {
		this.radio = valor;
	}
	
	public double getPerimetro() {
		return Math.PI * this.getDiametro();
	}
	
	public double getArea() {
		return Math.PI * (this.radio * this.radio);
	}
	
}
