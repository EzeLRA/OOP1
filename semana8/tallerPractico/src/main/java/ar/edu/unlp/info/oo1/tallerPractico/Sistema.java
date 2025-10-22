package ar.edu.unlp.info.oo1.tallerPractico;

import java.util.LinkedList;
import java.util.List;

public class Sistema {
	private List<Cliente> clientes;
	private List<Presupuesto> presupuestosHechos;
	private double porcentajeDescuento;
	
	public Sistema(double valor) {
		this.clientes = new LinkedList<Cliente>();
		this.presupuestosHechos = new LinkedList<Presupuesto>();
		this.porcentajeDescuento = valor;
	}
	
	/*
	 * Se asume que los cliente existen en el sistema
	 */
	
	public void agregarPresupuesto(Cliente cli,Presupuesto p) {
		if(this.tieneDescuento(cli)){
			p.recibirDescuento(this.getPorcentajeValor());
		}
		cli.agregarPresupuesto(p);
	}
	
	public boolean tieneDescuento(Cliente cli) {
		return (cli.cantPresupuestos() > 5)&&(cli.montoPresupuestos() > 1000000);
	}
	
	public double getPorcentajeValor() {
		return (100 - this.porcentajeDescuento) / 100;
	}
	
	
}
