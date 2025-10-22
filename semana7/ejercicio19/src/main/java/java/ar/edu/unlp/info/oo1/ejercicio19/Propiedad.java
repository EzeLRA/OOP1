package java.ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Propiedad {
	private String nombreDescriptivo;
	private String direccion;
	private double precioNoche;
	private List<Reserva> reservas; //Se lo simplifica por una lista (en vez de setReservas)
	
	public Propiedad(String nom,String dir,double precio) {
		this.nombreDescriptivo = nom;
		this.direccion = dir;
		this.precioNoche = precio;
		this.reservas = new LinkedList<Reserva>();
	}
	
	private boolean disponible(Reserva e) {
    	return !this.reservas.stream().anyMatch(r -> r.peiodoReservado(e.getFrom()));
    }
	
	public boolean hacerReserva(/*LocalDate ini,LocalDate fin*/ Reserva reserva) {
		//Reserva e = new Reserva(ini,fin);
		if (this.disponible(reserva)){
			return this.reservas.add(reserva);
        }
        return false;
	}
	
	/*
	 *  Se debe respetar siempre lo que pide en el enunciado, en este caso se pide
	 *   eliminar una reserva pero se asume que esta clase recibe en el metodo una "Reserva" creada por el sistema y 
	 *   la clase "Propieda" solo se encarga de buscar la reserva que tenga hecha. 
	 */
	
	public boolean cancelarReserva(/*LocalDate ini*/ Reserva reserva) {
		/*
		 
		//Por parte de la catedra siempre se prefiere utilizar metodos o "herramientas existentes" y no es prioridad la eficiencia del codigo
		//En vez de inventar algo por el cual puede ya existir implementado
		
		Iterator<Reserva> it = this.reservas.iterator();
    	while(it.hasNext()) {
    		Reserva elem = it.next();
    		if(elem.esDeterminadaReserva(ini)) {
    			it.remove();
    			return true;
    		}
    	}
    	return false;
    	*/
		return this.reservas.remove(reserva);
	}
	
	public double montoPeriodo(LocalDate ini,LocalDate fin) {
    	return this.reservas.stream().filter(r -> r.peiodoReservado(ini) && r.peiodoReservado(fin)).mapToDouble(r -> r.calcularMonto(this.precioNoche)).sum() ;
	}
}
