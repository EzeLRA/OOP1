package ar.edu.unlp.info.oo1.ejercicio18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class EvenNumberSet<Integer> implements Set<Integer>{
	private List<Integer> elementos;
	
	public EvenNumberSet(){
		super();
		this.elementos = new ArrayList<Integer>();
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
    public Iterator<Integer> iterator() {
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
    
    private boolean esPar(Integer e) {
    	return ((int) e % 2) == 0;
    }
    
    @Override
    public boolean add(Integer e) {
        // Set no permite duplicados
        if (!elementos.contains(e) && this.esPar(e)) {
            return elementos.add(e);
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
    public boolean addAll(Collection<? extends Integer> c) {
        boolean modificado = false;
        for (Integer elemento : c) {
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
