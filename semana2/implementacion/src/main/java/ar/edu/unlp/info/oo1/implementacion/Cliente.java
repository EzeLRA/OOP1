package ar.edu.unlp.info.oo1.implementacion;

import java.util.LinkedList;
import java.util.List;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private List<Contrato> contratos;
	
	public Cliente(String nom,String ape,String dir) {
		this.nombre = nom;
		this.apellido = ape;
		this.direccion = dir;
		this.contratos = new LinkedList<Contrato>();
	}
	
	
	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public List<Contrato> getContratos() {
		return this.contratos;
	}
	
	public void agregarContrato(Contrato c) {
		this.contratos.add(c);
	}

	public boolean equals(Cliente c) {
		return (this.nombre.equals(c.getNombre()))&&(this.apellido.equals(c.getApellido()))&&(this.direccion.equals(c.getDireccion()));
	}
	
	
}
