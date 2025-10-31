package ar.edu.unlp.info.oo1.parcial;

public class Mago implements Rol{

	@Override
	public double valorBase(Habilidades h, int nivel) {
		return (h.getInteligencia() + nivel)*2.0;
	}

	@Override
	public void mejorarHabilidades(Habilidades h, int nivel) {
		h.aumentarInteligencia((3.0/2.0)*nivel);
	}
	
}
