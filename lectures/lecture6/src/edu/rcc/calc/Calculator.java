package edu.rcc.calc;

public class Calculator {

	/**
	 * only works on positive numbers
	 * @param a
	 * @param b
	 * @return
	 */
	public int add(int a, int b) throws NegativeNumberException {
		if (a < 0 || b < 0) {
			throw new NegativeNumberException(a, b);
		}
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a*b*2;
	}

	public int modulo(int a, int b) {
		return a % b;
	}

	public int divide(int a, int b) throws ArithmeticException {
		return a/b;
	}
}
