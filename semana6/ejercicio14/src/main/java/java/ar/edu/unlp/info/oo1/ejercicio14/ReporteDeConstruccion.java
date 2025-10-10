package java.ar.edu.unlp.info.oo1.ejercicio14;

import java.util.LinkedList;
import java.util.List;

public class ReporteDeConstruccion {
	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		this.piezas = new LinkedList();
	}
	
	public void agregarPieza(Pieza pieza) {
		this.piezas.add(pieza);
	}
	
	public double volumenDeMaterial(String material) {
		return this.piezas.stream().mapToDouble(item -> (item.getMaterial().equals(material)) ? item.getVolumen() : 0.0).sum();
	}
	
	public double superficieDeColor(String color) {
		return this.piezas.stream().mapToDouble(item -> (item.getColor().equals(color)) ? item.getSuperficie() : 0.0).sum();
	}
}
