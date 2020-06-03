import java.util.ArrayList;

public class MobilePhone {

	private static ArrayList<Contact> contactList = new ArrayList<Contact>(); 
	
	
	public MobilePhone() {
		System.out.println("New Mobile Phone activated");
	}
	
	public void displayOptions() {
			System.out.println("\nPress ");
			System.out.println("0 - To print choice options.\r");
			System.out.println("1 - To print the list of contacts.\r");
			System.out.println("2 - To add a contact.\r");
			System.out.println("3 - To update an existing contact.\r");
			System.out.println("4 - To remove a contact.\r");
			System.out.println("6 - To quit the application.\n");
	}
	
	public void printContactList() {
		if(contactList.size() == 0) {
			return; 
		}
		for(int i = 0; i < contactList.size(); i++) {
			System.out.println("Contact #" + (i + 1) + " :" + contactList.get(i).getName() + 
					" -- " + contactList.get(i).getPhoneNumber());
		}
	}
	
	/*
	 * RETURN 1 (Successfully added Contact obj. to list)
	 *        0 (Could not add Contact obj. to list)
	 */
	public int addContact(Contact contact) {
		if(contactList.contains(contact)) {
			return 0; 
		} else {
			contactList.add(contact);
			return 1; 
		}
	}
	
	/*
	 * RETURN: 1 (Successful update to contact in list)
	 * 		   0 (Contact was not updated)
	 */
	public int updateContact(Contact oldContact, Contact newContact) {
		if(contactList.contains(oldContact)) {
			int oldContactLocation = contactList.indexOf(oldContact);
			contactList.add(oldContactLocation, newContact);
			return 1;
		} 
		return 0; 
	}
	
	/*
	 * RETURN: 1 (Successful removal of Contact Obj. 
	 * 		   0 (Contact was not removed) 
	 */
	public int removeContact(Contact contact) {
		if(contactList.contains(contact)) {
			contactList.remove(contact);
			return 1; 
		} else {
			return 0;  
		}
	}
	
	/*
	 * RETURN: Index location of the Contact obj.
	 * 		   -1 (Contact was not found) 
	 */
	public int findContact(String contactName) {
		
		for(int i = 0; i < contactList.size(); i++) {
			Contact contact = contactList.get(i); 
			if(contact.getName().equals(contactName)) {
				return i; 
			}
		}
		
		return -1; 
	}
	
	public int findContact(Contact contact) {
		return this.contactList.indexOf(contact);
	}
	
	public String queryContact(Contact contact) {
		if(findContact(contact) >= 0) {
			return contact.getName();
		}
		return null; 
	}
	
	public Contact queryContact(String contactName) {
		int position = findContact(contactName); 
		if(position >= 0) {
			return this.contactList.get(position); 
		}
		return null; 
	}
	
	
}
