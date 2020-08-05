package com.spencermaecroft;

import java.util.Scanner;

public class XX {
    private int x;

    public XX(Scanner x){
        System.out.println("Enter a number: ");
        this.x = x.nextInt();
    }

    public void x(){
        for(int x = 0; x < 13; x++){
            System.out.println(x + " times " + this.x + " equals " + x * this.x);
        }
    }
}
