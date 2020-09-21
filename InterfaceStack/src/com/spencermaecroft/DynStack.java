package com.spencermaecroft;

import java.util.Stack;

/*
- Creates a dynamically resized Integer Stack
 */
public class DynStack implements IntStack{
    private int stack[];
    private int tos;

    // Allocate memory to the internal list
    DynStack(int size){
        stack = new int[size];
        tos = -1;
    }

    // Push item onto the stack
    public void push(int item){
        if(tos == stack.length-1){
            // Resize array and add the item to be pushed
            int[] newStack = new int[stack.length * 2];

            for(int i = 0; i < stack.length-1; i++) newStack[i] = stack[i];
            stack = newStack;
        }
        stack[++tos] = item;
    }

    // Pop item off of the stack
    public int pop(){
        if(tos < 0){
            System.out.println("Stack is empty");
            return 0;
        } else{
            return stack[tos--];
        }
    }

    // Print Stack
    public void printStack(){
        for(int i = 0; i < stack.length; i++){
            System.out.print(stack[i] + ", ");
        }
    }

}
