package edu.rcc;

public class Person {
	private String name;
	private boolean scratched = false;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public void walks(Cat cat) {
		if (cat.getHappinessLevel() < 0) {
			this.scratched = true;
			System.out.println(this.name + ": Ouch!");
		}
		cat.setHappinessLevel(cat.getHappinessLevel() - 100);
	}
}
