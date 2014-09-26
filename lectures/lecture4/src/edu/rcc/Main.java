package edu.rcc;

public class Main {
	public static void main (String[] args) {
		Person agentX = new Person("James Bond");
		Cat max = new Cat();
		agentX.walks(max);
		agentX.walks(max);
		agentX.walks(max);
		Cat superMax = new UberCat();
		if (superMax instanceof UberCat) {
			UberCat uberVersion = (UberCat)superMax;
		}
		for (int i = 0; i < 6; ++i) {
			agentX.walks(superMax);
		}
	}
}
