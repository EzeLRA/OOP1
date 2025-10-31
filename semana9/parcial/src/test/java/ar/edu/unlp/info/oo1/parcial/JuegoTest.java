package ar.edu.unlp.info.oo1.parcial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JuegoTest {
	public Personaje p1;
	public Personaje p2;
	
	@BeforeEach
	void setUp() {
		this.p1 = new Humano("asd",new Guerrero());
		this.p2 = new Orco("fds",new Guerrero());
	}
	
	@Test
	void mejoraHumano() {
		assertEquals(p1.getNivel(),1);
		p1.subirNivel();
		assertEquals(p1.getNivel(),2);
	}
	
	@Test
	void mejoraOrco() {
		assertEquals(p2.getNivel(),1);
		p2.subirNivel();
		assertEquals(p2.getNivel(),2);
	}
	
	@Test
	void ataqueHumano() {
		assertEquals(p1.determinarPoderAtaque(5),5);
		p1.subirNivel();
		assertEquals(p1.determinarPoderAtaque(5),6);
		p1.subirNivel();
		p1.subirNivel();
		p1.subirNivel();
		p1.subirNivel();
		assertEquals(p1.determinarPoderAtaque(5),10);
		p1.subirNivel();
		assertEquals(p1.determinarPoderAtaque(5),13.333333333333334);
	}
	
	@Test
	void ataqueHumano2() {
		p1.setRol(new Mago());
		assertEquals(p1.determinarPoderAtaque(5),6);
		p1.subirNivel();
		assertEquals(p1.determinarPoderAtaque(5),8);
		p1.subirNivel();
		p1.subirNivel();
		p1.subirNivel();
		p1.subirNivel();
		assertEquals(p1.determinarPoderAtaque(5),16);
		p1.subirNivel();
		assertEquals(p1.determinarPoderAtaque(5),39);
	}
	
	@Test
	void ataqueOrco() {
		assertEquals(p2.determinarPoderAtaque(10),6);
		p2.subirNivel();
		assertEquals(p2.determinarPoderAtaque(10),7);
		p2.subirNivel();
		assertEquals(p2.determinarPoderAtaque(10),9);
	}
	
	@Test
	void ataqueOrco2() {
		p2.setRol(new Mago());
		assertEquals(p2.determinarPoderAtaque(10),4);
		p2.subirNivel();
		assertEquals(p2.determinarPoderAtaque(10),6);
		p2.subirNivel();
		assertEquals(p2.determinarPoderAtaque(10),17);
	}
	
	@Test
	void pelea() {
		Juego j = new Juego();
		j.iniciarPelea(p1, p2, 12);
		assertEquals(p1.getNivel(),2);
	}
	
}
