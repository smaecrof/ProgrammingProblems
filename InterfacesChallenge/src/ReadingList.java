import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadingList implements ISaveable{

	private String listName; 
	private int bookCount; 
	private ArrayList<String> bookList; 
	
	public ReadingList(String listName) {
		this.bookList = new ArrayList<String>(); 
	}
	
	public String getListName() {
		return this.listName; 
	}
	
	public int getBookCount() {
		return this.bookCount; 
	}
	
	
	
	@Override 
	public List<String> write(){
		return this.bookList; 
	}
	
	@Override 
	public void read(List<String> books) {
		Iterator iterator = books.iterator(); 
		int index = 0;  
		
		while(iterator.hasNext()) { 
			bookList.add(index, iterator.next().toString());
			bookCount++; 
		}
	}
	
	@Override 
	public String toString() {
		String stringOutput = "Reading List " + listName + " has " + bookCount + " books stored:\n";
		
		Iterator iterator = bookList.iterator(); 
		int iteratorLocation = 1; 
		
		while(iterator.hasNext()) {
			stringOutput += iteratorLocation + ": " + iterator.next() + "\n"; 
		}
		
		return stringOutput; 
	}
}
