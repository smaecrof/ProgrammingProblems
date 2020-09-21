package com.spencermaecroft;

public class IFTest3 {
    public static void main(String[] args) {
        IntStack myStack;
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        myStack = ds;
        // Push some numbers onto the stack
        for(int i = 0; i < 12; i++) myStack.push(i);

        myStack = fs;
        for(int i = 0; i < 5; i++) myStack.push(i);

        myStack = ds;
        System.out.println("Items in ds:");
        myStack.printStack();

        myStack = fs;
        System.out.println("\nItems in fs:");
        myStack.printStack();
    }
}
