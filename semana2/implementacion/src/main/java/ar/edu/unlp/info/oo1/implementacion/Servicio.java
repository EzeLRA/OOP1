package ar.edu.unlp.info.oo1.implementacion;

public abstract class Servicio {
	
	private float tarifaMinima;
	
	public Servicio(float tarifaMinima) {
		this.tarifaMinima = tarifaMinima;
	}

	public abstract float getCosto(int horas);
	
	public float getPrecioHora() {
		return this.tarifaMinima;
	}
	
}
