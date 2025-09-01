package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Ezequiel
 */
public class Presupuesto {
    private LocalDate fecha;
    private String cliente;
    private List<Item> listado;
    
    public Presupuesto(String nom) {
    	this.fecha = LocalDate.now();
    	this.cliente = nom;
    	this.listado = new LinkedList<Item>();
    }
    
    public void agregarItem(Item item){
        listado.add(item);
    }
    
    public float calcularTotal(){
        float monto = 0;
        
        for(Item item : this.listado) {
        	monto += item.costo();
        }
        
        return monto;
    }

	public LocalDate getFecha() {
		return this.fecha;
	}

	public String getCliente() {
		return this.cliente;
	}
    
}
