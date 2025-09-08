package ar.edu.unlp.info.oo1.implementacion;

import java.time.LocalDate;

public abstract class Contrato {
	private LocalDate fecha;
	
	public abstract float obtenerMonto();
	
}
