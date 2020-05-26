
public class Rectangle {
	
	private double width; 
	private double length; 
	
	public Rectangle(double w, double l) {
		
		this.width = w; 
		this.length = l; 
		
		// Modify values if less than 0
		if(w < 0) {
			this.width = 0; 
		}
		if(l < 0) {
			this.length = 0; 
		}
	}
	
	public double getWidth() {
		return this.width; 
	}
	
	public double getLength() {
		return this.length; 
	}
	
	public double getArea() {
		return this.length * this.width; 
	}
}
