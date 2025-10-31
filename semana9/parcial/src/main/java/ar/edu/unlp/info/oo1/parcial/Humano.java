package ar.edu.unlp.info.oo1.parcial;

import java.sql.Date;
import java.time.LocalDate;

public class Humano extends Personaje{
	
	public Humano(String nombre,Rol rol) {
		super(nombre,1, new Habilidades(2,1), rol);
	}

	@Override
	public void subirNivel() {
		this.nivel += 1;
		if(this.nivel == 7) {
			this.rol.mejorarHabilidades(this.habilidad, this.nivel);
		}
	}

	@Override
	protected boolean momentoMasFuerte(int hora) {
		return (hora >= 8)&&(hora <= 20);
	}

	@Override
	public double determinarPoderAtaque(int hora) {
		double res = this.rol.valorBase(this.habilidad,this.nivel);
		if(this.momentoMasFuerte(hora)) {
			double incremento = res * (40.0/100.0);
			res += incremento;
		}
		return res;
	}
	
}
