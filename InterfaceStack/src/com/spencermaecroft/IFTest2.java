package com.spencermaecroft;

public class IFTest2 {
    public static void main(String[] args) {
        DynStack dynStack1 = new DynStack(5);
        DynStack dynStack2 = new DynStack(8);

        // Populate the stacks
        for(int i = 0; i < 5; i++) dynStack1.push(i);
        for(int i = 0; i < 10; i++) dynStack2.push(i);

        // Pop items off of the stack
        System.out.println("DynStack1 Items:");
        for(int i = 0; i < 5; i++){
            System.out.print(i + ", ");
        }

        System.out.println("\nDynStack2 Items:");
        for(int i = 0; i < 10; i++){
            System.out.print(i + ", ");
        }
    }
}
