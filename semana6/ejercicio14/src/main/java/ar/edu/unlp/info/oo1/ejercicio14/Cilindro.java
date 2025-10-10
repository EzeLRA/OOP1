package ar.edu.unlp.info.oo1.ejercicio14;

public class Cilindro extends Pieza{
	private double radio;
	private double altura;
	
	public Cilindro(String mat,String col,double rad,double altura) {
		super(mat,col);
		this.radio = rad;
		this.altura = altura;
	}
	
	public double getVolumen() {
		return Math.PI * Math.pow(this.radio, 2) * this.altura;
	}
	
	public double getSuperficie() {
		return 2 * Math.PI * this.radio * this.altura + 2 * Math.PI * Math.pow(this.radio, 2); 
	}
	
}
