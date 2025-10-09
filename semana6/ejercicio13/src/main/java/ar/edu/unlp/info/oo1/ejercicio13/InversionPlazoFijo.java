package ar.edu.unlp.info.oo1.ejercicio13;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class InversionPlazoFijo implements Inversion{
	private Date fecha;
	private double montoDepositado;
	private double porcentajeInteres;
	
	public InversionPlazoFijo(Date fechaAct,double monto,double porcentaje) {
		this.fecha = fechaAct;
		this.montoDepositado = monto;
		this.porcentajeInteres = porcentaje;
	}
		
	public Date getFecha() {
		return fecha;
	}

	public double getMontoDepositado() {
		return montoDepositado;
	}

	public double getPorcentajeInteres() {
		return porcentajeInteres;
	}

	public double getValorActual() {
		Date fechaActual = new Date(); //Fecha actual
		long difMillis = fechaActual.getTime() - this.fecha.getTime();
		long diasDif = TimeUnit.DAYS.convert(difMillis,TimeUnit.MILLISECONDS);
		return this.montoDepositado * porcentajeInteres * diasDif;
	}

	public boolean equals(Inversion obj) {
		if (obj instanceof InversionPlazoFijo) {
			return (this.fecha.equals(((InversionPlazoFijo) obj).getFecha()))&&(this.montoDepositado == ((InversionPlazoFijo) obj).getMontoDepositado())&&(this.porcentajeInteres == ((InversionPlazoFijo) obj).getPorcentajeInteres());
		}
		return false;	
	}
		
}
