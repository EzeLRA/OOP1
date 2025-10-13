package ar.edu.unlp.info.oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmailTest {
	private Email email;
	
	@BeforeEach
	void setUp() {
		this.email = new Email("Prueba","Soy una prueba");
	}
	
	@Test
	void validarDatos() {
		assertEquals(this.email.getTitulo(),"Prueba");
		assertEquals(this.email.getCuerpo(),"Soy una prueba");
		assert(this.email.adjuntos().isEmpty());
	}
	
	@Test
	void validarAdjuntos() {
		Archivo archivo1 = new Archivo("MiPdf");
		
		assert(this.email.adjuntos().isEmpty());
		
		this.email.adjuntarArchivo(archivo1);
		
		assertFalse(this.email.adjuntos().isEmpty());
		
		assertEquals(this.email.calcularPesoTotal(),25);
	}
}
