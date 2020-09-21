package com.spencermaecroft;

public class FixedStack implements IntStack{
    private int stack[];
    private int tos;

    FixedStack(int size){
        stack = new int[size];
        tos = -1;
    }

    // Push an item onto the stack
    public void push(int item){
        if(tos == stack.length-1){
            System.out.println("Stack is full");
        } else {
            stack[++tos] = item;
        }
    }

    // Pop item from the stack
    public int pop(){
        if(tos < 0){
            System.out.println("Stack is empty");
            return 0;
        } else {
            return stack[tos--];
        }
    }

    public void printStack(){
        for(int i = 0; i < stack.length; i++){
            System.out.print(stack[i] + ", ");
        }
    }
}
