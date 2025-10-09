package ar.edu.unlp.info.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversorTest {
	private Inversor inversor;
	
	@BeforeEach
	void setUp() {
		this.inversor = new Inversor();
	}
	
	@Test
	void hacerInversiones() {
		Inversion inversion = new InversionAccion("YPF", 10, 100);
		assert(this.inversor.invertir(inversion));
		assertFalse(this.inversor.invertir(inversion));
		
		Date fecha = new Date();
		fecha.setDate(fecha.getDate()-5);
		inversion = new InversionPlazoFijo(fecha,100.0,10.0);
		assert(this.inversor.invertir(inversion));
		assertFalse(this.inversor.invertir(inversion));
	}
	
	@Test
	void dejarInversiones() {
		Inversion inversion1 = new InversionAccion("YPF", 10, 100);
		Date fecha = new Date();
		fecha.setDate(fecha.getDate()-5);
		Inversion inversion2 = new InversionPlazoFijo(fecha,100.0,10.0);
		
		this.inversor.invertir(inversion1);
		this.inversor.invertir(inversion2);
		
		assert(this.inversor.dejarInvertir(inversion1));
		assert(this.inversor.dejarInvertir(inversion2));
		assertFalse(this.inversor.dejarInvertir(inversion1));
		
	}
	
	@Test
	void obtenerTotales() {
		Inversion inversion1 = new InversionAccion("AYSA",10,1000.0);
		Date fecha = new Date();
		fecha.setDate(fecha.getDate()-5);
		Inversion inversion2 = new InversionPlazoFijo(fecha,100,10.0);
		
		this.inversor.invertir(inversion1);
		this.inversor.invertir(inversion2);
		
		assertEquals(this.inversor.getValorTotal(),15000.0);
	}

}
