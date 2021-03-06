package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Window;
import sample.datamodel.Contact;
import sample.datamodel.ContactData;

import java.io.IOException;
import java.util.Optional;

/**
 * Created by SMC on 09/24/2020
 */
public class Controller {

    @FXML
    private BorderPane mainPanel;

    @FXML
    private TableView<Contact> contactsTable;

    private ContactData data;

    public void initialize(){
        data = new ContactData();
        data.loadContacts();
        contactsTable.setItems(data.getContacts());
    }

    /**
     * - All methods here should be tested for such actions such as
     *    * Adding a new contact with missing required information
     *    * Editing a card with missing information
     */
    @FXML
    public void showAddContactDialog(){
        Dialog<ButtonType> dialog = new Dialog<ButtonType>();
        dialog.initOwner(mainPanel.getScene().getWindow());
        dialog.setTitle("Add New Contact");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("contactdialog.fxml"));

        try {
            dialog.getDialogPane().setContent((fxmlLoader.load()));
        } catch (IOException e){
            System.out.println("Couldn't load the dialog");
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
        Window window = dialog.getDialogPane().getScene().getWindow();
        window.setOnCloseRequest(event -> window.hide());

        Optional<ButtonType> result = dialog.showAndWait();

        handleAddContactResult(result, fxmlLoader, dialog,window);
    }

    private void handleAddContactResult(Optional<ButtonType> result, FXMLLoader fxmlLoader,
                                        Dialog<ButtonType> dialog, Window window){

        if(result.isPresent() && result.get() == ButtonType.OK){
            ContactController contactController = fxmlLoader.getController();
            Contact newContact = contactController.getNewContact();


            // Handles the case where required data is not inputted into the dialog FXML
            while(newContact == null){
                //createInformationAlert("Blank Entries", "Please Fill in blank entries");
                contactController.setWarningLabelVisibleTrue();
                result = dialog.showAndWait();
                newContact = contactController.getNewContact();


                if(result.get() == ButtonType.CANCEL){
                    return;
                }
            }

            contactController.setWarningLabelVisibleFalse();

            data.addContact(newContact);
            /* ***** RESOURCE HEAVY ******8
            - Below we are saving the entire list of contacts every single time a single contact
            is added to our data.
            - Try to implement this differently so that only new data is added maybe to a buffer
            which is then periodically added to main storage...
             */
            data.saveContacts();
        }
    }

    @FXML
    public void showEditContactDialog(){
        Contact selectedContact = contactsTable.getSelectionModel().getSelectedItem();
        if(selectedContact == null){
            createInformationAlert("No Contact selected",
                    "Please select the contact you want to edit");
            return;
        }

        Dialog<ButtonType> dialog = new Dialog<ButtonType>();
        dialog.initOwner(mainPanel.getScene().getWindow());
        dialog.setTitle("Edit Contact");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("contactdialog.fxml"));

        try {
            dialog.getDialogPane().setContent((fxmlLoader.load()));
        } catch (IOException e){
            System.out.println("Couldn't load the dialog");
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        ContactController contactController = fxmlLoader.getController();
        contactController.editContact(selectedContact);
        Optional<ButtonType> result = dialog.showAndWait();

        handleEditResult(result, fxmlLoader, dialog, selectedContact);
    }

    private void handleEditResult(Optional<ButtonType> result, FXMLLoader fxmlLoader,
                                  Dialog<ButtonType> dialog, Contact selectedContact) {

        ContactController contactController = fxmlLoader.getController();

        if (result.isPresent() && result.get() == ButtonType.OK) {
            // Returns false if required fields are empty (true if everything worked)
            boolean updateResult = contactController.updateContact(selectedContact);

            while (updateResult == false) {
                contactController.setWarningLabelVisibleTrue();
                //contactController.editContact(selectedContact);

                result = dialog.showAndWait();
                if(result.get() == ButtonType.CANCEL){
                   return;
                }
                updateResult = contactController.updateContact(selectedContact);

            }
            data.saveContacts();
        }
    }

    @FXML
    public void showDeleteAlert(){
        Contact selectedContact = contactsTable.getSelectionModel().getSelectedItem();

        if(selectedContact == null){
            createInformationAlert("No contact selected",
                    "Please select the contact you want to edit");
            return;
        }

        // If this gets used again, create a new private method
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirm Contact Deletion");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to delete " +
                            selectedContact.getFirstName() +
                            " from your contacts?");

        Optional<ButtonType> result = alert.showAndWait();

        if(result.isPresent() && result.get() == ButtonType.OK){
            data.deleteContact(selectedContact);
            data.saveContacts();
        }
        return;
    }

    private void createInformationAlert(String title, String contentText){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(contentText);
        alert.showAndWait();
        return;
    }
}
