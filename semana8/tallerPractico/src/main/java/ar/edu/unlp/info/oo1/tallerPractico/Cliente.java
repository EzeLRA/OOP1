package ar.edu.unlp.info.oo1.tallerPractico;

import java.util.List;

public class Cliente {
	private List<Presupuesto> presupuestos;
		
	public void agregarPresupuesto(Presupuesto p) {
		this.presupuestos.add(p);
	}
	
	public double montoPresupuestos() {
		return this.presupuestos.stream().mapToDouble(p -> p.costoFinal()).sum();
	}
	
	public int cantPresupuestos() {
		return this.presupuestos.size();
	}
	
}
