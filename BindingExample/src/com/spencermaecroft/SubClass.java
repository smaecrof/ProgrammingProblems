package com.spencermaecroft;

public class SubClass extends SuperClass{

    public SubClass(){
        System.out.println("Initializing Subclass()");
    }

   static void print(){
        System.out.println("Printing from subClass()");
    }
}
