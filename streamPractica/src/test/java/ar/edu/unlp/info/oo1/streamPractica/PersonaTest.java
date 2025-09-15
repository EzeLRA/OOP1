package ar.edu.unlp.info.oo1.streamPractica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class PersonaTest {
	
	Persona james, guido;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new Persona();
		guido = new Persona();
		james.setApellido("Gosling");
		james.setNombre("James");
		guido.setApellido("van Rossum");
		guido.setNombre("Guido");
	}
	
    @Test
    public void testNombreCompleto() {
        assertEquals("Gosling, James", james.getNombreCompleto());
        assertEquals("van Rossum, Guido", guido.getNombreCompleto());
    }
    
    @Test
    public void prueba() {
    	Persona p1 = new Persona("asd","fsd","123");
		Persona p2 = new Persona("asdd","fsdf","123");
		Persona p3 = new Persona("asdf","fsds","1234");
		
		List<Persona> personas = new LinkedList<Persona>();
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		
		List<Persona> res = personas.stream().filter(p -> p.getApellido().equals("fsd")).toList();	
		assert(!res.isEmpty());
    }
    
}
