/**
 * Description: Just a component class to be added to a "room" class 
 *   in order to better understand why composition can be a better alternative
 *   to using inheritance. 
 * @author MaeCroft22
 * Date Created: 05/26/2020
 * Date Last Modified: 05/26/2020
 */
public class Couch {
	
	private String name; 
	private String manufacturer; 
	private int weight; 
	private int width; 
	private int height; 
	private String materialType; //Cloth, leather, etc. 
	private String color;
	
	
	public Couch(String name, String manufacturer, int weight, int width, int height, String materialType,
			String color) {
		this.name = name;
		this.manufacturer = manufacturer;
		this.weight = weight;
		this.width = width;
		this.height = height;
		this.materialType = materialType;
		this.color = color;
	}


	public String getName() {
		return name;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public int getWeight() {
		return weight;
	}


	public int getWidth() {
		return width;
	}


	public int getHeight() {
		return height;
	}


	public String getMaterialType() {
		return materialType;
	}


	public String getColor() {
		return color;
	} 
	
	
}
