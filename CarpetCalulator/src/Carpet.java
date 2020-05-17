
public class Carpet {
	
	private double cost; 
	
	public Carpet(double c) {
		if(c < 0) {
			this.cost = 0; 
		}
		this.cost = c; 
	}
	
	public double getCost() {
		return this.cost; 
	}
}
