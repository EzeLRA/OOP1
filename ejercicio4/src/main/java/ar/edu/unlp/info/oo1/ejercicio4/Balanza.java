package ar.edu.unlp.info.oo1.ejercicio4;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Balanza {
	private LinkedList<Producto> productos;
	
	public Balanza(){
		this.productos = new LinkedList<Producto>();
	}
	
	public void ponerEnCero(){
		this.productos.clear();
	}
	
	public void agregarProducto(Producto producto){
		this.productos.add(producto);
	}
	
	public Ticket emitirTicket(){
		return new Ticket(this.getCantidadDeProductos(),this.getPesoTotal(),this.getPrecioTotal());
	}

	public float getPesoTotal() {
		float pesoTotal = 0;
		for(Producto p : this.productos){
			pesoTotal += p.getPeso();
		}
		return pesoTotal;
	}

	public float getPrecioTotal() {
		float precioTotal = 0;
		for(Producto p : this.productos){
			precioTotal += p.getPrecio();
		}
		return precioTotal;
	}
	
	public List<Producto> getProductos(){
		return this.productos;
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
}
