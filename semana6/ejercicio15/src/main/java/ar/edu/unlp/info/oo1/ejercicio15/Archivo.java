package ar.edu.unlp.info.oo1.ejercicio15;

public class Archivo {
	private String nombre;
	
	public Archivo(String nom) {
		this.nombre = nom;
	}
	
	public int tamaño() {
		return this.nombre.length();
	}
	
}
