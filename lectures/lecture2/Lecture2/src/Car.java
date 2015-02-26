
public class Car {
	
	private String make;
	private int year;

	public Car(String make) {
		this.make = make;
	}

	public Car(String make, int year) {
		super();
		this.make = make;
		this.year = year;
	}
	
	/**
	 * @return - the value of make
	 */
	public String getMake() {
		return this.make;
	}
	
	/**
	 * @param make - sets the value of make
	 */
	public void setMake(String make) {
		this.make = make;
	}
	
	
	
}
