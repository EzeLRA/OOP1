package ar.edu.unlp.info.oo1.ejercicio29;

import java.time.Period;
import java.util.List;

public class PlanGrupal extends Plan{
	private int cantDireccionesIP;

	@Override
	public double precioBase() {
		return this.cantDireccionesIP * 800.0;
	}

	@Override
	public double montoPenalizacion(DateLapse lapso) {
		List<Actividad> listado = this.actividades.stream().filter(a -> lapso.includesDate(a.getFecha())).toList();
		int total = (int) listado.stream().mapToInt(a -> (listado.stream().filter(ac -> ac.mismaFecha(a.getFecha())).toList().size())).filter(cant -> cant > this.cantDireccionesIP).mapToLong(cant -> cant - this.cantDireccionesIP).sum();    
		return total * 500.0;
	}

	@Override
	public boolean tienePenalizacion(Cliente cli, DateLapse lapso) {
		if(Period.between(cli.getFechaAlta(), lapso.getFrom()).getYears() > 10) {
			return false;
		}
		return true;
	}
	
}
