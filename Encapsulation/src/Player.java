/**
 * Description: A component class used to learn more about
 * encapsulation  
 * @author MaeCroft22
 * Date Created: 05/26/2020
 * Date Last Modified: 05/26/2020
 */
public class Player {
	
	public String name; 
	public int hitPoints; 
	public String weapon;
	
	public void loseHealth(int damage) {
		this.hitPoints = this.hitPoints - damage; 
		
		if(this.hitPoints <= 0) {
			System.out.println("Player knocked out");
			// reduce number of lives remaining for the player 
		}
	}
	
	public int healthRemaining() {
		return this.hitPoints; 
	}
	
	
}
