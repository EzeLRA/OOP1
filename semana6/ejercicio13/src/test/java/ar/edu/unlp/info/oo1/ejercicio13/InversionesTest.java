package ar.edu.unlp.info.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversionesTest {
	private Inversion inversion1;
	private Inversion inversion2;
	
	@BeforeEach
	void setUp() {
		this.inversion1 = new InversionAccion("AYSA",10,1000.0);
		Date fecha = new Date();
		fecha.setDate(fecha.getDate()-5);
		this.inversion2 = new InversionPlazoFijo(fecha,100,10.0);
	}
	
	@Test
	void datosInversionAccion() {
		assertEquals(((InversionAccion) this.inversion1).getNombre(), "AYSA");
		assertEquals(((InversionAccion) this.inversion1).getCantidad(), 10);
		assertEquals(((InversionAccion) this.inversion1).getValorUnitario(), 1000.0);
	}
	
	@Test
	void datosInversionPlazoFijo() {
		Date fecha = new Date();
		fecha.setDate(fecha.getDate()-5);
		assert(((InversionPlazoFijo) this.inversion2).getFecha().equals(fecha)); //Puede fallar por margenes de tiempo
		assertEquals(((InversionPlazoFijo) this.inversion2).getMontoDepositado(),100);
		assertEquals(((InversionPlazoFijo) this.inversion2).getPorcentajeInteres(),10.0);
	}
	
	@Test
	void totalInversionAccion() {
		assertEquals(((InversionAccion) this.inversion1).getValorActual(),10000.0);
	}
	
	@Test
	void totalInversionPlazoFijo() {
		assertEquals(((InversionPlazoFijo) this.inversion2).getValorActual(),5000.0);
	}
	
}
