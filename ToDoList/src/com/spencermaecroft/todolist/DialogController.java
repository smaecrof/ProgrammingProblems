package com.spencermaecroft.todolist;

import dataModel.TodoData;
import dataModel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

/**
 * Created by SMC on 08/17/2020
 */
public class DialogController {
    @FXML
    private TextField shortDescriptionField;

    @FXML
    private TextArea detailsArea;

    @FXML
    private DatePicker deadlinePicker;

    public TodoItem processResults(){
        String shortDescription = shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadlineValue = deadlinePicker.getValue();


        // Empty input would crash the application
        if(shortDescription != "" && details != "" && deadlineValue != null){
            TodoItem newItem = new TodoItem(shortDescription, details, deadlineValue);
            TodoData.getInstance().addTodoItem(newItem);
            return newItem;
        }
        return null;
    }


}
