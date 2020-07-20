import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;



public class Demo {

	public static void main(String[] args) {
		LinkedList<String> placesToVisit = new LinkedList<String>(); 
		addInOrder(placesToVisit, "Sydney");
		addInOrder(placesToVisit, "Canada"); 
		addInOrder(placesToVisit, "Michigan"); 
		addInOrder(placesToVisit, "Austin"); 
		addInOrder(placesToVisit, "Sydney"); 
		printList(placesToVisit); 
		visit(placesToVisit); 
		
	}
	
	private static void printList(LinkedList<String> linkedList) {
		Iterator<String> i = linkedList.iterator(); 
		
		while(i.hasNext()) {
			System.out.println("Now visiting " + i.next());
		}
		
		System.out.println("=============\n"); 
	}
	
	private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
		
		ListIterator<String> stringListIterator = linkedList.listIterator(); 
		
		while(stringListIterator.hasNext()) {
			// Iterator objects need to be initialized to the first instance of the string list (below) 
			int comparison = stringListIterator.next().compareTo(newCity); 
			if(comparison == 0) {
				// The cities are equal, do not add (duplicates)
				System.out.println(newCity + " is already included as a destination"); 
				return false; 
			} else if(comparison > 0) {
				// newCity should be added before this one
				stringListIterator.previous(); 
				stringListIterator.add(newCity);
				return true; 
			} else if(comparison < 0) {
				// move on to next city
				// .next() already called so this block is fine like it is
			} 
		}
		
		// newCity is added to the end of the linkedList 
		stringListIterator.add(newCity);
		return true; 
	}
	
	
	private static void visit(LinkedList cities) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false; 
		boolean goingForward = true; 
		ListIterator<String> listIterator = cities.listIterator(); 
		
		if(cities.isEmpty()) {
			System.out.println("No cities in the itenerary"); 
			return;
		} else {
			System.out.println("Now visiting " + listIterator.next());
			printMenu(); 
		}
		
		while(!quit) {
			int action = scanner.nextInt(); 
			scanner.nextLine(); 
			
			switch(action) {
			case 0:
				System.out.println("Holiday (Vacation) is over"); 
				quit = true; 
				break; 
			case 1:
				if(listIterator.hasNext()) {
					System.out.println("Now visiting " + listIterator.next());
				} else {
					System.out.println("Reached the end of the list"); 
				}
				break; 
			case 2:
				if(listIterator.hasPrevious()) {
					System.out.println("Now visiting " + listIterator.previous()); 
				} else {
					System.out.println("We are at the start of the list"); 
				}
				break; 
			case 3:
				printMenu(); 
				break; 
			}
		}
	}
	
	private static void printMenu() {
		System.out.println("Available actions:\npress"); 
		System.out.println("0 - to quit\n" +  
				"1 - go to next city\n"+
				"2 - go to previous city\n" + 
				"3 - print the menu options"); 
	}
	
}
