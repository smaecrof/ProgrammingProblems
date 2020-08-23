package contactData;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    public String contactNotes;

    public Contact(String firstName, String lastName, String phoneNumber, String contactNotes) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.contactNotes = contactNotes;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getNotes() {
        return contactNotes;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setContactNotes(String contactNotes) {
        this.contactNotes = contactNotes;
    }

    @Override
    public String toString() {
        return this.firstName;
    }
}
