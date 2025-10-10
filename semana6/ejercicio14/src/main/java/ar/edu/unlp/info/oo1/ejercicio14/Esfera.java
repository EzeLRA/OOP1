package ar.edu.unlp.info.oo1.ejercicio14;

public class Esfera extends Pieza{
	private double radio;
	
	public Esfera(String mat,String col,double rad) {
		super(mat,col);
		this.radio = rad;
	}
	
	public double getVolumen() {
		return ((4 * Math.PI * Math.pow(this.radio, 3))/3); 
	}
	
	public double getSuperficie() {
		return 4 * Math.PI * Math.pow(this.radio, 2);
	}
	
}
