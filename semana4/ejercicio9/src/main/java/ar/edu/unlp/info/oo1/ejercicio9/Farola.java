package ar.edu.unlp.info.oo1.ejercicio9;

import java.util.LinkedList;
import java.util.List;

public class Farola {
	private boolean estado;
	private List<Farola> farolasVecinas;
	
	public Farola(){
		this.estado = false;
		this.farolasVecinas = new LinkedList<Farola>();	
	}
	public void pairWithNeighbor( Farola otraFarola ) {
		if(!this.farolasVecinas.contains(otraFarola)) {
			this.farolasVecinas.add(otraFarola);
			otraFarola.pairWithNeighbor(this);
		}
	}
	
	public List<Farola> getNeighbors (){
		return this.farolasVecinas;
	}
	
	public void turnOn() {
		if(this.isOff()) {
			this.estado = true;
			this.farolasVecinas.stream().forEach(farola ->{
				farola.turnOn();
			});
		}
	}
	
	public void turnOff() {
		if(this.isOn()) {
			this.estado = false;
			this.farolasVecinas.stream().forEach(farola ->{
				farola.turnOff();
			});
		}
	}
	
	public boolean isOn() {
		return this.estado;
	}
	
	public boolean isOff() {
		return !(this.estado);
	}
}
