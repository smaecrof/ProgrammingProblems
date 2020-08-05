package com.spencermaecroft;

import java.util.Scanner;

/**
 * Created by SMC on 08/04/2020
 */
public class Main {
    public static void main(String[] args) {
        /**
         * CHALLENGE OBJECTIVES:
         * - Write a small program to read an integer from the keyboard
         * - Print out the times table for the number (1-12)
         *
         * - We are allowed one Scanner object and we can use as many other variables
         *  as we need but they must all be called x. That includes any class instances
         *  and loop control variables that we may need to have.
         *
         *  - If we decide to use a class, the class must also be called X (CAPITAL), but
         *  any instance of this class must be called x (lowercase)
         *
         *  - Any methods we may possibly make must be called x (lowercase)
         *
         *  EXTRA:
         *  - Change the entire program so that ALL variables including the scanner variable are
         *  called x.
         */
        //ScopeX x = new ScopeX();

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a Number: ");
        X x = new X(scanner.nextInt());
        x.x();
        */

        XX x = new XX(new Scanner(System.in));
        x.x();
    }
}
