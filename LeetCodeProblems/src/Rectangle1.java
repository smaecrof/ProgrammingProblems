/**
 * Created by SMC on 05/24/2020
 * @author MaeCroft22
 * 
 * Just an example of creating good constructors using constructor chaining 
 *
 */
public class Rectangle1 {

	private int x; 
	private int y; 
	private int width; 
	private int height; 
	
	// 1st constructor 
	public Rectangle1() {
		this(0,0); // Calls second constructor 
	}
	
	// 2nd constructor 
	public Rectangle1(int width, int height) {
		this(0,0,width,height); // Calls third constructor 
	}
	
	// 3rd constructor 
	public Rectangle1(int x, int y, int width, int height) {
		// This is where all initialization is done
		this.x = x; 
		this.y = y; 
		this.width = width; 
		this.height = height; 
	}
}
