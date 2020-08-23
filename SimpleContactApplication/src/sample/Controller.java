package sample;

import contactData.Contact;
import contactData.ContactData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Contact> contactList;

    @FXML private TableView<Contact> tableView;
    @FXML private TableColumn<Contact, String> firstNameCol;
    @FXML private TableColumn<Contact, String> lastNameCol;
    @FXML private TableColumn<Contact, String> phoneNumberCol;
    @FXML private TableColumn<Contact, String> notesCol;


    public void initialize(){

        Contact spencer = new Contact("Spencer", "Mae-Croft", "5749333833", "MFCEO");
        Contact elise = new Contact("Elise", "Patrick", "5749333543", "Doctor");

        ContactData.getInstance().addContact(spencer);
        ContactData.getInstance().addContact(elise);



        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        phoneNumberCol.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        notesCol.setCellValueFactory(new PropertyValueFactory<>("contactNotes"));
        tableView.setItems(ContactData.getInstance().getContacts());
    }
}
