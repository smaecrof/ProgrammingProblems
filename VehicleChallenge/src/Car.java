
public class Car extends Vehicle{
	
	private String color; 
	private int gearBox; 
	private int currentGear;
	
	
	public Car(String name, int numWheels, int gearBox, String color) {
		super(name, numWheels);
		this.color = color;
		this.currentGear = 0; 
		this.gearBox = gearBox; 
	}
	
	
	public int getCurrentGear() {
		return this.currentGear; 
	}
	
	public void upShift() {
		if(currentGear >= 0 && currentGear < gearBox) {
			this.currentGear += 1; 
		} else {
			System.out.println("Already in top gear"); 
		}
	}
	
	public void downShift() {
		if(currentGear > 1) {
			this.currentGear -= 1; 
		} else {
			System.out.println("Already in first gear"); 
		}
	}
	
}
