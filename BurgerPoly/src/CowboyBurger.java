
public class CowboyBurger extends BaseBurger{

	private boolean friedOnionRings = true;
	private boolean bbqSauce = true;
	private boolean friedJalapenos = true;
	private boolean chipsAndDrink = true;
	
	private double priceChipsAndDrink = 2.99;
	private double cowboyFinalPrice; 
	
	public CowboyBurger(String name,int nPatties, double price) {
		super(name,"Brioche bun", nPatties, price);
		this.cowboyFinalPrice = this.getFinalPrice() + priceChipsAndDrink; 
	}
	
	/*
	 * I don't want to allow this burger class to add these toppings from 
	 * the parent class so I'm just going to override them and leave out further 
	 * implementation details. I'm sure there is a better way to limit a child class's
	 * inherited features. 
	 */
	@Override
	public void addLettuce() {
	}
	@Override
	public void addTomato() {
	}
	@Override
	public void addOnions() {
	}
	@Override
	public void addPickles() {
	}
	
	
	@Override
	public void printBurgerReceipt() {
		System.out.println(this.getBurgerName() + " Burger Receipt"); 
		System.out.println("Base Price: $" + this.getBasePrice());
		System.out.println("Bread Type: " + this.getBreadType()); 
		System.out.println("Toppings: Fried Onion Rings, BBQ, Fried Jalapenos");
		System.out.println("Chips and Drink: $" + this.priceChipsAndDrink); 
		System.out.println("------------------------------------------------");
		System.out.println("Final Price: $" + this.cowboyFinalPrice); 
	}
	
}
