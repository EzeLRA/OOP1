package ar.edu.unlp.info.oo1.ejercicio13;

import java.util.Date;
import java.util.List;

public class Inversor {
	private List<Inversion> inversiones;
	
	public double getValorTotal() {
	    return this.inversiones.stream()
	        .mapToDouble(inv -> inv.getValorActual())
	        .sum();
	}
	
	public List<Inversion> getInversiones(){
		return this.inversiones;
	}
	
	public boolean invertirAccion(String nom,int cant,double valor) {
		InversionAccion inversion = new InversionAccion(nom,cant,valor);
		if (!this.inversiones.contains(inversion)){
			this.inversiones.add(inversion);
			return true;
		}
		return false;
	}
	
	public boolean depositarPlazoFijo(Date fecha,double monto,double porcentaje) {
		InversionPlazoFijo inversion = new InversionPlazoFijo(fecha,monto,porcentaje);
		if (!this.inversiones.contains(inversion)){
			this.inversiones.add(inversion);
			return true;
		}
		return false;
	}
	
	public boolean dejarInvertirAccion(String nom) {
		for(Inversion inv : this.getInversiones()){
			if(inv.equals(nom)) {
				this.inversiones.remove(inv);
				return true;
			}
		}
		return false;
	}
	
	public boolean dejarInvertirPlazoFijo(Date fecha) {
		for(Inversion inv : this.getInversiones()){
			if(inv.equals(fecha)) {
				this.inversiones.remove(inv);
				return true;
			}
		}
		return false;
	}
	
}
