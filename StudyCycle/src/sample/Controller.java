package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

import java.util.IdentityHashMap;

/**
 * Created by SMC on 09/26/2020
 */
public class Controller {

    private static final String HOVERED_BUTTON_STYLE = "-fx-background-color: rgb(30, 63, 32)";
    private static final String IDLE_BUTTON_STYLE = "-fx-background-color: rgb(52,88,48)";
    @FXML
    private Button decksBtn, addBtn, browseBtn, statsBtn;

    @FXML
    private BorderPane mainPanel;

    public void initialize(){
        decksBtn.setStyle(HOVERED_BUTTON_STYLE);

        decksBtn.setOnMouseEntered(event -> {
            decksBtn.setStyle(HOVERED_BUTTON_STYLE);
        });
        decksBtn.setOnMouseExited(event -> {
            decksBtn.setStyle(IDLE_BUTTON_STYLE);
        });

        addBtn.setOnMouseEntered(event ->{
            decksBtn.setStyle(IDLE_BUTTON_STYLE);
            addBtn.setStyle(HOVERED_BUTTON_STYLE);
        });
        addBtn.setOnMouseExited(event -> {
            addBtn.setStyle(IDLE_BUTTON_STYLE);
        });

        browseBtn.setOnMouseEntered(event -> {
            browseBtn.setStyle(HOVERED_BUTTON_STYLE);
        });
        browseBtn.setOnMouseExited(event -> {
            browseBtn.setStyle(IDLE_BUTTON_STYLE);
        });

        statsBtn.setOnMouseEntered(event -> {
            statsBtn.setStyle(HOVERED_BUTTON_STYLE);
        });
        statsBtn.setOnMouseExited(event -> {
            statsBtn.setStyle(IDLE_BUTTON_STYLE); 
        });
    }
}
