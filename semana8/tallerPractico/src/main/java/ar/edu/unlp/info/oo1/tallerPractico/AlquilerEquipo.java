package ar.edu.unlp.info.oo1.tallerPractico;

public class AlquilerEquipo implements Servicio{
	private String nombreEquipo;
	private int cantDias;
	private double costoPorDia;
	
	public double costoTotal() {
		return this.costoPorDia * this.cantDias;
	}
	
}
