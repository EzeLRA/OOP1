package ar.edu.unlp.info.oo1.ejercicio13;

public class InversionAccion extends Inversion{
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
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getValorActual() {
		return this.cantidad * this.valorUnitario;
	}

	public boolean equals(String nom) {
		return this.nombre.equals(nom);
	}
	
}
