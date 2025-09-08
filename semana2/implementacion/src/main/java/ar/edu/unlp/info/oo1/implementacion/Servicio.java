package ar.edu.unlp.info.oo1.implementacion;

public abstract class Servicio {
	
	private float tarifaMinima;
	private int horas;
	
	public float getCosto() {
		return this.tarifaMinima * this.horas;
	}
	
	public float getPrecioHora() {
		return this.tarifaMinima;
	}
	
}
