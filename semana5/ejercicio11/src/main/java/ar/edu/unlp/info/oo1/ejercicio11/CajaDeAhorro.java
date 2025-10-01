package ar.edu.unlp.info.oo1.ejercicio11;

public class CajaDeAhorro extends Cuenta {
	
	public CajaDeAhorro() {
		super();
	}
	
	public void depositar(double monto) {
		double montoDepositar = monto - this.costoAdicional(monto);
		if(montoDepositar > 0) {
			super.depositar(montoDepositar);
		}
	}
	
	protected void extraerSinControlar(double monto) {
		super.extraerSinControlar(monto + this.costoAdicional(monto));
	}
	
	protected boolean puedeExtraer(double monto) {
		return (this.getSaldo() >= (monto + this.costoAdicional(monto)));
	}
	
	private double costoAdicional(double monto) {
		return monto * 0.02;
	}
	
}
