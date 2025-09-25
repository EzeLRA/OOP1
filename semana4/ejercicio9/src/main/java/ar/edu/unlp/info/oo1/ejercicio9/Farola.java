package ar.edu.unlp.info.oo1.ejercicio9;

import java.util.List;

public class Farola {
	private boolean estado;
	private List<Farola> farolasVecinas;
	
	public Farola(){
		this.estado = false;
	}
	
	public void pairWithNeighbor( Farola otraFarola ) {
		//tiene que ser capaz de determinar si ya existe una vinculacion
		this.farolasVecinas.add(otraFarola);
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
