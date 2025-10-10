package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.List;

public class Email {
	private String titulo;
	private String texto;
	private String remitente;
	private List<Archivo> adjuntos;
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getCuerpo() {
		return this.texto;
	}
	
	public String getRemitente() {
		return this.remitente;
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
