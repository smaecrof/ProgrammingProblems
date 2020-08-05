package com.spencermaecroft;

public class Main {

    public static void main(String[] args) {

//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("Two");
//        SomeClass three = new SomeClass("Three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
//        System.out.println(Math.PI);
//
//        Password myPassword = new ExtendedPassword(747383);
//        myPassword.storePassword();
//
//        myPassword.letMeIn(747383);
//
//        myPassword.letMeIn(34);
//        myPassword.letMeIn(-334);

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner); 
    }
}
