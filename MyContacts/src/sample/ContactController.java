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

        if (hasRequiredFields()){
            // Makes "notes" field optional
            if(notesField.getLength() == 0){
                notes = " ";
            }

            Contact newContact = new Contact(firstName,lastName,phoneNumber,notes);
            return newContact;
        }
        return null;
    }

    private boolean hasRequiredFields(){
        return (firstNameField.getLength() > 0 && lastNameField.getLength() > 0 &&
            phoneNumberField.getLength() > 0);
    }

    public void editContact(Contact contact){
        firstNameField.setText(contact.getFirstName());
        lastNameField.setText(contact.getLastName());
        phoneNumberField.setText(contact.getPhoneNumber());
        notesField.setText(contact.getNotes());
    }

    public boolean updateContact(Contact contact){
        if(hasRequiredFields()){
            contact.setFirstName(firstNameField.getText());
            contact.setLastName(lastNameField.getText());
            contact.setPhoneNumber(phoneNumberField.getText());
            contact.setNotes(notesField.getText().strip());
            return true;
        }
        return false;
    }
}
