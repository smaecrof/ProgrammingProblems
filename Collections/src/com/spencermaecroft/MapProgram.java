package com.spencermaecroft;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SMC on 08/06/2020
 */
public class MapProgram {

    public static void main(String[] args) {
        Map<String,String> languages = new HashMap<>();
        languages.put("Java", "A compiled high level, object-oriented, platform independent language");
        languages.put("Python", "An interpreted, object-oriented, high-level programming languages with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "Java is a great language");
        }

        System.out.println("================================");

//        languages.remove("Lisp");
        if(languages.remove("Algol", "a family of algorithmic languages")){
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        if(languages.replace("Lisp", "This will not work", "A functional programming language with imperative features")){
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced"); 
        }
        System.out.println(languages.replace("Scala", "This will not be added"));

        for(String key: languages.keySet()){
            System.out.println(key + ": " + languages.get(key));
        }



    }
}
