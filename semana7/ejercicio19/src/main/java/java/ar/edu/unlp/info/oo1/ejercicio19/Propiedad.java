package java.ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

public class Propiedad {
	private String nombreDescriptivo;
	private String direccion;
	private double precioNoche;
	private setReservas<Reserva> reservas;
	
	public Propiedad(String nom,String dir,double precio) {
		this.nombreDescriptivo = nom;
		this.direccion = dir;
		this.precioNoche = precio;
		this.reservas = new setReservas<Reserva>();
	}
	
	public boolean hacerReserva(LocalDate ini,LocalDate fin) {
		return this.reservas.add(new Reserva(ini,fin));
	}
	
	public boolean cancelarReserva(LocalDate ini) {
		return this.reservas.cancelar(ini);
	}
	
	public double montoPeriodo(LocalDate ini,LocalDate fin) {
		return this.reservas.obtenerRecaudacion(ini, fin, precioNoche);
	}
}
