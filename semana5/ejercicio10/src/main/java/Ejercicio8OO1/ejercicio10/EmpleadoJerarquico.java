package Ejercicio8OO1.ejercicio10;

public class EmpleadoJerarquico extends Empleado{
	
	public EmpleadoJerarquico(String nom) {
		super(nom);
	}
	
	public double sueldoBasico() {
		return super.sueldoBasico() + this.bonoPorCategoria();
	}
	
	public double montoBasico() {
		return 45000;
	}
	
	public double bonoPorCategoria() {
		return 8000;
	}
}
