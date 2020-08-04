package com.spencermaecroft;

public class Main {

    public static void main(String[] args) {

        Series series = new Series();

        for(int i = 0; i < 5; i++){
            System.out.println("nSum(" + i + ") = " + series.nSum(i));
            System.out.println("factorial(" + i + ") = " + series.factorial(i));
            System.out.println("fibonacci(" + i + ") = " + series.fibonacci(i));
            System.out.println();
        }
    }
}
