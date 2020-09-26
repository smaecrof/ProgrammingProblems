package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

/**
 * Created by SMC on 09/26/2020
 */
public class Controller {

    @FXML
    private Button decksBtn, addBtn, browseBtn, statsBtn;

    @FXML
    private BorderPane mainPanel;

    public void initialize(){
        decksBtn.setStyle("-fx-background-color: rgb(30, 63, 32)");
    }
}
