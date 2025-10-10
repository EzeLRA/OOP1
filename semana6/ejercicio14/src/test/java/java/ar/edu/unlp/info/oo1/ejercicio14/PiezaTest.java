package java.ar.edu.unlp.info.oo1.ejercicio14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PiezaTest {
	private Pieza pieza1;
	private Pieza pieza2;
	private Pieza pieza3;
	
	@BeforeEach
	void setUp() {
		this.pieza1 = new Cilindro("Hierro","Gris",2.0,5.0);
		this.pieza2 = new Esfera("Hierro","Gris",2.0);
		this.pieza3 = new PrismaRectangular("Hierro","Gris",5.0,2.0,12.0);
	}
	
	@Test
	void obtenerDatos() {
		assert(this.pieza1.getMaterial().equals("Hierro"));
		assert(this.pieza2.getMaterial().equals("Hierro"));
		assert(this.pieza3.getMaterial().equals("Hierro"));
		
		assert(this.pieza1.getColor().equals("Gris"));
		assert(this.pieza2.getColor().equals("Gris"));
		assert(this.pieza3.getColor().equals("Gris"));
	}
	
	@Test
	void calcularDatos() {
		assertEquals(this.pieza1.getVolumen(),62.831853072);
		assertEquals(this.pieza1.getSuperficie(),87.964594301);
		
		assertEquals(this.pieza2.getVolumen(),33.510321638);
		assertEquals(this.pieza2.getSuperficie(),50.265482457);
		
		assertEquals(this.pieza3.getVolumen(),120.0);
		assertEquals(this.pieza3.getSuperficie(),188.0);
	}
}
