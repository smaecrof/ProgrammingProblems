
public class Main {
	
	public static void main(String[] args) {
		Bank bank1 = new Bank("First Federal Bank"); 
		String branchName = "Lake City";
		
		bank1.addBranch(branchName); 
		bank1.addCustomerToBranch(branchName, "Spencer Mae-Croft",23.99);
		bank1.addCustomerToBranch(branchName, "Elise Patrick", 52.34);
		bank1.addCurrentCustomerTransaction(branchName, "Spencer Mae-Croft", 16.99);
		
		bank1.printBranchCustomers(branchName); 
		System.out.println("-----------------------"); 
		bank1.printBranchCustomersAndTransactions(branchName); 
	}
}
