package ar.edu.unlp.info.oo1.ejercicio13;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Inversor {
	private List<Inversion> inversiones;
	
	public Inversor() {
		this.inversiones = new LinkedList();
	}
	
	public double getValorTotal() {
	    return this.inversiones.stream()
	        .mapToDouble(inv -> inv.getValorActual())
	        .sum();
	}
	
	public List<Inversion> getInversiones(){
		return this.inversiones;
	}
	
	public boolean invertir(Inversion inversion) {
		if (this.inversiones.isEmpty()) {
			this.inversiones.add(inversion);
			return true;
		}
		for(Inversion inv : this.getInversiones()){
			if(inv.equals(inversion)) {
				return false;
			}
		}
		this.inversiones.add(inversion);
		return true;
	}
	
	public boolean dejarInvertir(Inversion inversion) {
		for(Inversion inv : this.getInversiones()){
			if(inv.equals(inversion)) {
				this.inversiones.remove(inv);
				return true;
			}
		}
		return false;
	}
	
}
