package ar.edu.unlp.info.oo1.ejercicio11;

public class CuentaCorriente extends Cuenta{
	
	private double limiteDescubierto;
	
	public CuentaCorriente() {
		super();
		this.limiteDescubierto = 0;	//Limite de saldo negativo
	}
	
	public double getDescubierto() {
		return this.limiteDescubierto;
	}
	public void setDescubierto(double descubierto) {
		this.limiteDescubierto = descubierto;
	}
	
	protected boolean puedeExtraer(double monto) {
		return (this.getSaldo() <= (this.getDescubierto()* -1));
	}
	
}
