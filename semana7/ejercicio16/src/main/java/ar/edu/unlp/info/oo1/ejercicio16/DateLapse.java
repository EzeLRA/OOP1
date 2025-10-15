package ar.edu.unlp.info.oo1.ejercicio16;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse() {
		this.from = LocalDate.MIN;
		this.to = LocalDate.MAX;
	}

	public void setFrom(int anio,int mes,int dia) {
		this.from = LocalDate.of(anio, mes, dia);
	}

	public void setTo(int anio,int mes,int dia) {
		this.to = LocalDate.of(anio, mes, dia);
	}
	
	private boolean esLimiteDe(LocalDate otro) {
		return this.from.isEqual(otro) || this.to.isEqual(otro);
	}
	
	public int sizeInDays() {
		return (int) this.from.until(this.to,ChronoUnit.DAYS);
	}
	
	public boolean includesDate(LocalDate other) {
		return (other.isAfter(this.from) && other.isBefore(this.to)) || this.esLimiteDe(other); 
	}
	
}
