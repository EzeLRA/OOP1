package ar.edu.unlp.info.oo1.ejercicio29;

public class ReproduccionVideo extends Actividad{
	
	private int duracionPublicidad;
	private int duracionTotal;
	
	public int duracionReal() {
		return this.duracionTotal - this.duracionPublicidad;
	}
	
	@Override
	public double costoFinal() {
		return 10 * this.duracionReal(); 
	}

}
