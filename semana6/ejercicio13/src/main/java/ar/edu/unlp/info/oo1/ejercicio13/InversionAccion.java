package ar.edu.unlp.info.oo1.ejercicio13;

public class InversionAccion implements Inversion{
	private String nombre;
	private int cantidad;
	private double valorUnitario;
	
	public InversionAccion(String nom,int cant,double valor) {
		this.nombre = nom;
		this.cantidad = cant;
		this.valorUnitario = valor;
	}
	
	public void setCantidad(int cant) {
		this.cantidad = cant;
	}
	
	public void setValorUnitario(double valor) {
		this.valorUnitario = valor;
	}
		
	public int getCantidad() {
		return cantidad;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public double getValorActual() {
		return this.cantidad * this.valorUnitario;
	}

	public boolean equals(Inversion obj) {
		if (obj instanceof InversionAccion) {
			return this.nombre.equals(((InversionAccion) obj).getNombre());
		}
		return false;
	}
	
}
