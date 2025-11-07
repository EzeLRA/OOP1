package ar.edu.unlp.info.oo1.ejercicio29;

import java.time.LocalDate;

public abstract class Actividad {
	protected String direccionIP;
	protected LocalDate fechaInicio;
	
	public abstract double costoFinal();
	
	public LocalDate getFecha() {
		return this.fechaInicio;
	}
	
	public boolean mismaFecha(LocalDate f) {
		return this.fechaInicio.isEqual(f);
	}
	
}
