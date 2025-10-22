package java.ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

public class Reserva {
	private DateLapse lapso;
	
	public Reserva(LocalDate ini,LocalDate fin) {
		this.lapso = new DateLapse();
		this.lapso.setFrom(ini);
		this.lapso.setTo(fin);
	}
	
	public DateLapse getLapso() {
		return this.lapso;
	}
	
	public boolean esDeterminadaReserva(LocalDate fecha) {
		return this.lapso.esFechaInicial(fecha);
	}
	
	public double calcularMonto(double costoNoche) {
		return this.lapso.sizeInDays() * costoNoche;
	}
	
	//Recibe una reserva para comparar
	public boolean peiodoReservado(Reserva reserva) {
		return this.lapso.overlaps(reserva.getLapso());
	}
	
}
