package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse2 implements DateLapseInterface{
	private LocalDate from;
	private int sizeInDays; 
	
	public DateLapse2(LocalDate ini ,int dias) {
		this.from = ini;
		this.sizeInDays = dias;
	}
	
	public DateLapse2() {
		this.from = LocalDate.MIN;
		this.sizeInDays = (int) this.from.until(LocalDate.MAX,ChronoUnit.DAYS);	
	}

	public void setFrom(int anio,int mes,int dia) {
		this.sizeInDays += (int) LocalDate.of(anio, mes, dia).until(this.from,ChronoUnit.DAYS);
		this.from = LocalDate.of(anio, mes, dia);	
	}
	
	public void setTo(int anio,int mes,int dia) {
		this.sizeInDays = this.diasDesde(LocalDate.of(anio, mes, dia));
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
