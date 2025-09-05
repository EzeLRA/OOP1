package ar.edu.unlp.info.oo1.ejercicio4;

import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Ticket {
	private LocalDate fecha;
	private List<Producto> detalle;
	private float pesoTotal;
	private float precioTotal;
	
	public Ticket(List<Producto> prods) {
		this.fecha = LocalDate.now();
		this.detalle = new LinkedList<Producto>();
		this.pesoTotal = 0;
		this.precioTotal = 0;
		if(!prods.isEmpty()) {
			for(Producto p : prods){
				this.pesoTotal += p.getPeso();
				this.precioTotal += p.getPrecio();
				this.detalle.add(p);
			}
		}
		
	}
	
	public float impuesto(){
		return (float) (this.precioTotal * 0.21);
	}
	
	public List<Producto> getProductos(){
		return this.detalle;
	}
	
	public float getPesoTotal() {
		return this.pesoTotal;
	}

	public float getPrecioTotal() {
		return this.precioTotal;
	}

	public int getCantidadDeProductos() {
		return this.detalle.size();
	}

	public LocalDate getFecha() {
		return this.fecha;
	}
}
