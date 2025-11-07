package ar.edu.unlp.info.oo1.ejercicio29;

import java.util.List;

public class PlanIndividual extends Plan {
	
	private int minutosContratados;
	
	@Override
	public double precioBase() {
		return this.minutosContratados * 20.0;
	}

	@Override
	public double montoPenalizacion(DateLapse lapso) {
		List<Actividad> listado = this.actividades.stream().filter(a -> lapso.includesDate(a.getFecha())).toList();
		int total = (int) listado.stream().mapToInt(a -> (listado.stream().filter(ac -> ac.mismaFecha(a.getFecha())).toList().size())).filter(cant -> cant > 1).mapToLong(cant -> cant - 1).sum();
		return total * 300.0;
	}

	@Override
	public boolean tienePenalizacion(Cliente cli, DateLapse lapso) {
		List<Actividad> listado = this.actividades.stream().filter(a -> lapso.includesDate(a.getFecha())).toList();
		return listado.stream().anyMatch(a ->  (listado.stream().filter(ac -> ac.mismaFecha(a.getFecha())).count()) > 1 );
	}

}
