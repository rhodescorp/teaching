package edu.rcc.load;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import edu.rcc.calc.Calculator;
import edu.rcc.calc.NegativeNumberException;

public class TestCalculatorRobust {

	@Test
	public void testAdd() throws NegativeNumberException {
		Random r = new Random(System.currentTimeMillis());
		Calculator calc = new Calculator();
		for (int i = 0; i < 10000000; ++i) {
			
			int a = Math.abs(r.nextInt());
			int b = Math.abs(r.nextInt());
			int z = a + b;
			assertEquals(z, calc.add(a, b));
		}
		
	}

}
