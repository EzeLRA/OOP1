package java.ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class setReservas<T extends Reserva> implements Set<T> {
private List<T> elementos;
	
	public setReservas(){
		super();
		this.elementos = new ArrayList<T>();
	}
	
	@Override
    public int size() {
        return elementos.size();
    }
    
    @Override
    public boolean isEmpty() {
        return elementos.isEmpty();
    }
    
    @Override
    public boolean contains(Object o) {
        return elementos.contains(o);
    }
    
    @Override
    public Iterator<T> iterator() {
        return elementos.iterator();
    }
    
    @Override
    public Object[] toArray() {
        return elementos.toArray();
    }
    
    @Override
    public <T> T[] toArray(T[] a) {
        return elementos.toArray(a);
    }
    
    public double obtenerRecaudacion(LocalDate ini,LocalDate fin,double valor) {
    	return this.elementos.stream().filter(r -> r.peiodoReservado(ini) && r.peiodoReservado(fin)).mapToDouble(r -> r.calcularMonto(valor)).sum() ;
    }
    
    private boolean disponible(Reserva e) {
    	return !this.elementos.stream().anyMatch(r -> r.peiodoReservado(e.getFrom()));
    }
    
    @Override
    public boolean add(T e) {
        // Set no permite duplicados
        if (!elementos.contains(e) && this.disponible(e)){
            return elementos.add(e);
        }
        return false;
    }
    
    public boolean cancelar(LocalDate fecha) {
    	Iterator<T> it = this.elementos.iterator();
    	while(it.hasNext()) {
    		Reserva elem = it.next();
    		if(elem.esDeterminadaReserva(fecha)) {
    			it.remove();
    			return true;
    		}
    	}
    	return false;
    }
    
    @Override
    public boolean remove(Object o) {
        return elementos.remove(o);
    }
    
    @Override
    public boolean containsAll(Collection<?> c) {
        return elementos.containsAll(c);
    }
    
    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean modificado = false;
        for (T elemento : c) {
            if (add(elemento)) {
                modificado = true;
            }
        }
        return modificado;
    }
    
    @Override
    public boolean retainAll(Collection<?> c) {
        return elementos.retainAll(c);
    }
    
    @Override
    public boolean removeAll(Collection<?> c) {
        return elementos.removeAll(c);
    }
    
    @Override
    public void clear() {
        elementos.clear();
    }

}
