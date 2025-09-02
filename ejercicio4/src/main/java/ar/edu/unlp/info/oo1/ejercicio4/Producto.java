package ar.edu.unlp.info.oo1.ejercicio4;

import java.time.LocalDate;

public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	public Producto(String desc,double d,float precio){
		this.descripcion = desc;
		this.peso = d;
		this.precioPorKilo = precio;
	}
	
	public double getPrecio(){
		return this.peso * this.precioPorKilo;
	}
	
	public String getDescripcion(){
		return this.descripcion;
	}
	
	public double getPeso(){
		return this.peso;
	}
	
	public double getPrecioPorKilo(){
		return this.precioPorKilo;
	}
	
	public void setPrecioPorKilo(double precio) {
		this.precioPorKilo = precio;
	}
}
