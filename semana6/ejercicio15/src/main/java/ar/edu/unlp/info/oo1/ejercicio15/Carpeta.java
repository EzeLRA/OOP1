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
	
	public void mover(Email email, Carpeta destino) {
		this.eliminar(email);
		destino.agregar(email);
	}
	
	public Email buscarEmail(String texto) {
		return this.emails.stream().filter(email -> email.getCuerpo().contains(texto)).findFirst().orElse(null);
	}
	
}
