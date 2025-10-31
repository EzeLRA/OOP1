package ar.edu.unlp.info.oo1.parcial;

public abstract class Personaje {
	
	protected String nombre;
	protected int nivel;
	protected Habilidades habilidad;
	protected Rol rol;
		
	public Personaje(String nombre, int nivel, Habilidades habilidad, Rol rol) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.habilidad = habilidad;
		this.rol = rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
	public int getNivel() {
		return this.nivel;
	}
	
	public boolean mismoNivel(Personaje p) {
		return this.nivel == p.getNivel();
	}
	
	public boolean nivelSimilar(Personaje p) {
		int dif = (this.nivel > p.getNivel()) ? (this.nivel - p.getNivel()) : (p.getNivel() - this.nivel);
		return (dif <= 2)&&(dif > 0);
	}
	
	public abstract void subirNivel();
	
	protected abstract boolean momentoMasFuerte(int hora);
	
	public abstract double determinarPoderAtaque(int hora);
}
