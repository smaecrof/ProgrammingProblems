package com.spencermaecroft;

import java.util.Scanner;

public class ScopeX {
    private Scanner scanner = new Scanner(System.in);
    public static int x;

    public ScopeX(){
        System.out.println("Enter an integer:");
        x = scanner.nextInt();
        X x = new X();
    }

    class X{
        public int x = 0;
        public X(){
            for(this.x = 0; this.x < 12; this.x++){
                System.out.println(this.x * ScopeX.x);
            }
        }
    }
}
