package ar.edu.unlp.info.oo1.ejercicio5;

public class Cuerpo3D {
	
	private float altura;
	private Figura2D caraBasal;
	
	public void setAltura(float valor) {
		this.altura = valor;
	}
	
	public float getAltura() {
		return this.altura;
	}
	
	public void setCaraBasal(Figura2D cara) {
		this.caraBasal = cara;
	}
	
	public double getVolumen() {
		return this.getSuperficieExterior() * this.altura;
	}
	
	public double getSuperficieExterior() {
		return 2 * this.caraBasal.getArea() + this.caraBasal.getPerimetro() * this.altura;
	}
	
}
