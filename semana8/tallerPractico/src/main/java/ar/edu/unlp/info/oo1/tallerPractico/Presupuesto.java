package ar.edu.unlp.info.oo1.tallerPractico;

import java.util.LinkedList;
import java.util.List;

public class Presupuesto {
	private List<Servicio> servicios;
	private double descuento;
	
	public Presupuesto() {
		this.servicios = new LinkedList<Servicio>();
		this.descuento = 1;
	}
	
	public void agregarServicio(Servicio servicio) {
		this.servicios.add(servicio);
	}
	
	public double costoFinal() {
		return this.servicios.stream().mapToDouble(s -> s.costoTotal()).sum() * this.descuento;
	}
	
	public void recibirDescuento(Double valor) {
		this.descuento = valor;
	}
	
}
