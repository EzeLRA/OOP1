package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.LinkedList;
import java.util.List;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new LinkedList<Email>();
	}
	
	public String getNombre() {
		return this.nombre; 
	}
	
	public void agregar(Email email) {
		this.emails.add(email);
	}
	
	public boolean eliminar(Email email) {
		return this.emails.remove(email);
	}
	
	public boolean mover(Email email, Carpeta destino) {
		if(this.eliminar(email)) {
			destino.agregar(email);
			return true;
		}
		return false;
	}
	
	public List<Email> getEmails(){
		return this.emails;
	}
	
	public int espacioTotalOcupado() {
		return this.emails.stream().mapToInt(email -> email.calcularPesoTotal()).sum();
	}
	
	public Email buscarEmail(String texto) {
		return this.emails.stream().filter(email -> email.getCuerpo().contains(texto)).findFirst().orElse(null);
	}
	
}
