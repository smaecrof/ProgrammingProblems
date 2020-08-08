package com.spencermaecroft;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SMC on 08/06/2020
 */
public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String,Integer> exits){
        this.locationID = locationID;
        this.description = description;
        this.exits = exits;
        exits.put("Q",0); // Each location needs to have a quit program option
    }

//    public void addExit(String direction, int location){
//        exits.put(direction,location);
//    }
    public int getLocationID(){
        return this.locationID;
    }

    public String getDescription(){
        return this.description;
    }

    public Map<String,Integer> getExits(){
        // Returning a copy so that there cannot be an outside influence on this class
        return new HashMap<String, Integer>(exits);
    }
}
