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
	
	public int espacioOcupado() {
		return this.carpetas.stream().mapToInt(carp -> carp.espacioTotalOcupado()).sum();
	}
	
	public Email buscar(String texto) {
		return this.carpetas.stream().map(carp -> carp.buscarEmail(texto)).filter(res -> res != null).findFirst().orElse(null);
	}
	
}
