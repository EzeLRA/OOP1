package ar.edu.unlp.info.oo1.parcial;

import java.util.List;

public class Juego {
	
	public void iniciarPelea(Personaje p1,Personaje p2,int hora) {
		double ataque1 = p1.determinarPoderAtaque(hora);
		double ataque2 = p2.determinarPoderAtaque(hora);
		if(ataque1 == ataque2) {
			p1.subirNivel();
			p2.subirNivel();
		}else if(ataque1 > ataque2) {
			p1.subirNivel();
		}else {
			p2.subirNivel();
		}
	}
	
	private boolean esOponenteValido(Personaje p1,int hora) {
		return p1.determinarPoderAtaque(hora) < 5; 
	}
	
	public List<Personaje> buscarOponentes(Personaje p,List<Personaje> personajes){
		return personajes.stream().filter(per -> p.nivelSimilar(per)||(p.mismoNivel(per)&&(this.esOponenteValido(per,12)))).toList();
	}
}
