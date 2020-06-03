/*
 * Contact class for a mobile phone application
 * Created by SMC on 05/28/2020
 */
public class Contact {
	private String name; 
	private String phoneNumber;
	
	public Contact(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public static Contact createContact(String name, String number) {
		return new Contact(name,number); 
	}
}
