package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.LinkedList;
import java.util.List;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		this.inbox = new Carpeta("Buzon de Entrada");
		this.carpetas = new LinkedList<Carpeta>();
		this.carpetas.add(inbox);
	}
	
	public void recibir(Email email) {
		this.inbox.agregar(email);
	}
	
	public Email buscar(String texto) {
		if(!this.carpetas.isEmpty()) {
			this.carpetas.stream().filter(carp -> (carp.buscarEmail(texto) != null));
		}
		return null;
	}
	
}
