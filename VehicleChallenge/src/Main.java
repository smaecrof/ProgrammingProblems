
public class Main {

	public static void main(String[] args) {
		Civic hatchback = new Civic("Honda Civic Hatchback", 4, 5, "Space Grey", 35, 12); 
		hatchback.upShift();
		System.out.println(hatchback.getCurrentGear()); 
		
		hatchback.changeSpeed(16);
		System.out.println(hatchback.getCurrentSpeed());
	}
}
