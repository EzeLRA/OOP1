package ar.edu.unlp.info.oo1.implementacion;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class Plataforma {
	
	private List<Cliente> clientes;
	
	private boolean agregarContrato(Cliente cli , Contrato contr) {
		boolean pude = false;
		Iterator<Cliente> it = this.clientes.iterator();
		
		while(it.hasNext() && !(pude)) {
			Cliente c = it.next();
			if (c.equals(cli)) {
				c.agregarContrato(contr);
				pude = true;
			}
		}
		
		return pude;
	}
	
	public void hacerContratoDefinido(Cliente cli,int horas,LocalDate fecha,Servicio servicio) {
		Contrato contrato = new ContratoUnico(fecha,servicio,horas);
		if(!(agregarContrato(cli,contrato))) {
			cli.agregarContrato(contrato);
			this.clientes.add(cli);
		}
	}
	
	public void hacerContratoDeterminado(Cliente cli,LocalDate fecha,int diasCant,int horas,Servicio servicio) {
		Contrato contrato = new ContratoDefinido(fecha,diasCant,horas,servicio);
		if(!(agregarContrato(cli,contrato))) {
			cli.agregarContrato(contrato);
			this.clientes.add(cli);
		}
	}
	
	public float montoAPagar(Cliente cli) {
		float monto = 0;
		
		for(Cliente client : this.clientes) {
			if(client.equals(cli)) {
				for(Contrato c : client.getContratos()) {
					monto += c.obtenerMonto();
				}
				break;
			}
		}
		
		return monto;
	}
	
	public int serviciosMax(Cliente cli,float monto) {
		int cant = 0;
		
		for(Cliente client : this.clientes) {
			if(client.equals(cli)) {
				for(Contrato c : client.getContratos()) {
					if(c.obtenerMonto() > monto) {
						cant ++;
					}
				}
				break;
			}
		}
		
		return cant;
	}
	
}
