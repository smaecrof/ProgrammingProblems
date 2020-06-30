import java.util.ArrayList;
/*
 * Stores the basic information needed for a Customer in a bank application 
 * - Name & Transaction List 
 */
public class Customer {

	private String name; 
	private ArrayList<Double> transactions = new ArrayList<Double>(); 
	
	public Customer(String name, double firstTransaction) {
		this.name = name; 
		this.addTransaction(firstTransaction);
	}
	
	// GETTER METHODS 
	public String getName() {
		return this.name; 
	}
	
	public ArrayList<Double> getAllTransactions(){
		return this.transactions; 
	}
	
	public void addTransaction(double transactionAmt) {
		transactions.add(transactionAmt); 
	}
	
	public void printAllTransactions() {
		for(int i = 0; i < transactions.size(); i++) {
			System.out.println("Transaction #" + (i+1) + " : " + transactions.get(i)); 
		}
	}
	
}
