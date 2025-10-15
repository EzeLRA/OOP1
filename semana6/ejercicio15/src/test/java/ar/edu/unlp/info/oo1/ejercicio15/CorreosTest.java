package ar.edu.unlp.info.oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CorreosTest {
	private ClienteDeCorreo correo1;
	
	@BeforeEach
	void setUp() {
		this.correo1 = new ClienteDeCorreo();
	}
	
	@Test
	void validarCorreo() {
		//validar inbox
		assertFalse(this.correo1.tieneEmails());
		//validar cantidad de carpetas
		assertEquals(this.correo1.carpetasCant(),1);
	}
	
	@Test
	void operarCorreo() {
		Email email1 = new Email("Prueba1","asdf");
		Email email2 = new Email("Prueba2","fdsg");
		
		//validar correos recibidos
		this.correo1.recibir(email1);
		this.correo1.recibir(email2);
		assert(this.correo1.tieneEmails()); //Solo verifica en el buzon principal
		
		//validar creacion de carpetas
		this.correo1.crearCarpeta("Carpeta1");
		this.correo1.crearCarpeta("Carpeta2");
		assertEquals(this.correo1.carpetasCant(),3);
		
		//validar modificaciones
		this.correo1.moverEmail(email2,"Carpeta1");
		assert(this.correo1.tieneEmails());
		
		//buscar un email en todas las carpetas
		assert(this.correo1.buscar("asdf") != null);
		assert(this.correo1.buscar("fdsg") != null);
		assert(this.correo1.buscar("Prueba1") != null);
		assertEquals(this.correo1.buscar("ejem"),null); //corregir para que solo busque palabras especificas
		
		//validar espacio ocupado
		assertEquals(this.correo1.espacioOcupado(),22);
		
	}

}
