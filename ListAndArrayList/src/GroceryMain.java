import java.util.Scanner;

public class GroceryMain {
	
	private static Scanner scanner = new Scanner(System.in); 
	private static GroceryList groceryList = new GroceryList();
	
	public static void main(String[] args) {
		 
		boolean quit = false; 
		int choice = 0; 
		printInstructions(); 
		
		while(!quit) {
			System.out.println("Enter your choice: "); 
			choice = scanner.nextInt(); 
			scanner.nextLine(); 
			
			switch(choice) {
				case 0:
					printInstructions();
					break;
				case 1:
					groceryList.printGroceryList(); 
					break;
				case 2:
					addItem();
					break;
				case 3:
					modifyItem();
					break;
				case 4:
					removeItem();
					break;
				case 5:
					searchForItem();
					break;
				case 6:
					quit = true; 
					break; 
			}
		}

	}
	
	
	public static void printInstructions() {
		System.out.println("\nPress ");
		System.out.println("\t 0 - To print choice options.\r");
		System.out.println("\t 1 - To print the list of grocery items.\r");
		System.out.println("\t 2 - To add an item to the list.\r");
		System.out.println("\t 3 - To modify an item in the list.\r");
		System.out.println("\t 4 - To remove an item from the list.\r");
		System.out.println("\t 5 - To search for an item in the list.\r");
		System.out.println("\t 6 - To quit the application.\n");
	}
	
	public static void addItem() {
		System.out.println("Please enter the grocery item: ");
		groceryList.addGroceryItem(scanner.nextLine()); 
	}

	public static void modifyItem() {
		System.out.println("Enter item number: ");
		int itemNo = scanner.nextInt();
		scanner.nextLine(); 
		System.out.println("Enter replacement item:");
		String newItem = scanner.nextLine(); 
		groceryList.modifyGroceryItem(itemNo-1, newItem);
	}
	
	public static void removeItem() {
		System.out.println("Enter the position of the item to be removed: ");
		int itemPosition = scanner.nextInt(); 
		scanner.nextLine();
		groceryList.removeGroceryItem(itemPosition -1);
	}
	
	public static void searchForItem() {
		System.out.println("Enter the item name for the list search: ");
		String itemName = scanner.nextLine();
		if(groceryList.findItem(itemName) != null) {
			System.out.println("Found " + itemName + " in the grocery list");
		} else {
			System.out.println(itemName + " was not found in the grocery list"); 
		}
	}
}
