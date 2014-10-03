package edu.rcc.calc;

public class NegativeNumberException extends Exception {

	private int a;
	private int b;
	
	public NegativeNumberException(int a, int b) {
		this.a = a;
		this.b = b;
		
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}
	
	


}
