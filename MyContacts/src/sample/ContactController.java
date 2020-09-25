package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import sample.datamodel.Contact;

/**
 * Created by SMC on 09/24/2020
 */
public class ContactController {

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField phoneNumberField;

    @FXML
    private TextField notesField;

    public Contact getNewContact(){
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String phoneNumber = phoneNumberField.getText();
        String notes = notesField.getText();

        /* **** ADD INPUT VALIDATION HERE *****
        - Check that input is valid
        - (Optional) only allow "OK" button to work if the input is valid
        - Also maybe the "Notes" textfield should be made optional
        */

        Contact newContact = new Contact(firstName,lastName,phoneNumber,notes);
        return newContact;
    }

    public void editContact(Contact contact){
        firstNameField.setText(contact.getFirstName());
        lastNameField.setText(contact.getLastName());
        phoneNumberField.setText(contact.getPhoneNumber());
        notesField.setText(contact.getNotes());
    }

    public void updateContact(Contact contact){
        contact.setFirstName(firstNameField.getText());
        contact.setLastName(lastNameField.getText());
        contact.setPhoneNumber(phoneNumberField.getText());
        contact.setNotes(notesField.getText());
    }
}
