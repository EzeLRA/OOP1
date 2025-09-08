package ar.edu.unlp.info.oo1.implementacion;

public class Limpieza extends Servicio{
	
	public Limpieza(float tarifaMinima) {
		super(tarifaMinima);
	}

	public float getCosto(int horas) {
		float costo = this.getPrecioHora() * horas;
		return (costo > this.getPrecioHora()) ? (costo) : (this.getPrecioHora());
	}

}
