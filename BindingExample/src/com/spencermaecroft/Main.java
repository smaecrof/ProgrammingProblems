package com.spencermaecroft;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

public class Main {

    public static void main(String[] args) {
//        SuperClass obj1 = new SuperClass();
//        SuperClass obj2 = new SubClass();
//
//        obj1.print();
//        obj2.print();

        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        Set<Integer> unionSet = new HashSet<Integer>();
        Set<Integer> interSet = new HashSet<Integer>();

        set1.add(1);
        set1.add(3);
        set1.add(5);
        set1.add(7);

        set2.add(2);
        set2.add(4);
        set2.add(5);
        set2.add(8);

        unionSet.addAll(set1);
        unionSet.addAll(set2);

        interSet.addAll(set1);
        interSet.retainAll(set2);

        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        System.out.println("Union Set: " + unionSet);
        System.out.println("Intersection set: " + interSet);


    }
}
