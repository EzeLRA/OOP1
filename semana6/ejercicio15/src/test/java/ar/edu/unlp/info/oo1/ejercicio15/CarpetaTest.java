package ar.edu.unlp.info.oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarpetaTest {
	private Carpeta carpeta1;
	
	@BeforeEach
	void setUp() {
		this.carpeta1 = new Carpeta("Buzon");
	}
	
	@Test
	void validarCarpeta() {
		assertEquals(this.carpeta1.getNombre(),"Buzon");
		assert(this.carpeta1.getEmails().isEmpty());
	}
	
	@Test
	void operarCarpeta() {
		Email email1 = new Email("prueba1","asd");
		Email email2 = new Email("prueba2","dsa");
		Email email3 = new Email("prueba3","ute");
		//agregar emails
		
		//eliminar emails
		
		//retornar un email
		
		//calcular espacio ocupado
	}
}
