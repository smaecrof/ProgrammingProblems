import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static Button btnPrint = new Button("Print"); 
	
	public static void main(String[] args) {
	
//		Gearbox Mclaren = new Gearbox(6); // Outer class (GEARBOX)
//		Mclaren.operateClutch(true);
//		Mclaren.changeGear(1);
//		Mclaren.operateClutch(false);
//		System.out.println(Mclaren.wheelSpeed(1000)); 
//		Mclaren.changeGear(2);
//		System.out.println(Mclaren.wheelSpeed(3000)); 
//		Mclaren.operateClutch(true);
//		Mclaren.changeGear(3);
//		Mclaren.operateClutch(false);
//		System.out.println(Mclaren.wheelSpeed(6000)); 
		
		
//      LOCAL/INNER CLASS EXAMPLE
//		
//		class ClickListener implements Button.OnClickListener{
//			public ClickListener() {
//				System.out.println("I've been attached"); // Listener has been attached to the Button Object
//			}
//			
//			@Override 
//			public void onClick(String title) {
//				System.out.println(title + " was clicked"); 
//			}
//		}
//		
//		btnPrint.setOnClickListener(new ClickListener());
		
		
//		ANONYMOUS CLASS EXAMPLE
		btnPrint.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(String title) {
				System.out.println(title + " was clicked");
			}
		});
		listen(); 
	}
	
	private static void listen() {
		boolean quit = false; 
		
		while(!quit) {
			int choice = scanner.nextInt(); 
			scanner.nextLine(); 
			
			switch(choice) {
				case 0: 
					quit = true; 
					break;
					
				case 1: 
					btnPrint.onClick(); 
					break; 
			}
		}
	}
}
