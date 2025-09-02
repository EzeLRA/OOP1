package ar.edu.unlp.info.oo1.ejercicio4;

import java.time.LocalDate;
import java.util.Date;

public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private float pesoTotal;
	private float precioTotal;
	
	public Ticket(int cantProds,float pesoT,float precioT) {
		this.fecha = LocalDate.now();
		this.cantidadDeProductos = cantProds;
		this.pesoTotal = pesoT;
		this.precioTotal = precioT;
	}
	
	public float impuesto(){
		return (float) (this.precioTotal * 0.21);
	}

	public float getPesoTotal() {
		return this.pesoTotal;
	}

	public float getPrecioTotal() {
		return this.precioTotal;
	}

	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}

	public LocalDate getFecha() {
		return this.fecha;
	}
}
