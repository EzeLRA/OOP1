package ar.edu.unlp.info.oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarpetaTest {
	private Carpeta carpeta1;
	private Carpeta carpeta2;
	
	@BeforeEach
	void setUp() {
		this.carpeta1 = new Carpeta("Buzon");
		this.carpeta2 = new Carpeta("Archivados");
	}
	@Test
	void validarCarpeta() {
		assertEquals(this.carpeta1.getNombre(),"Buzon");
		assert(this.carpeta1.getEmails().isEmpty());
	}
	
	@Test
	void operarCarpeta() {
		Email email1 = new Email("prueba1","asd");
		Email email2 = new Email("prueba2","ute");
		Email email3 = new Email("prueba3","ute");
		
		//agregar emails
		this.carpeta1.agregar(email1);
		this.carpeta1.agregar(email2);
		this.carpeta1.agregar(email3);
		this.carpeta2.agregar(email1);
		this.carpeta2.agregar(email3);
		
		//eliminar emails
		assert(this.carpeta1.eliminar(email1));
		assert(this.carpeta2.eliminar(email1));
		assertFalse(this.carpeta1.eliminar(email1));
		assertFalse(this.carpeta2.eliminar(email2));
		
		//retornar un email
		Email emailRes = this.carpeta1.buscarEmail("ute");
		assert(emailRes != null);
		assertEquals(emailRes.getTitulo(),"prueba2");
		assertEquals(emailRes.getCuerpo(),"ute");
		
		assertEquals(this.carpeta1.buscarEmail("asd"),null);
		
		//calcular espacio ocupado
		assertEquals(this.carpeta2.espacioTotalOcupado(),10);
		
		Archivo archi1 = new Archivo("Pdf");
		Archivo archi2 = new Archivo("Png");
		
		email1.adjuntarArchivo(archi1);
		email1.adjuntarArchivo(archi2);
		
		this.carpeta2.agregar(email1);
		assertEquals(this.carpeta2.espacioTotalOcupado(),26);
		
		//calcular espacio despues de mover un mail de carpeta
		assert(this.carpeta2.mover(email3, carpeta1));
		assertFalse(this.carpeta2.mover(email3, carpeta1));
		
		assertEquals(this.carpeta2.espacioTotalOcupado(),16);
	}
}
