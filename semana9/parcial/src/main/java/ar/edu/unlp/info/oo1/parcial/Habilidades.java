package ar.edu.unlp.info.oo1.parcial;

public class Habilidades {
	private double inteligencia;
	private double fuerza;
	
	public Habilidades(double val1,double val2) {
		this.inteligencia = val1;
		this.fuerza = val2;
	}
	
	public void aumentarInteligencia(double val) {
		this.inteligencia += val ;
	}
	
	public void aumentarFuerza(double val) {
		this.fuerza += val;
	}

	public double getInteligencia() {
		return inteligencia;
	}

	public double getFuerza() {
		return fuerza;
	}
	
}
