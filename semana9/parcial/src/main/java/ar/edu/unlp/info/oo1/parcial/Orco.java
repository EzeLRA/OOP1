package ar.edu.unlp.info.oo1.parcial;

import java.sql.Date;
import java.time.LocalDate;

public class Orco extends Personaje{
	
	public Orco(String nombre,Rol rol) {
		super(nombre,1, new Habilidades(1,2), rol);
	}
	
	@Override
	public void subirNivel() {
		this.nivel += 1;
		
		if((this.nivel % 3)== 0) {
			this.rol.mejorarHabilidades(this.habilidad,this.nivel);
		}
	}

	@Override
	protected boolean momentoMasFuerte(int hora) {
		return (hora >= 20)&&(hora <= 8);
	}

	@Override
	public double determinarPoderAtaque(int hora) {
		double res = this.rol.valorBase(this.habilidad,this.nivel);
		if(this.momentoMasFuerte(hora)) {
			double incremento = res*(60.0/100.0);
			res += incremento;
		}
		return res;
	}
	
}
