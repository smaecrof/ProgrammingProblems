package com.spencermaecroft;

/**
 * Created by SMC on 08/04/2020
 */
public class Series {

    public Series(){

    }
    public static int nSum(int n){
        int totalSum = 0;
        for(int i = 0; i <= n; i++){
            totalSum += i;
        }
        return totalSum;
    }

    public static int factorial(int n){
        if(n <= 2) {
            return n;
        } else{
            return (n * factorial(n-1));
        }
    }

    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
