/**
 * Created by SMC on 05/26/2020
 */
public class Monitor {

	private String model; 
	private String manufacturer; 
	private int size; 
	private Resolution nativeResolution;
	
	public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	} 
	
	public void drawPixelAt(int x, int y, String color) {
		System.out.println("Drawing Pixel at " + x + ", " + y + " in color" + color); 
	}
	
	
}
