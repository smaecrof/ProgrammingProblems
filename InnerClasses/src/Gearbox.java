import java.util.ArrayList;

public class Gearbox {

	private ArrayList<Gear> gears;
	private int maxGears; 
	private int currentGear = 0; 
	private boolean clutchIsIn; 
	
	public Gearbox(int maxGears) {
		this.maxGears = maxGears; 
		this.gears = new ArrayList<>(); 
		Gear neutral = new Gear(0,0.0); 
		this.gears.add(neutral); 
		
		for (int i = 0; i < this.maxGears; i++) {
			addGear(i, i*5.3); 
		}
	}
	
	public void operateClutch(boolean in) {
		this.clutchIsIn = in; 
	}
	
	public void addGear(int gearNumber, double gearRatio) {
		if((gearNumber > 0) && (gearNumber <= maxGears)){
			this.gears.add(new Gear(gearNumber, gearRatio)); 
		}
	}
	
	public void changeGear(int newGear) {
		if((newGear >= 0) && (newGear < this.gears.size()) && this.clutchIsIn) {
			this.currentGear = newGear; 
			System.out.println("Gear " + newGear + " selected"); 
		} else {
			System.out.println("Grind!"); 
			this.currentGear = 0; 
		}
	}
	
	public double wheelSpeed(int revs) {
		if(clutchIsIn) {
			System.out.println("Scream!");
			return 0.0; 
		}
		
		return revs * gears.get(currentGear).getRatio(); 
	}
	
	private class Gear {
		private int gearNumber; 
		private double gearRatio; 
		
		public Gear(int gearNumber, double gearRatio) {
			this.gearNumber = gearNumber; 
			this.gearRatio = gearRatio; 
		}
		
		public double driveSpeed(int revs) {
			return (revs * this.gearRatio); 
		}
		
		public double getRatio() {
			return this.gearRatio; 
		}
	}
}
