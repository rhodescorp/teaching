package edu.rcc.sanity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.rcc.calc.Calculator;
import edu.rcc.calc.NegativeNumberException;

public class TestCalculator {

	private Calculator calc;
	@Before
	public void setup() {
		calc = new Calculator();
	}
	
	@Test
	public void testAdd() {
		int a = -1;
		int b = 3;
		
		try {
			assertEquals(5, calc.add(a, b));
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			System.out.println("failed on ints: " 
					+ e.getA() +  ", " + e.getB());
			e.printStackTrace();
			fail("negative numbers used");
		}
		
		
		assertTrue(a < b);
	}

	@Test
	public void testSubtract() {
		int a = 2;
		int b = -5;
		assertEquals(-7, calc.subtract(b, a));
	}
	
	@Test
	public void testModulus() {
		
		int b = 10;
		int c = 15;
		int result = c % b; //5
		
		assertEquals(result, calc.modulo(c, b));
	}
	
	
	@Test
	public void testDivision() {
		int a = 64;
		int b = 0;
		try {
			
			int resultActual = calc.divide(a, b);
			int resultExpected = a / b; //8
			assertEquals(resultExpected, resultActual);

		} catch (Exception e) {
			e.printStackTrace();
			fail("Exception thrown");
		}
		
		
		
		
	}
}
