import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;



public class Demo {

	public static void main(String[] args) {
		LinkedList<String> placesToVisit = new LinkedList<String>(); 
		addInOrder(placesToVisit, "Sydney");
		addInOrder(placesToVisit, "Canada"); 
		addInOrder(placesToVisit, "Michigan"); 
		addInOrder(placesToVisit, "Austin"); 
		addInOrder(placesToVisit, "Sydney"); 
		printList(placesToVisit); 
		
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
	
}
