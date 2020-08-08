package com.spencermaecroft;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by SMC on 08/06/2020
 */
public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer,Location>();
    private static Map<String, String> directionalWords = new HashMap<String,String>();
    private static Scanner scanner = new Scanner(System.in);
    private static Map<String,Integer> exits = new HashMap<String,Integer>();
    private static String[] userInput;
    private static String currentDirectionString;
    private static int location = 1;

    public static void main(String[] args) {
        locations.put(0, new Location(0,"You are still in front of a computer learning java"));
        locations.put(1, new Location(1,"You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 2);

        tempExit.put("E",3);
        tempExit.put("S",4);
        tempExit.put("N",5);

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N",5);

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W",1);

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 1);
        tempExit.put("W",2);

        tempExit = new HashMap<String, Integer>();
        tempExit.put("S",1);
        tempExit.put("W",2);

        // Adding words for directional Mapping
        directionalWords.put("NORTH","N");
        directionalWords.put("EAST","E");
        directionalWords.put("SOUTH","S");
        directionalWords.put("WEST","W");
        directionalWords.put("QUIT", "Q");

        startAdventure();
    }

    public static void startAdventure(){
        while(true){
            setAndPrintCurrentDirectionString();
            if(location == 0){
                return;
            }
            printLocationExits();
            formatUserInput();
            currentDirectionString = processUserInput(userInput);
            setLocation();
        }
    }

    public static void formatUserInput(){
        userInput = scanner.nextLine().toUpperCase().split(" ");
    }

    public static String processUserInput(String[] userInput){
        //Single letter processing
        if(userInput.length == 1 && userInput[0].length() == 1){
            return userInput[0];
        }

        // Multiple word processing
        for(String word: userInput){
            if(directionalWords.containsKey(word)){
                return directionalWords.get(word);
            }
        }
        return null;
    }

    public static void setAndPrintCurrentDirectionString(){
        currentDirectionString = locations.get(location).getDescription();
        System.out.println(currentDirectionString);
    }

    public static void setLocation(){
        if(exits.containsKey(currentDirectionString)){
            location = exits.get(currentDirectionString);
        } else {
            System.out.println("You cannot go in that direction");
        }

        if(!locations.containsKey(location)){
            System.out.println("You cannot go in that direction");
        }
    }

    public static void printLocationExits(){
        exits = locations.get(location).getExits();
        System.out.print("Available exits are ");
        for(String exit: exits.keySet()){
            System.out.print(exit + ", ");
        }
        System.out.println("\nEnter a move below: ");
    }

    // NOT IMPLEMENTED (SHOULD NOT BE IMPLEMENTED)
    // It would be super cool if instead of simply printing out the map keys and values, This function actually
    // created a character map on the screen such as:
    //      -----------------               ---------------------
    //      |               |               |                   |
    //      |     HOME      | ------------->|      Factory      |
    //      |               |               |                   |
    //      -----------------               ---------------------
    public static void printMap(Map<String, Integer> map){
       for(Map.Entry<String,Integer> entry: map.entrySet()){
           System.out.println("Direction " + entry.getKey() + ", Location " + entry.getValue());
       }
       System.out.println("\n");
    }
}
