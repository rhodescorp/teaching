package edu.rcc;

public class UberCat extends Cat {
	public UberCat() {
		this.happinessLevel = 200;
	}
	
	@Override
	public void setHappinessLevel(int happinessLevel) {
		this.happinessLevel = happinessLevel + 50;
	}
}
