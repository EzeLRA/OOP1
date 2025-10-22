package ar.edu.unlp.info.oo1.tallerPractico;

import java.util.List;

public class Excursion implements Servicio{
	private double costoTraslado;
	private double costoGuia;
	private double costoSeguro;
	private List<String> sitiosVisitar;
		
	public double costoTotal() {
		return this.costoTraslado + this.costoSeguro + this.costoGuia * this.sitiosVisitar.size();
	}
}
