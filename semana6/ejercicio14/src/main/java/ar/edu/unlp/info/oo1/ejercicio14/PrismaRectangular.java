package ar.edu.unlp.info.oo1.ejercicio14;

public class PrismaRectangular extends Pieza{
	private double ladoMayor;
	private double ladoMenor;
	private double altura;
	
	public PrismaRectangular(String mat,String col,double ladoMax,double ladoMin,double altura) {
		super(mat,col);
		this.ladoMayor = ladoMax;
		this.ladoMenor = ladoMin;
		this.altura = altura;
	}
	
	public double getVolumen() {
		return this.ladoMayor * this.ladoMenor * this.altura;
	}
	
	public double getSuperficie() {
		return 2 * (this.ladoMayor * this.ladoMenor + this.ladoMayor * this.altura + this.ladoMenor * this.altura);
	}
}
