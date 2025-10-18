package java.ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse implements DateLapseInterface{
	private LocalDate from;
	private int sizeInDays; 
	
	public DateLapse(LocalDate ini ,int dias) {
		this.from = ini;
		this.sizeInDays = dias;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}
	
	public boolean esFechaInicial(LocalDate fecha) {
		return this.from.isEqual(fecha);
	}
	
	public DateLapse() {
		this.from = LocalDate.MIN;
		this.sizeInDays = (int) this.from.until(LocalDate.MAX,ChronoUnit.DAYS);	
	}

	public void setFrom(LocalDate fecha) {
		this.sizeInDays += (int) fecha.until(this.from,ChronoUnit.DAYS);
		this.from = fecha;	
	}
	
	public void setTo(LocalDate fecha) {
		this.sizeInDays = this.diasDesde(fecha);
	}
	
	public int sizeInDays() {
		return this.sizeInDays;
	}
	
	private int diasDesde(LocalDate fecha) {
		return (int) this.from.until(fecha,ChronoUnit.DAYS);
	}
	
	public boolean includesDate(LocalDate other) {
		return (other.isAfter(this.from) || other.isEqual(this.from)) && (this.diasDesde(other) <= this.sizeInDays); 
	}
	
}
