/**
 * Description: Testing Composition
 * @author MaeCroft22
 * Date Created: 05/26/2020
 * Date Last Modified: 05/26/2020
 */
public class Main {

	public static void main(String[] args) {
		Couch theCouch = new Couch("LoveSeat","Warby",220,500,56,"Leather","Tan");
		TV theTV = new TV("HDRmax", new Manufacturer("Samsung"), 2018,16,38,1080);
		
		Room theRoom = new Room(theTV,theCouch, 989, 10); 
		
		theRoom.turnTVon(); 

	}

}
