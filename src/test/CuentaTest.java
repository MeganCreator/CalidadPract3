package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Calculadora;
import pkg.Cuenta;

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
		cuenta = new Cuenta("98765", 0d);
		cuenta1 = new Cuenta("12345", 50d);
		cuenta2 = new Cuenta("67890", 0d);
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
		
		cuenta1.retirar(200.0);
		cuenta2.retirar(350.0);
		cuenta1.ingresar(100.0);
		cuenta2.retirar(200.0);
		cuenta2.retirar(150.0);
		cuenta1.retirar(200.0);
		cuenta2.ingresar(50.0);
		cuenta2.retirar(100.0);
		
		if(cuenta1.getSaldo() == -250){
			cuenta1Bool = true;
		}else if(cuenta2.getSaldo() == -450) {
			cuenta2Bool = true;

		}
		
		assertTrue(cuenta1Bool && cuenta2Bool);
	}
	

}
