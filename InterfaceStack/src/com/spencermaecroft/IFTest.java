package com.spencermaecroft;

public class IFTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);

        // Push some numbers onto each stack
        for(int i = 0; i < 5; i++) mystack1.push(i);
        for(int i = 0; i < 8; i++) mystack2.push(i);

        // Pop those values off the stack
        System.out.println("Items within mystack1:");
        mystack1.printStack();

        System.out.println("\nItems within mystack2");
        mystack2.printStack();
    }
}
