
public class Main {
	
	public static void main(String[] args) {
		BaseBurger baseBurger = new BaseBurger("Regular Double","Brioche", 2, 6.99);
		baseBurger.addLettuce();
		baseBurger.addPickles();
		baseBurger.addOnions();
		baseBurger.printBurgerReceipt();
		
		System.out.println();
		HealthyBurger healthyBurger = new HealthyBurger("Grass Burger", 1, 7.99);
		healthyBurger.addKale();
		healthyBurger.addSpinach();
		healthyBurger.printBurgerReceipt();
		
		System.out.println();
		CowboyBurger cowboyBurger = new CowboyBurger("Cowboy Burger", 2, 10.99);
		cowboyBurger.printBurgerReceipt();
	}
	
	
}
