package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;
import pkg.Movimiento;

class CuentaTest {
	
	Cuenta cuenta, cuenta1, cuenta2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta = new Cuenta("98765", 0d, "Raimundo", new ArrayList<Movimiento>());
		cuenta1 = new Cuenta("12345", 50d, "Ana", new ArrayList<Movimiento>());
		cuenta2 = new Cuenta("67890", 0d, "Samuel", new ArrayList<Movimiento>());
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testIngresar() {
		cuenta.ingresar(1.0);
		assertEquals(1, cuenta.getSaldo());
	}
	
	@Test
	void testRetirar() {
		cuenta.retirar(1.0);
		assertEquals(-1, cuenta.getSaldo());
	}
	
	@Test
	void test0014() {
		boolean cuenta1Bool = false, cuenta2Bool = false;
		
		cuenta1.retirar(200d);
		cuenta2.retirar(350d);
		cuenta1.ingresar(100d);
		cuenta2.retirar(200d);
		cuenta2.retirar(150d);
		cuenta1.retirar(200d);
		cuenta2.ingresar(50d);
		cuenta2.retirar(100d);
		
		if(cuenta1.getSaldo() == -250d){
			cuenta1Bool = true;
		}
		
		if(cuenta2.getSaldo() == -450d) {
			cuenta2Bool = true;
		}
		
		List<Movimiento> movimientos = cuenta1.getMovimientos();
		List<Movimiento> movimientos2 = cuenta2.getMovimientos();
		System.out.println("Cuenta " + cuenta1.getNumero() + ":");
		
		for(Movimiento m : movimientos) {
			System.out.println(m.getImporte());
		}
		
		System.out.println("Cuenta " + cuenta2.getNumero() + ":");
		
		for(Movimiento m : movimientos2) {
			System.out.println(m.getImporte());
		}
		
		assertTrue(cuenta1Bool && cuenta2Bool);
	}
	

}
