package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.LinkedList;
import java.util.List;

public class Email {
	private String titulo;
	private String texto;
	private List<Archivo> adjuntos;
	
	public Email(String titulo,String text) {
		this.titulo = titulo;
		this.texto = text;
		this.adjuntos = new LinkedList<Archivo>();
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getCuerpo() {
		return this.texto;
	}
		
	public void adjuntarArchivo(Archivo archi) {
		this.adjuntos.add(archi);
	}
	
	public List<Archivo> adjuntos(){
		return this.adjuntos;
	}
	
	public int calcularPesoTotal() {
		return this.titulo.length() + 
				this.texto.length() + 
				(this.adjuntos.stream().mapToInt(ar -> ar.tamaño()).sum());
	}
	
}
