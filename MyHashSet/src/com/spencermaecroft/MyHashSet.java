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
            if(this.index >= mySet.length -5){
                increaseSetSize();
            }
            //System.out.println("Adding " + key + " at index: " + index);
            mySet[index] = key;
            index++;
        }
    }

    public void increaseSetSize(){
        int newSize = mySet.length + 10;
        int[] largerSet = new int[newSize];

        for(int i = 0; i < mySet.length; i++){
            largerSet[i] = mySet[i];
        }
        mySet = largerSet;
    }

    /**
     * This operation is costly as I build a new int[] array and then start
     * initializing it before I even know if the set contains the
     *
     */
    public void remove(int key) {
        int[] copySet;
        if(this.contains(key)) {
            copySet = new int[mySet.length];
            for (int i = 0, k = 0; i <= index; i++) {
                if (mySet[i] == key) {
                    index = index - 1;
                    continue;
                }
                copySet[k++] = mySet[i];
            }
            mySet = copySet;
        }
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

    public int[] getCleanSet(){
        int[] cleanSet = new int[this.index];
        for(int i = 0, k = 0; i < index; i++){
            cleanSet[k++] = mySet[i];
        }
        return cleanSet;
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
