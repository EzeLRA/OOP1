package ar.edu.unlp.info.oo1.ejercicio14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReporteTest {
	private ReporteDeConstruccion objeto;
	
	@BeforeEach
	void setUp() {
		this.objeto = new ReporteDeConstruccion();
	}
	
	@Test
	void construirObjeto() {
		Pieza pieza1 = new Cilindro("Hierro","Gris",2.0,5.0);
		Pieza pieza2 = new Esfera("Hierro","Gris",2.0);
		Pieza pieza3 = new PrismaRectangular("Hierro","Gris",5.0,2.0,12.0);
		
		this.objeto.agregarPieza(pieza1);
		this.objeto.agregarPieza(pieza2);
		this.objeto.agregarPieza(pieza3);
		
		assertEquals(this.objeto.getPiezas().size(),3);
	}
	
	@Test
	void calcularVolumen() {
		Pieza pieza1 = new Cilindro("Hierro","Rojo",2.0,5.0);
		Pieza pieza2 = new Esfera("Titanio","Gris",2.0);
		Pieza pieza3 = new PrismaRectangular("Hierro","Verde",5.0,2.0,12.0);
		
		this.objeto.agregarPieza(pieza1);
		this.objeto.agregarPieza(pieza2);
		this.objeto.agregarPieza(pieza3);
		
		assertEquals(this.objeto.volumenDeMaterial("Hierro"), ((Math.PI * 4.0 * 5.0) + 120.0));
		assertEquals(this.objeto.volumenDeMaterial("Titanio"), ((4 * Math.PI * Math.pow(2.0, 3))/3));
	}
	
	@Test
	void calcularSuperficie() {
		Pieza pieza1 = new Cilindro("Hierro","Rojo",2.0,5.0);
		Pieza pieza2 = new Esfera("Titanio","Rojo",2.0);
		Pieza pieza3 = new PrismaRectangular("Hierro","Verde",5.0,2.0,12.0);
		
		this.objeto.agregarPieza(pieza1);
		this.objeto.agregarPieza(pieza2);
		this.objeto.agregarPieza(pieza3);
		
		assertEquals(this.objeto.superficieDeColor("Rojo"),(2 * Math.PI * 2.0 * 5.0 + 2 * Math.PI * 4.0) + 4 * Math.PI * 4.0);
		assertEquals(this.objeto.superficieDeColor("Verde"),188.0);
	}
	
}
