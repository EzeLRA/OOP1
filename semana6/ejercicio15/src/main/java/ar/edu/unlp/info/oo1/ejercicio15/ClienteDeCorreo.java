package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/*
 * TENER CUIDADO CON LAS ENVIDIAS Y SABER DELEGAR RESPOSABILIDADES ENTRE METODOS
 * 
 * CONSIDERAR SIEMPRE MANTENER ACTUALIZADO LOS DIAGRAMAS UML EN BASE AL CODIGO. EXCEPTUANDO GETTERS Y SETTERS YA QUE NO SON RELEVANTES
 */

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
	
	public boolean moverEmail(Email email,String destino) {
		/* No siempre sera necesario verificar existencia de origen y destino , sino lo pide el enunciado
		  
		Carpeta ori = this.carpetas.stream().filter(carp -> carp.getNombre().equals(origen)).findFirst().orElse(null);
		Carpeta dest = this.carpetas.stream().filter(carp -> carp.getNombre().equals(destino)).findFirst().orElse(null);
		if((ori != null) &&(dest != null)) {
			return ori.mover(email, dest);
		}
		*/
		Carpeta dest = this.carpetas.stream().filter(carp -> carp.nombreIgual(destino)).findFirst().orElse(null);
		if(dest != null) {
			//Asumo como carpeta origen mi inbox
			return this.inbox.mover(email, dest);
		}
		return false;
	}
	
	public int espacioOcupado() {
		return this.carpetas.stream().mapToInt(carp -> carp.espacioTotalOcupado()).sum();
	}
	
	public Email buscar(String texto) {
		return this.carpetas.stream().map(carp -> carp.buscarEmail(texto)).filter(Objects::nonNull).findFirst().orElse(null);
	}
	
}
