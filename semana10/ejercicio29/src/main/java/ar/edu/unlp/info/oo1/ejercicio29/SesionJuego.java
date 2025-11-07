package ar.edu.unlp.info.oo1.ejercicio29;

import java.util.List;

public class SesionJuego extends Actividad{
	
	private int duracion;
	private List<Item> items;
	
	@Override
	public double costoFinal() {
		return (this.duracion > 360) ? this.items.stream().mapToDouble(item -> item.montoFinal()).sum() : 0 ;
	}
	
}
