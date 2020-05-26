/**
 * Description: Just a component class to be added to a "room" class 
 *   in order to better understand why composition can be a better alternative
 *   to using inheritance. 
 * @author MaeCroft22
 * Date Created: 05/26/2020
 * Date Last Modified: 05/26/2020
 */
public class Manufacturer {
	
	private String name;

	public Manufacturer(String name) {
		this.name = name;
	} 
	
	public void printLogo() {
		System.out.println("Displaying " + name + "'s logo"); 
	}
}
