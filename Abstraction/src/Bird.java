
public abstract class Bird extends Animal implements CanFly{

	public Bird(String name) {
		super(name);
	}
	
	@Override
	public void breathe() {
		System.out.println("Breathe in, breathe out, birds breathe too");
	}
	
	@Override
	public void eat() {
		System.out.println("Pecking away at seeds"); 
	}
	
	
	@Override
	public void fly() {
		System.out.println("Flapping wings"); 
	}
}
