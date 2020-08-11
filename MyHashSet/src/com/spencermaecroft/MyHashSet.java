package com.spencermaecroft;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MyHashSet {
    int[] mySet;
    int index = 0;
    /** Initialize your data structure here. */
    public MyHashSet() {
        mySet = new int[10];
    }

    public void add(int key) {
        if(!this.contains(key)){
            if(this.index >= mySet.length -1){
                increaseSetSize();
            }
            //System.out.println("Adding " + key + " at index: " + index);
            mySet[index] = key;
            index++;
        }
    }

    public void increaseSetSize(){
        int[] largerSet = new int[mySet.length * 2];

        for(int i = 0; i < mySet.length; i++){
            largerSet[i] = mySet[i];
        }
        mySet = largerSet;
    }

    public void remove(int key) {
        int[] copySet = new int[mySet.length-1];
        for(int i = 0, k = 0; i < index; i++){
            if(mySet[i] == key){
                index = index -1;
                continue;
            }

            copySet[k++] = mySet[i];
        }
        mySet = copySet;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        for(int i = 0; i < index; i++){
            if(mySet[i] == key){
                return true;
            }
        }
        return false;
    }

    public void printSet(){
        for(int i = 0; i < mySet.length; i++){
            if(i % 10 == 0){
                System.out.println();
            }
            System.out.print(mySet[i] + ", ");
        }
        System.out.println();
    }
}
