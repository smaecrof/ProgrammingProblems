
public class Civic extends Car{
	
	private int mpg; 
	private int gasTankCapacity; 
	private int currentFuelLevel; 
	
	public Civic(String name, int numWheels, int gearBox, String color, int mpg, int gTC) {
		super(name, numWheels, gearBox, color); 
		this.mpg = mpg; 
		this.gasTankCapacity = gTC; 
	}
	
	public int getMileRange() {
		return this.mpg * this.currentFuelLevel; 
	}
	
	public void setFuelLevel(int fuelAmount) {
		if(fuelAmount > 0 && fuelAmount + fuelAmount <= gasTankCapacity) {
			this.currentFuelLevel += fuelAmount; 
		} else {
			System.out.println("Could not fuel up"); 
		}
	}
}
