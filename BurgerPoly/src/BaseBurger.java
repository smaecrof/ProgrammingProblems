
public class BaseBurger {
	
	//CONSTRUCTOR VARIABLES
	private String burgerName; 
	private String breadType; 
	private int numberPattys;
	private double basePrice;
	
	// BURGER TOPPINGS
	private boolean lettuce = false; 
	private boolean tomato = false; 
	private boolean onions = false; 
	private boolean pickles = false;
	
	private double finalPrice;
	private final double EXTRA_TOPPING_CHARGE = 0.99; 
	
	public BaseBurger(String burgerName, String breadType, int nPatties, double price) {
		this.burgerName = burgerName; 
		this.breadType = breadType; 
		this.numberPattys = nPatties;
		this.basePrice = price;
		this.finalPrice = basePrice; 
	}
	
	public void addLettuce() {
		this.lettuce = true; 
		this.addToppingCharge();
	}
	
	public void addTomato() {
		this.tomato = true;
		this.addToppingCharge(); 
	}
	
	public void addOnions() {
		this.onions = true;
		this.addToppingCharge();
	}
	
	public void addPickles() {
		this.pickles = true; 
		this.addToppingCharge();
	}
	
	public void addToppingCharge() {
		this.finalPrice += EXTRA_TOPPING_CHARGE; 
	}
	
	public double getBasePrice() {
		return this.basePrice; 
	}
	
	public double getFinalPrice() {
		return this.finalPrice; 
	}
	
	public String getBurgerName() {
		return burgerName;
	}

	public void setBurgerName(String burgerName) {
		this.burgerName = burgerName;
	}

	public String getBreadType() {
		return breadType;
	}

	public void setBreadType(String breadType) {
		this.breadType = breadType;
	}

	public int getNumberPattys() {
		return numberPattys;
	}

	public void setNumberPattys(int numberPattys) {
		this.numberPattys = numberPattys;
	}

	public boolean hasLettuce() {
		return lettuce;
	}

	public boolean hasTomato() {
		return tomato;
	}

	public boolean hasOnions() {
		return onions;
	}

	public boolean hasPickles() {
		return pickles;
	}
	
	public double getEXTRA_TOPPING_CHARGE() {
		return EXTRA_TOPPING_CHARGE;
	}

	public void printBurgerReceipt() {
		System.out.println(this.getBurgerName() + " Burger Receipt"); 
		System.out.println("Base Price: $" + this.getBasePrice());
		System.out.println("Bread Type: " + this.getBreadType()); 
		if(this.hasLettuce()) 
			System.out.println("Lettuce added: $" + this.getEXTRA_TOPPING_CHARGE()); 
		if(this.hasTomato())
			System.out.println("Tomato added: $" + this.getEXTRA_TOPPING_CHARGE()); 
		if(this.hasOnions())
			System.out.println("Onions added: $" + this.getEXTRA_TOPPING_CHARGE());
		if(this.hasPickles())
			System.out.println("Pickles added: $" + this.getEXTRA_TOPPING_CHARGE()); 
		System.out.println("------------------------------------------------");
		System.out.println("Final Price: $" + this.getFinalPrice()); 
	}
	
	
}
