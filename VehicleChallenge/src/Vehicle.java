/**
 * Parent class for all Vehicles 
 * @author MaeCroft22
 *
 */
public class Vehicle {
	private String name; 
	private int numberWheels;
	private int steeringDirection; 
	private int currentSpeed;
	
	
	public Vehicle(String name, int numberWheels) {
		super();
		this.name = name;
		this.numberWheels = numberWheels;
		this.steeringDirection = 0; 
		this.currentSpeed = 0;
	} 
	
	public void changeSpeed(int speed) {
		if(speed >= 0 && speed <= 120) {
			this.currentSpeed = speed; 
		} else {
			System.out.println("Not a valid speed for a vehicle"); 
		}
	}
	
	public void changeDirection(int directionAmt) {
		if(directionAmt >= 0 && directionAmt <= 12) {
			this.steeringDirection = directionAmt; 
		}
	}
	
	public int getCurrentSpeed() {
		return this.currentSpeed; 
	}
	
	
	
}
