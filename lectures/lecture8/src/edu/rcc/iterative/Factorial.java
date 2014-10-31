package edu.rcc.iterative;

public class Factorial {

	public int fact(int n) {
		int result = 1;
		for (int i = n; i >= 1; --i) {
			result *= n;
		}
		return result;
	}
}
