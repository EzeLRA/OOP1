package ar.edu.unlp.info.oo1.ejercicio29;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse implements DateLapseInterface{
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate ini,LocalDate fin) {
		this.from = ini;
		this.to = fin;
	}
	
	public DateLapse() {
		this.from = LocalDate.MIN;
		this.to = LocalDate.MAX;
	}

	public void setFrom(int anio,int mes,int dia) {
		this.from = LocalDate.of(anio, mes, dia);
	}
	
	public LocalDate getFrom() {
		return this.from;
	}

	public void setTo(int anio,int mes,int dia) {
		this.to = LocalDate.of(anio, mes, dia);
	}
	
	public int sizeInDays() {
		return (int) this.from.until(this.to,ChronoUnit.DAYS);
	}
	
	public boolean includesDate(LocalDate other) {
		return !other.isBefore(this.from) && !other.isAfter(this.to); 
	}

	@Override
	public boolean overlaps(DateLapse other) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
