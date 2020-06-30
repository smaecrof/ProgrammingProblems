import java.util.ArrayList;

/*
 * A Branch Object contains Customers and can be used to get customer information 
 */
public class Branch {

	private String branchName; 
	private ArrayList<Customer> customersList = new ArrayList<Customer>(); 
	
	public Branch(String name) {
		this.branchName = name; 
	}
	
	public String getName() {
		return this.branchName;
	}
	
	public ArrayList<Customer> getAllBranchCustomers(){
		return this.customersList; 
	}
	
	
	public void addCustomer(String name, double firstTransactionAmt) {
		if(findCustomer(name) == null) {
			customersList.add(new Customer(name, firstTransactionAmt)); 
			System.out.println(name + " added successfully"); 
		}
		// Customer was not added 
		System.out.println("Error: Customer already exists"); 
		 
	}
	
	public void addCustomerTransaction(String currentCustomerName, double newTransaction) {
		Customer tempCustomer = findCustomer(currentCustomerName); 
		if(tempCustomer != null) {
			tempCustomer.addTransaction(newTransaction);
		}
	}
	
	private Customer findCustomer(String customerName) {
		for(int i = 0; i < customersList.size(); i++) {
			Customer tempCustomer = customersList.get(i); 
			if(tempCustomer.getName().contentEquals(customerName)) {
				return tempCustomer; 
			}
		}
		return null; 
	}
	
	public void printBranchCustomers() {
		
		System.out.println("Branch " + this.getName() + " customers: "); 
		for(int i = 0; i < this.customersList.size(); i++) {
			System.out.println(customersList.get(i).getName()); 
		}
	}
}
