/**
 * Description: Just a component class to be added to a "room" class 
 *   in order to better understand why composition can be a better alternative
 *   to using inheritance. 
 * @author MaeCroft22
 * Date Created: 05/26/2020
 * Date Last Modified: 05/26/2020
 */
public class TV {
	
	private String name; 
	private Manufacturer manufacturer; 
	private int yearMade; 
	private int voltage; 
	private int size; //Inches (diagonal length)
	private int pixelDensity;
	
	
	public TV(String name, Manufacturer manufacturer, int yearMade, int voltage, int size, int pixelDensity) {
		this.name = name;
		this.manufacturer = manufacturer;
		this.yearMade = yearMade;
		this.voltage = voltage;
		this.size = size;
		this.pixelDensity = pixelDensity;
	}
	
	public void powerOn() {
		System.out.println("Powering TV on"); 
		manufacturer.printLogo();
	}

	// GETTERS METHODS 
	public String getName() {
		return name;
	}

	public int getYearMade() {
		return yearMade;
	}


	public int getVoltage() {
		return voltage;
	}


	public int getSize() {
		return size;
	}


	public int getPixelDensity() {
		return pixelDensity;
	} 
	
	
}
