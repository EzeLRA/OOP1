package ar.edu.unlp.info.oo1.ejercicio3;

/**
 *
 * @author Ezequiel
 */
public class Item {
    private String detalle;
    private int cantidad;
    private float costoUnitario;
    
    public Item(String nom,int cant,float costo) {
    	this.detalle = nom;
    	this.cantidad = cant;
    	this.costoUnitario = costo;
    }
    
    public float costo(){
        return this.cantidad * this.costoUnitario;    	
    }

	public float getCostoUnitario() {
		return this.costoUnitario;
	}
    
}
