package ar.edu.unlp.info.oo1.ejercicio16;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.ejercicio17.DateLapse2;

public class DateLapseTest {
	private DateLapse2 lapso;
	
	@BeforeEach
	void setUp() {
		this.lapso = new DateLapse2();
	}
	
	@Test
	void validarDiasMaximo() {
		this.lapso.setFrom(LocalDate.MAX.getYear(), LocalDate.MAX.getMonthValue(), LocalDate.MAX.getDayOfMonth());
		assertEquals(this.lapso.sizeInDays(),0);
		this.lapso.setFrom(LocalDate.MAX.getYear(), LocalDate.MAX.getMonthValue(), LocalDate.MAX.minusDays(5).getDayOfMonth());
		assertEquals(this.lapso.sizeInDays(),5);
	}
	
	@Test
	void validarDiasMinimo() {
		this.lapso.setTo(LocalDate.MIN.getYear(), LocalDate.MIN.getMonthValue(), LocalDate.MIN.getDayOfMonth());
		assertEquals(this.lapso.sizeInDays(),0);
		this.lapso.setTo(LocalDate.MIN.getYear(), LocalDate.MIN.getMonthValue(), LocalDate.MIN.plusDays(5).getDayOfMonth());
		assertEquals(this.lapso.sizeInDays(),5);
	}
	
	@Test
	void validarDias() {
		assertEquals(this.lapso.sizeInDays(),(int) LocalDate.MIN.until(LocalDate.MAX,ChronoUnit.DAYS));
		
		this.lapso.setFrom(LocalDate.MAX.getYear(), LocalDate.MAX.getMonthValue(), LocalDate.MAX.getDayOfMonth());
		this.lapso.setTo(LocalDate.MIN.getYear(), LocalDate.MIN.getMonthValue(), LocalDate.MIN.getDayOfMonth());
		assertEquals(this.lapso.sizeInDays(),-((int) LocalDate.MIN.until(LocalDate.MAX,ChronoUnit.DAYS)));
		
		this.lapso.setFrom(1972, 12, 15);
		this.lapso.setTo(2032, 12, 15);
		assertEquals(this.lapso.sizeInDays(),21915);
	}
	
	@Test
	void validarRangoLimiteMaximo() {
		assert(this.lapso.includesDate(LocalDate.MAX));
		this.lapso.setFrom(LocalDate.MAX.getYear(), LocalDate.MAX.getMonthValue(), LocalDate.MAX.getDayOfMonth());
		assert(this.lapso.includesDate(LocalDate.MAX));
	}
	
	@Test
	void validarRangoLimiteMinimo() {
		assert(this.lapso.includesDate(LocalDate.MIN));
		this.lapso.setTo(LocalDate.MIN.getYear(), LocalDate.MIN.getMonthValue(), LocalDate.MIN.getDayOfMonth());
		assert(this.lapso.includesDate(LocalDate.MIN));
	}
	
	@Test
	void validarRangos() {
		assert(this.lapso.includesDate(LocalDate.of(2032, 12, 15)));
		
		this.lapso.setFrom(1972, 12, 15);
		this.lapso.setTo(2032, 12, 15);
		
		assert(this.lapso.includesDate(LocalDate.of(1972, 12, 15)));
		assert(this.lapso.includesDate(LocalDate.of(2032, 12, 15)));
		assert(this.lapso.includesDate(LocalDate.now())); //Puede variar segun cuando se ejecute este programa
		assertFalse(this.lapso.includesDate(LocalDate.of(2050, 12, 13)));
	}
	
}
