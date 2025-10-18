package java.ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

public class Reserva {
	private DateLapse lapso;
	
	public Reserva(LocalDate ini,LocalDate fin) {
		this.lapso = new DateLapse();
		this.lapso.setFrom(ini);
		this.lapso.setTo(fin);
	}
	
	public LocalDate getFrom() {
		return this.lapso.getFrom();
	}
	
	public boolean esDeterminadaReserva(LocalDate fecha) {
		return this.lapso.esFechaInicial(fecha);
	}
	
	public double calcularMonto(double costoNoche) {
		return this.lapso.sizeInDays() * costoNoche;
	}
	
	public boolean peiodoReservado(LocalDate ini) {
		return this.lapso.includesDate(ini);
	}
	
}
