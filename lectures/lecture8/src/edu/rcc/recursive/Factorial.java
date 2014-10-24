package edu.rcc.recursive;

public class Factorial {

	public int fact (int n) {
		if (n == 1) {
			return n;
		} else {
			//int previous = fact(n-1);
			//int result = n * previous;
			//return result;
			return n*fact(n-1);
		}
	}
}
