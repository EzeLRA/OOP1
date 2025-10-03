package ar.edu.unlp.info.oo1.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentasTest {
	private CajaDeAhorro cuenta1 ;
	private CuentaCorriente cuenta2 ;
	
	@BeforeEach
	void setUp() throws Exception {
		cuenta1 = new CajaDeAhorro();
		cuenta2 = new CuentaCorriente();
	}
	
	@Test
	void inicializados() {
		assertEquals(cuenta1.getSaldo(), 0);
		assertEquals(cuenta2.getSaldo(), 0);
		assertEquals(cuenta2.getDescubierto(),0);
	}
	
	@Test
	void deposito() {
		cuenta1.depositar(1000);
		assertEquals(cuenta1.getSaldo(), (1000 - (1000 * 0.02)) );
		cuenta2.depositar(1000);
		assertEquals(cuenta2.getSaldo(), 1000);
	}

	@Test
	void extraer() {
		//Caja de Ahorro
		cuenta1.depositar(1000);
		assert(cuenta1.extraer(100));
		assertEquals(cuenta1.getSaldo(), ((1000 - (1000 * 0.02)) - (100 + (100 * 0.02))) );
		assertEquals(cuenta1.extraer(2000),false);
		
		//Cuenta Corriente
		cuenta2.depositar(1000);
		assert(cuenta2.extraer(100));
		assertEquals(cuenta2.getSaldo(), 900);
		assertEquals(cuenta2.extraer(2000),false);
		cuenta2.setDescubierto(500);
		assert(cuenta2.extraer(1000));
		assertEquals(cuenta2.getSaldo(), -100);
	}
	
	@Test
	void transferencia() {
		CajaDeAhorro cuenta1A = new CajaDeAhorro();
		CuentaCorriente cuenta2A = new CuentaCorriente();
		
		cuenta1.depositar(1000);
		
		assert(cuenta1.transferirACuenta(100, cuenta1A));
		assertEquals(cuenta1.getSaldo(), ((1000 - (1000 * 0.02)) - (100 + (100 * 0.02))) );
		assertEquals(cuenta1A.getSaldo(), (100 - (100 * 0.02)));
		assert(cuenta1.transferirACuenta(100, cuenta2A));
		assertEquals(cuenta1.getSaldo(), ((1000 - (1000 * 0.02)) - (100 + (100 * 0.02))*2) );
		assertEquals(cuenta2A.getSaldo(),100);	
		assertEquals(cuenta1.transferirACuenta(2000, cuenta1A),false);
		
	}
	
}
