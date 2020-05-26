
public class Circle {
	
	private double radius; 
	
	public Circle(double r) {
		if(r < 0) {
			this.radius = 0;
		} else {
			this.radius = r; 
		}
	}
	
	public double getRadius() {
		return this.radius; 
	}
	
	public double getArea() {
		return Math.PI * (radius * radius); 
	}
}
