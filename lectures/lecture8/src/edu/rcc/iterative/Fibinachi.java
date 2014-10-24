package edu.rcc.iterative;

public class Fibinachi {

	public int fib(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		int previous = 1;
		int previous2 = 1;
		for (int i = 3; i < n; ++i) {
			int current = previous + previous2;
			previous = previous2;
			previous2 = current;
		}
		return previous2;
	}
}
