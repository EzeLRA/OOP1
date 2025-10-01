package Ejercicio8OO1.ejercicio10;

public abstract class Empleado {
	private String nombre;
	
	public Empleado(String nom) {
		this.nombre = nom;
	}
	
	public double montoBasico() {
		return 35000;
	}
	
	public double aportes() {
		return 13500;
	}
	
	public double sueldoBasico() {
		return this.montoBasico() + this.aportes();
	}
	
}
