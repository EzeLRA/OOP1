package ar.edu.unlp.info.oo1.implementacion;

public class Parquizacion extends Servicio{
	
	private int cantMaquinas;
	private float costoMantenimiento;
	
	public Parquizacion(float tarifaMinima,int cantM,float costoM) {
		super(tarifaMinima);
		this.cantMaquinas = cantM;
		this.costoMantenimiento = costoM;
	}
	
	public float getCosto(int horas) {
		float costo = this.getPrecioHora() * horas;
		return costo + (this.cantMaquinas * this.costoMantenimiento);
	}
	
}
