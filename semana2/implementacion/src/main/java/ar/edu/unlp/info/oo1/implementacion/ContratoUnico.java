package ar.edu.unlp.info.oo1.implementacion;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ContratoUnico extends Contrato {

	private int horas;
	
	public ContratoUnico(LocalDate fecha, Servicio servicio,int horas) {
		super(fecha, servicio);
		this.horas = horas;
	}

	public float obtenerMonto() {
		DayOfWeek dia = DayOfWeek.from(this.getFecha());
		float costo = this.getServicio().getCosto(this.horas);
		return (dia.equals(DayOfWeek.SATURDAY) || dia.equals(DayOfWeek.SUNDAY))?((costo * (115))/100):(costo);
	}

}
