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

        int loc = 1;
        while(true){
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0){
                break;
            }

            loc = scanner.nextInt();
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
