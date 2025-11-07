package ar.edu.unlp.info.oo1.ejercicio29;

import java.time.LocalDate;
import java.util.List;

public abstract class Plan {
	
	protected List<Actividad> actividades;
	
	public abstract double precioBase();
	
	public abstract double montoPenalizacion(DateLapse lapso);
	
	public abstract boolean tienePenalizacion(Cliente cli,DateLapse lapso);
	
	public double montoActividades(DateLapse lapso){
		return this.actividades.stream().filter(a -> lapso.includesDate(a.getFecha()) ).mapToDouble(a -> a.costoFinal()).sum();
	}
	
}
