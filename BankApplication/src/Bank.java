import java.util.ArrayList;
/*
 * Stores the basic banking information for a bank location 
 */
public class Bank {

	private String bankName; 
	private ArrayList<Branch> branches = new ArrayList<Branch>();
	
	public Bank(String name) {
		this.bankName = name; 
	}
	
	public void addBranch(String newBranchName) {
		branches.add(new Branch(newBranchName)); 
	}
	
	private Branch findBranch(String branchName) {
		for(int i = 0; i < branches.size(); i++) {
			Branch tempBranch = branches.get(i); 
			if(tempBranch.getName().contentEquals(branchName)) {
				return tempBranch; 
			}
		}

		return null;  // Branch not found 
	}
	
	public void addCustomerToBranch(String branchName, String customerName, double firstTransactionAmt) {		
		Branch tempBranch = findBranch(branchName); 
		if(tempBranch != null) {
			tempBranch.addCustomer(customerName, firstTransactionAmt);
		}
	}
	
	public void addCurrentCustomerTransaction(String branchName, String customerName, double newTransactionAmt) {
		Branch tempBranch = findBranch(branchName); 
		if(tempBranch != null) {
			tempBranch.addCustomerTransaction(customerName, newTransactionAmt);
		}
	}
	
	public void printBranchCustomers(String branchName) {
		Branch tempBranch = findBranch(branchName); 
		if(tempBranch != null) {
			tempBranch.printBranchCustomers();
		}
	}
	
	public void printBranchCustomersAndTransactions(String branchName) {
		/*
		if(this.hasBranch(branchName) == false) {
			System.out.println("Error 101: Branch not found"); 
		}
		
		int branchIndex = this.getBranchIndex(branchName); 
		Branch tempBranch = branches.get(branchIndex); 
		
		ArrayList<Customer> tempCustomerList = tempBranch.getAllBranchCustomers(); 
		
		for(int i = 0; i < tempCustomerList.size(); i++) {
			System.out.println("Customer: " + tempCustomerList.get(i).getName()); 
			System.out.println("Transactions: "); 
			tempCustomerList.get(i).printAllTransactions();
			System.out.println(); 
		}
		*/
		Branch tempBranch = findBranch(branchName); 
		
		if(tempBranch == null) {
			return; 
		}
		
		ArrayList<Customer> branchCustomers = tempBranch.getAllBranchCustomers(); 
		
		for(int i = 0; i < branchCustomers.size(); i++) {
			Customer customer = branchCustomers.get(i); 
			
			System.out.println(customer.getName()); 
			customer.printAllTransactions();
			System.out.println(); 
		}
		
	}
}
