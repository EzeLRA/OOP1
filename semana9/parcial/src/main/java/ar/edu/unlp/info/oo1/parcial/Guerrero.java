package ar.edu.unlp.info.oo1.parcial;

public class Guerrero implements Rol{

	@Override
	public double valorBase(Habilidades h, int nivel) {
		return (h.getFuerza()*2.0) + nivel + h.getInteligencia();
	}

	@Override
	public void mejorarHabilidades(Habilidades h, int nivel) {
		h.aumentarFuerza(nivel /6.0);
	}
	
}
