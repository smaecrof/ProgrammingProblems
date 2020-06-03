import java.util.Scanner;

public class MobileMain {

	private static Scanner scanner = new Scanner(System.in); 
	private static MobilePhone myMobile = new MobilePhone(); 
	
	public static void main(String[] args) {
	
		
		int userChoice = 1; 
		
		while(userChoice != 6) {
			myMobile.displayOptions();
			
			//Read User Input
			userChoice = scanner.nextInt(); 
			scanner.nextLine(); 
			
			switch(userChoice) {
				case 0:
					myMobile.displayOptions();
					break;
				case 1:
					myMobile.printContactList();
					break; 
				case 2:
					addContact(); 
					break;
				case 3:
					updateContact();
					break;
				case 4: 
					removeContact();
					break;
				case 6:
					break; 
				default:
					continue;
			}
		}
	}
	
	public static void addContact() {
		String contactName;
		String contactNumber; 
		int result; 
		
		System.out.println("New Contact Name: ");
		contactName = scanner.nextLine();
		
		System.out.println("New Contact Number: "); 
		contactNumber = scanner.nextLine(); 
		
		result = myMobile.addContact(new Contact(contactName, contactNumber));
		
		if(result == 1) {
			System.out.println("Contact was successfully added");
		} 
		
		if(result == 0) {
			System.out.println("Contact wasn't able to be added"); 
		}
	}
	
	
	public static void updateContact() {
		System.out.println("Enter existing contact name:");
		String name = scanner.nextLine(); 
		Contact existingContact = myMobile.queryContact(name); 
		
		if(existingContact == null) {
			System.out.println("Contact not found");
			return; 
		}
		
		System.out.println("Enter new contact name");
		String newName = scanner.nextLine(); 
		System.out.println("Enter new contact phone number:");
		String newNumber = scanner.nextLine(); 
		Contact newContact = Contact.createContact(newName, newNumber); 
		
		if(myMobile.updateContact(existingContact, newContact) == 1) {
			System.out.println("Successfully updated record"); 
		} else {
			System.out.println("Error updating record"); 
		}
	}
	
	public static void removeContact() {
		System.out.println("Enter the name of the contact to remove:");
		String contactName = scanner.nextLine(); 
		
		Contact existingContact = myMobile.queryContact(contactName); 
		int removeReturn = myMobile.removeContact(existingContact);
		
		if(removeReturn == 1) {
			System.out.println("Successfully removed the contact"); 
			return; 
		} else {
			System.out.println("Error removing contact");
			return; 
		}
		
	}

}
