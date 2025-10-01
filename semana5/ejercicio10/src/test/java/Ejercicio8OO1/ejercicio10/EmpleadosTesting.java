package Ejercicio8OO1.ejercicio10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadosTesting {
	private Gerente gerente1;
	private Gerente gerente2;
	
	@BeforeEach
	void setUp() throws Exception {
		this.gerente1 = new Gerente("Alan");
		this.gerente2 = new Gerente("Paul");
	}
	
	@Test
	void obtenerAportes() {
		assertEquals(gerente1.aportes() , (57000 + 0.05d));
	}
	
	@Test
	void obtenerSueldos() {
		assertEquals(gerente2.sueldoBasico() , 122000.05 );
		/*
		 * Flujo del resultado:
		 * 1º Polimorfismo de Empleado y Gerente
		 * 	Empleado.sueldoBasico() calcula primero -> (57000)Gerente.montoBasico() + (57000.05)Gerente.aportes()
		 * 2º
		 * 	Empleado.sueldoBasico() con el monto anterior le suma -> (8000)EmpleadoJerarquico.bonoPorCategoria()
		 * */
	}
}
