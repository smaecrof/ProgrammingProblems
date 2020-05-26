/**
 * Description: Just a component class to be added to a "room" class 
 *   in order to better understand why composition can be a better alternative
 *   to using inheritance. 
 * @author MaeCroft22
 * Date Created: 05/26/2020
 * Date Last Modified: 05/26/2020
 */
public class Room {
	private TV theTV; 
	private Couch theCouch; 
	private int sqFeet; 
	private int ceilingHeight;
	
	
	public Room(TV theTV, Couch theCouch, int sqFeet, int ceilingHeight) {
		this.theTV = theTV;
		this.theCouch = theCouch;
		this.sqFeet = sqFeet;
		this.ceilingHeight = ceilingHeight;
	}


	public void turnTVon() {
		theTV.powerOn();
	}
	
	
}
