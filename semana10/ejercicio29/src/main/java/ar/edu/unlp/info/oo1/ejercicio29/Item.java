package ar.edu.unlp.info.oo1.ejercicio29;

public class Item {
	private String nombre;
	private int cantidad;
	private double precioUnidad;
	
	public double montoFinal() {
		return this.cantidad * this.precioUnidad;
	}
}
