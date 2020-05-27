
/**
 * Description: This is a simple program that reaffirms ideas of polymorphism and code reuse. 
 * @author MaeCroft22
 * Date Created: 05/26/2020
 * Date Last Modified: 05/26/2020
 */

class Car {
	
	private String name; 
	private boolean engine = true; 
	private int numberCylinders; 
	private int wheels = 4;  
	
	public Car(String name, int nCylinders) {
		this.name = name; 
		this.numberCylinders = nCylinders; 
	}

	// GETTERS
	public String getName() {
		return name;
	}

	public boolean isEngine() {
		return engine;
	}

	public int getNumberCylinders() {
		return numberCylinders;
	}

	public int getWheels() {
		return wheels;
	}
	
	// Other METHODS 
	public void startEngine() {
		System.out.println("Generic Engine Started"); 
	}
	
	public void accelerate() {
		System.out.println("Generic Acceleration"); 
	}
	
	public void brake() {
		System.out.println("Generic Brake"); 
	}
}


class Ferrari extends Car {
	
	public Ferrari(String name, int nCylinders) {
		super(name, nCylinders); 
	}
	
	@Override 
	public void startEngine() {
		System.out.println("Ferrari starting"); 
	}
	
	@Override 
	public void accelerate() {
		System.out.println("Ferrari Accelerating"); 
	}
	
	@Override 
	public void brake() {
		System.out.println("Ferrari Braking"); 
	}
}


class Honda extends Car {
	
	public Honda(String name, int nCylinders) {
		super(name, nCylinders);
	}
	
	@Override 
	public void startEngine() {
		System.out.println("Honda Starting");
	}
	
	@Override 
	public void accelerate() {
		System.out.println("Honda Accelerating"); 
	}
	
	@Override 
	public void brake() {
		System.out.println("Honda Braking"); 
	}
	
}

class Jeep extends Car{
	
	public Jeep(String name, int nCylinders) {
		super(name,nCylinders);
	}
	
	@Override 
	public void startEngine() {
		System.out.println("Jeep Starting"); 
	}
	
	@Override 
	public void accelerate() {
		System.out.println("Jeep Accelerating"); 
	}
	
	@Override 
	public void brake() {
		System.out.println("Jeep braking"); 
	}
}


public class CarsMain {

	public static void main(String[] args) {
		Jeep jeep = new Jeep("Rubicon",6);
		Honda civic = new Honda("Civic Hatchback", 4);
		Ferrari ferrari = new Ferrari("488 Spyder", 8);
		
		System.out.println("Start your engines");
		jeep.startEngine();
		civic.startEngine();
		ferrari.startEngine();
		
		System.out.println("\n3...2...1... GO!!");
		jeep.accelerate();
		civic.accelerate();
		ferrari.accelerate();
		
		System.out.println("\nAnd the Ferrari wins!");
		jeep.brake();
		civic.brake();
		ferrari.brake(); 
		
		Car car = new Car("No Name Car", 1); 
		System.out.println("\n");
		car.startEngine(); 
		car.accelerate();
		car.brake();
		
	}
}
