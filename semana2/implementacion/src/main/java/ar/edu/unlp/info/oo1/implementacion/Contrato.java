package ar.edu.unlp.info.oo1.implementacion;

import java.time.LocalDate;

public abstract class Contrato {
	private LocalDate fecha;
	private Servicio servicio;
	
	public Contrato(LocalDate fecha, Servicio servicio) {
		this.fecha = fecha;
		this.servicio = servicio;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public Servicio getServicio() {
		return this.servicio;
	}
	
	public abstract float obtenerMonto();
	
}
