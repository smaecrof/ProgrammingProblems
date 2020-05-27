
public class HealthyBurger extends BaseBurger{

	private boolean hasKale; 
	private boolean hasSpinach; 
	
	public HealthyBurger(String name, int nPatties, double price){
		super(name,"Brown Rye Roll",nPatties,price);
	}
	
	public void addKale() {
		this.hasKale = true; 
		this.addToppingCharge();
	}
	
	public void addSpinach() {
		this.hasSpinach = true; 
		this.addToppingCharge(); 
	}
	
	public boolean hasKale() {
		return this.hasKale;
	}
	
	public boolean hasSpinach() {
		return this.hasSpinach; 
	}
	
	@Override
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
		if(this.hasKale()) 
			System.out.println("Kale added: $" + this.getEXTRA_TOPPING_CHARGE()); 
		if(this.hasSpinach()) 
			System.out.println("Spinach added: $" + this.getEXTRA_TOPPING_CHARGE());
		System.out.println("------------------------------------------------");
		System.out.println("Final Price: $" + this.getFinalPrice()); 
	}
	
}
