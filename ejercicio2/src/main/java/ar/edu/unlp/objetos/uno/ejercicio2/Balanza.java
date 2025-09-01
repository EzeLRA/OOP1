package ar.edu.unlp.objetos.uno.ejercicio2;

import java.time.LocalDate;

public class Balanza {
	private int cantidadDeProductos;
	private float precioTotal;
	private float pesoTotal;
	
	public Balanza(){
		this.ponerEnCero();
	}
	
	public void ponerEnCero(){
		this.precioTotal = 0;
		this.pesoTotal = 0;
		this.cantidadDeProductos = 0;
	}
	
	public void agregarProducto(Producto producto){
		this.cantidadDeProductos ++;
		this.pesoTotal += producto.getPeso();
		this.precioTotal += producto.getPrecio();
	}
	
	public Ticket emitirTicket(){
		return new Ticket(this.cantidadDeProductos,this.pesoTotal,this.precioTotal);
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
	
	
	
}
