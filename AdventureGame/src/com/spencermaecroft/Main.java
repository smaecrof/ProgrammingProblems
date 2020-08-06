package com.spencermaecroft;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by SMC on 08/06/2020
 */
public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer,Location>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0,"You are still in front of a computer learning java"));
        locations.put(1, new Location(1,"You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("N",5);
        locations.get(1).addExit("E",3);
        locations.get(1).addExit("S",4);
        locations.get(1).addExit("W",2);

        locations.get(2).addExit("N",5);

        locations.get(3).addExit("W",1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W",2);

        locations.get(5).addExit("S",1);
        locations.get(5).addExit("W",2);



        int loc = 1;
        while(true){
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0){
                break;
            }

            Map<String,Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for(String exit: exits.keySet()){
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();

            if(exits.containsKey(direction)){
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }

            if(!locations.containsKey(loc)){
                System.out.println("You cannot go in that direction");
            }
        }

    }

    public static void printMap(Map<String, Integer> map){
       for(Map.Entry<String,Integer> entry: map.entrySet()){
           System.out.println("Direction " + entry.getKey() + ", Location " + entry.getValue());
       }
       System.out.println("\n");
    }
}
