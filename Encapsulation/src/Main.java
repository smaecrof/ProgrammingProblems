
public class Main {

	public static void main(String[] args) {
		
		
		/* Example of bad practice 
		// Public scope for player's instance variables 
		Player player = new Player(); 
		player.name = "Spencer"; 
		player.health = 20; 
		player.weapon = "Sword"; 
		
		int damage = 10; 
		player.loseHealth(damage);
		System.out.println("Remaining Health = " + player.healthRemaining()); 
		
		damage = 11; 
		player.loseHealth(damage);
		System.out.println("Remaining Health = " + player.healthRemaining()); 
		*/
		
		EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "Sword"); 
		System.out.println("Initial health is: " + player.getHealth());
		
		player.loseHealth(40);
		System.out.println("Current health is: " + player.getHealth()); 
		
		Printer printer = new Printer(true, 60); 
		
		System.out.println(printer.isDuplex()); 
		System.out.println(printer.getCurrentTonerLevel()); 
		printer.fillToner();
		
		System.out.println(printer.getCurrentTonerLevel()); 
	}
}
