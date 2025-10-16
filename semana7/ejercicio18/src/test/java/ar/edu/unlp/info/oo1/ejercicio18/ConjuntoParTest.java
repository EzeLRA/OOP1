package ar.edu.unlp.info.oo1.ejercicio18;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.ejercicio18.EvenNumberSet;

public class ConjuntoParTest {
	private Set<Integer> conjunto;
	
	@BeforeEach
	void setUp() {
		this.conjunto = new EvenNumberSet();
	}
	
	@Test
	void insercionCorrecta() {
		assert(this.conjunto.isEmpty());
		assert(this.conjunto.add(2));
		assert(this.conjunto.size() == 1);
		assertFalse(this.conjunto.add(2));
		assert(this.conjunto.size() == 1);
		assertFalse(this.conjunto.add(3));
		assertFalse(this.conjunto.add(9));
		assert(this.conjunto.size() == 1);
		assert(this.conjunto.add(4));
		assert(this.conjunto.size() == 2);
	}
	
}
