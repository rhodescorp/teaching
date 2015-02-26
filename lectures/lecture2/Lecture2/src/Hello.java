
public class Hello {
	
	public Hello() {
		
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		Hello helloObj = new Hello();
		
		Car shelbyMustang = new Car("Ford", 1969);
		Car toyotaCorolla = new Car("Toyota", 2011);
		
		String shelbyMake = shelbyMustang.getMake();
		System.out.println(shelbyMake);
		shelbyMustang.setMake("Lamborgini");
		System.out.println(shelbyMustang.getMake());
		
		toyotaCorolla.setMake(shelbyMustang.getMake());
		System.out.println(toyotaCorolla.getMake());
		
		int foo = 3;
		int bar = 4;
		int sum = helloObj.add(foo, bar);
		System.out.println(sum);
	}
}
