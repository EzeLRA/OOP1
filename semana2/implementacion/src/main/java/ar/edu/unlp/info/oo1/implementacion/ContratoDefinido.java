package ar.edu.unlp.info.oo1.implementacion;

import java.time.LocalDate;

public class ContratoDefinido extends Contrato {
	
	private int dias;
	private int horas;
	
	public ContratoDefinido(LocalDate fecha , int cant , int horas , Servicio servicio) {
		super(fecha, servicio);
		this.dias = cant;
		this.horas = horas;
	}

	public float obtenerMonto() {
		float costo = this.getServicio().getCosto(this.horas) * this.dias;
		return (this.dias > 5)?((costo * 90)/100):(costo);
	}

}
