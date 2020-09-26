package sample.datamodel;

import javafx.beans.property.SimpleStringProperty;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by SMC on 09/26/2020
 */
public class Card {
    private SimpleStringProperty frontSideString = new SimpleStringProperty("");
    private SimpleStringProperty backsideString = new SimpleStringProperty("");
    private Date dateCreated;

    public Card(){
        // No implementation yet
    }

    public Card(String fString, String bString){
        frontSideString.set(fString);
        backsideString.set(bString);
        dateCreated = new Date();
    }

    public String getFrontSideCard(){
        return frontSideString.get();
    }

    public String getBacksideString(){
        return backsideString.get();
    }

    public void setFrontSideString(String fString){
        frontSideString.set(fString);
    }

    public void setBacksideString(String bString){
        backsideString.set(bString);
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    @Override
    public String toString(){
        return "Card{" +
                "Frontside: " + frontSideString +
                "Backside: " + backsideString +
                "Create on: " + dateCreated +
                "}";
    }
}
