package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		this.inbox = new Carpeta("Buzon de Entrada");
		this.carpetas = new LinkedList<Carpeta>();
		this.carpetas.add(inbox);
	}
	
	public int carpetasCant() {
		return this.carpetas.size();
	}
	
	public boolean tieneEmails() {
		return !this.inbox.getEmails().isEmpty();
	}
	
	public void crearCarpeta(String nom) {
		this.carpetas.add(new Carpeta(nom));
	}
	
	public void recibir(Email email) {
		this.inbox.agregar(email);
	}
	
	public boolean moverEmail(Email email,String origen,String destino) {
		Carpeta ori = this.carpetas.stream().filter(carp -> carp.getNombre().equals(origen)).findFirst().orElse(null);
		Carpeta dest = this.carpetas.stream().filter(carp -> carp.getNombre().equals(destino)).findFirst().orElse(null);
		if((ori != null) &&(dest != null)) {
			return ori.mover(email, dest);
		}
		return false;
	}
	
	public int espacioOcupado() {
		return this.carpetas.stream().mapToInt(carp -> carp.espacioTotalOcupado()).sum();
	}
	
	public Email buscar(String texto) {
		//consultar
		return this.carpetas.stream().map(carp -> carp.buscarEmail(texto)).filter(Objects::nonNull).findFirst().orElse(null);
	}
	
}
