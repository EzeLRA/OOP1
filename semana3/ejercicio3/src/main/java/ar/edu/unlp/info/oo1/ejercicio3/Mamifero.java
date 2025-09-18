package ar.edu.unlp.info.oo1.ejercicio3;

import java.util.Date;

public class Mamifero {
	//Atributos
	private String id;
	private String especie;
	private Date fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	private Mamifero abueloMaterno;
	private Mamifero abuelaMaterna;
	private Mamifero abueloPaterno;
	private Mamifero abuelaPaterna;
	
	//Metodos
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	public Mamifero getAbueloMaterno() {
		return abueloMaterno;
	}
	public void setAbueloMaterno(Mamifero abueloMaterno) {
		this.abueloMaterno = abueloMaterno;
	}
	public Mamifero getAbuelaMaterna() {
		return abuelaMaterna;
	}
	public void setAbuelaMaterna(Mamifero abuelaMaterna) {
		this.abuelaMaterna = abuelaMaterna;
	}
	public Mamifero getAbueloPaterno() {
		return abueloPaterno;
	}
	public void setAbueloPaterno(Mamifero abueloPaterno) {
		this.abueloPaterno = abueloPaterno;
	}
	public Mamifero getAbuelaPaterna() {
		return abuelaPaterna;
	}
	public void setAbuelaPaterna(Mamifero abuelaPaterna) {
		this.abuelaPaterna = abuelaPaterna;
	}
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return (this.especie.equals(unMamifero.getEspecie()));
		//Debo comparar si un mamifero nacio mucho antes que el mamifero
	}
	
	private boolean esPariente(Mamifero mamifero) {
		return (this.abuelaMaterna.equals(mamifero))||
				(this.abuelaPaterna.equals(mamifero))||
				(this.abueloMaterno.equals(mamifero))||
				(this.abueloPaterno.equals(mamifero))||
				(this.padre.equals(mamifero))||
				(this.madre.equals(mamifero));
	}
	
	public boolean equals(Mamifero mamifero) {
		return (this.id.equals(mamifero.getId()))&&(this.especie.equals(mamifero.getEspecie()))&&(this.fechaNacimiento.equals(mamifero.getFechaNacimiento()));
	}
	
	
}
